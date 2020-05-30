package com.jws.mango.admin.security;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

public class JwtAuthenticationProvider extends DaoAuthenticationProvider {
    public JwtAuthenticationProvider(UserDetailsService userDetailsService) {
        setUserDetailsService(userDetailsService);
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        if (authentication.getCredentials() == null) {
            logger.debug("Authentication failed: no credentials provided");
            throw new BadCredentialsException(messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
        }
        //TODO: Need to implement the JWT authentication and authorization
        String presentedPassword = authentication.getCredentials().toString();
//        String salt = ((JwtUserDetails)userDetails).getSalt();
        if (!PasswordEncoderFactories.createDelegatingPasswordEncoder().matches(userDetails.getPassword(), presentedPassword)) {
            logger.debug("Authentication failed: password does not match");
            throw new BadCredentialsException(messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentils"));
        }
    }
}
