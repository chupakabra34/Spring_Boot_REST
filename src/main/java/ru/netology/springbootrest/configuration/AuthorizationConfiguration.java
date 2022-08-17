package ru.netology.springbootrest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springbootrest.authorizationService.AuthorizationService;
import ru.netology.springbootrest.userRepository.UserRepository;

@Configuration
public class AuthorizationConfiguration {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public AuthorizationService service(UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }
}