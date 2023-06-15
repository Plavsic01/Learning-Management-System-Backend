package com.lms.university.service.service;
import com.lms.university.service.dto.UserDTO;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private WebClient webClient;
    @Autowired
    private EurekaClient eurekaClient;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

            InstanceInfo userService = eurekaClient.getApplication("user-service").getInstances().get(0);

            UserDTO userDTO = webClient.get().uri(String.format("%sapi/user/users?username=%s",userService.getHomePageUrl(),username))
                    .retrieve().bodyToMono(UserDTO.class).block();


            ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();

            userDTO.getPrivileges().forEach((privilege ->
                    grantedAuthorities.add(new SimpleGrantedAuthority(privilege.getRoleName()))));


            return new org.springframework.security.core.userdetails.User(userDTO.getUsername(),
                   userDTO.getPassword(),grantedAuthorities);

    }
}
