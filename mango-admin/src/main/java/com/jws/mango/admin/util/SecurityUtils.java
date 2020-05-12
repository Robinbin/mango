package com.jws.mango.admin.util;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public abstract class SecurityUtils {
    public static void checkAuthentication(HttpServletRequest request) {
        Authentication authentication = JwtTokenUtils.getAuthenticationFromToken(request);

    }

    public static Authentication getAuthentication() {
    }
}
