package com.lms.university.service.service;

import com.lms.university.service.model.User;
import com.lms.university.service.model.UserPrivileges;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userService.findByUsername(username);
        if(user.isPresent()){
            ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            for(UserPrivileges userPrivileges : user.get().getUserPrivileges()){
                grantedAuthorities.add(new SimpleGrantedAuthority(userPrivileges.getPrivileges().getRoleName()));
            }
            return new org.springframework.security.core.userdetails.User(user.get().getUsername(),user.get().getPassword(),grantedAuthorities);
        }
        return null;
    }
}
