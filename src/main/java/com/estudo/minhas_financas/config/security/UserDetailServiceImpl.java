package com.estudo.minhas_financas.config.security;

import com.estudo.minhas_financas.model.UserModel;
import com.estudo.minhas_financas.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    final UserRepository userRepository;

    public UserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User not Found with username: " + username));
        return userModel;
//        return new User(userModel.getUsername(), userModel.getPassword(), true, true, true, true, userModel.getRoles());
    }

}
