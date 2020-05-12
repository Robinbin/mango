package com.jws.mango.admin.util;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public abstract class JwtTokenUtils {
    public static Authentication getAuthenticationFromToken(HttpServletRequest request) {
        Authentication authentication= null;
        String token = getToken(request);
        if(token != null){
            if (SecurityUtils.getAuthentication() == null) {
                Claims claims = getClaimsFromToken(token);
            }
        }
    }

    public static String getToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        String tokenHead = "Bearer ";
        if(token != null){
            token = request.getHeader("token");
        } else if(token.contains(tokenHead)) {
            token = token.substring(tokenHead.length());
        }

        if("".equals(token)) {
            token = null;
        }

        return token;
    }
}
