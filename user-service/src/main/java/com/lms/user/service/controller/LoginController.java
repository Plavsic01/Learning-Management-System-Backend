package com.lms.user.service.controller;


import com.lms.user.service.dto.LoginDTO;
import com.lms.user.service.utils.TokenUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@AllArgsConstructor
@RequestMapping("/api/user")
public class LoginController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    TokenUtils tokenUtils;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    PasswordEncoder passwordEncoder;


    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public ResponseEntity<Map<String,String>> login(@RequestBody LoginDTO loginDTO){
//        System.out.println(passwordEncoder.encode(loginDTO.getPassword()));
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                loginDTO.getUsername(),loginDTO.getPassword());
        Authentication auth = authenticationManager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(auth);
        String jwt = tokenUtils.generateToken(userDetailsService.loadUserByUsername(loginDTO.getUsername()));
        Map<String,String> tokenMap = new HashMap<>();
        tokenMap.put("token",jwt);
        return new ResponseEntity<>(tokenMap, HttpStatus.OK);
    }


}
