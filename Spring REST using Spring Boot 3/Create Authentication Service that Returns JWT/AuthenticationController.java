package com.cognizant.springlearn.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.util.JwtUtil;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("Start");
        LOGGER.debug("Authorization Header: {}", authHeader);

        // Decode username from Basic Auth header
        String encodedCredentials = authHeader.substring(6);
        String credentials = new String(java.util.Base64.getDecoder().decode(encodedCredentials));
        String username = credentials.split(":")[0];

        // Generate JWT
        String token = JwtUtil.generateToken(username);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("End");

        return map;
    }
}