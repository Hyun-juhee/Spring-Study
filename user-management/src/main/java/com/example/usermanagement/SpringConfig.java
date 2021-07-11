package com.example.usermanagement;

import com.example.usermanagement.repository.MemoryUserRepository;
import com.example.usermanagement.repository.UserRepository;
import com.example.usermanagement.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public UserService userService() {
        return new UserService(userRepository());
    }

    @Bean
    public UserRepository userRepository() {
        return new MemoryUserRepository();
    }
}
