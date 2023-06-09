package com.lms.subject.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class SecurityConfiguration {

    @Autowired
    UserDetailsService userDetailsService;

    @Bean
    public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration conf) throws Exception {
        return conf.getAuthenticationManager();
    }

    @Bean
    public AuthTokenFilter authTokenFilterBean(AuthenticationConfiguration conf) throws Exception {
        AuthTokenFilter authTokenFilter = new AuthTokenFilter();
        authTokenFilter.setAuthenticationManager(conf.getAuthenticationManager());
        return authTokenFilter;
    }

    @Bean
    public SecurityFilterChain configure(HttpSecurity http, AuthTokenFilter authTokenFilter) throws Exception {

        return http.addFilterBefore(authTokenFilter, UsernamePasswordAuthenticationFilter.class)
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/api/subject/subjects/**").permitAll()
                .requestMatchers("/api/subject/year-of-study/**").permitAll()
                .requestMatchers("/api/subject/subject-enrollment/**").permitAll()
                .requestMatchers("/api/subject/notification/**").permitAll()
                .requestMatchers("/api/subject/teacher-on-realisation/**").permitAll()
                .requestMatchers("/api/subject/subject-material/**").permitAll()
                .and()
                .build();

    }
}
