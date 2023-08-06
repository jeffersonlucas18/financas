package com.estudo.minhas_financas.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
//    final UserDetailServiceImpl userDetailService;
//
//    public WebSecurityConfig(UserDetailServiceImpl userDetailService) {
//        this.userDetailService = userDetailService;
//    }

//    @Override
//    protected  void configure(HttpSecurity http) throws Exception {
//        http
//                .httpBasic()
//                .and()
//                .authorizeHttpRequests()
//                .antMatchers(HttpMethod.GET, "/users/**").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .csrf().disable()
//        ;
//    }
//
//    @Override
//    protected  void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth
////                .inMemoryAuthentication()
////                .withUser("jeff")
////                .password(passwordEncoder().encode("conquista"))
////                .roles("ADMIN")
////        ;
//        auth.userDetailsService(userDetailService)
//                .passwordEncoder(passwordEncoder())
//        ;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize
                        .antMatchers(HttpMethod.GET, "/users").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .build();
    }
}
