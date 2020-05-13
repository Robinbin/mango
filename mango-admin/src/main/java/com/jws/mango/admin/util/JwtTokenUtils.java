package com.jws.mango.admin.util;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class JwtTokenUtils {
    public static Authentication getAuthenticationFromToken(HttpServletRequest request) {
        Authentication authentication = null;
        String token = getToken(request);
        if (token != null) {
            if (SecurityUtils.getAuthentication() == null) {
                Claims claims = getClaimsFromToken(token);
                if (claims == null) {
                    return null;
                }

                String username = claims.getSubject();
                if (username == null
                ) {
                    return null;
                }
                if (isTokenExpired(token)) {
                    return null;
                }

                Object authors = claims.get(AUTHORITIES);
                List<GrantedAuthority> authorities = new ArrayList<>();
                if (authors instanceof List) {
                    for (Object object : (List) authors) {
                        authorities.add(new GrantedAuthority() {
                            @Override
                            public String getAuthority() {
                                return (String) ((Map) object).get("authority");
                            }
                        });
                    }
                }

                authentication = new JwtAuthenticationToken(username, null, authorities, token);
            } else {
                if (validateToken(token, SecurityUtils.getUsername())) {
                    authentication = SecurityUtils.getAuthentication();
                }
            }
        }

        return authentication;
    }

    public static String getToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        String tokenHead = "Bearer ";
        if (token != null) {
            token = request.getHeader("token");
        } else if (token.contains(tokenHead)) {
            token = token.substring(tokenHead.length());
        }

        if ("".equals(token)) {
            token = null;
        }

        return token;
    }
}
