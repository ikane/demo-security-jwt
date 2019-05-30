package com.example.demosecurityjwt.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*
        auth.inMemoryAuthentication()
                .withUser("admin").password("$2a$04$oFsDjuZBP8J9N8Izk6HXge29t2chpA8fBLrdgetcoFPJsjdUw0SBu").roles("admin").
                and().
                withUser("reader").password("$2a$04$oFsDjuZBP8J9N8Izk6HXge29t2chpA8fBLrdgetcoFPJsjdUw0SBu").roles("reader")
        .and()
        .passwordEncoder(passwordEncoder)
        ;
        */
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.formLogin();
        http
                .authorizeRequests()
                 .anyRequest().authenticated()
                ;
    }
}
