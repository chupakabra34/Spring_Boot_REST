package ru.netology.springbootrest.AuthorizationService;

import ru.netology.springbootrest.Authorities.Authorities;
import ru.netology.springbootrest.InvalidCredentials.InvalidCredentials;
import ru.netology.springbootrest.UnauthorizedUser.UnauthorizedUser;
import ru.netology.springbootrest.UserRepository.UserRepository;

import java.util.List;

public class AuthorizationService {
    UserRepository userRepository;

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}