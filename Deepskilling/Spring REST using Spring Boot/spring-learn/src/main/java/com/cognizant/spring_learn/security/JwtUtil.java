package com.cognizant.spring_learn.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtil {

    // In a real application, this key would come from a secure config/secret store,
    // not be hardcoded - kept simple here for learning purposes.
    private final SecretKey key = Keys.hmacShaKeyFor(
            "ThisIsASecretKeyForJWTSigningPurposesOnly123456".getBytes());

    public String generateToken(String username) {
        long now = System.currentTimeMillis();
        long expiryMillis = now + (20 * 60 * 1000); // 20 minutes

        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date(now))
                .expiration(new Date(expiryMillis))
                .signWith(key)
                .compact();
    }
}