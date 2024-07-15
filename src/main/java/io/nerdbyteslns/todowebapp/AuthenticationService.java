package io.nerdbyteslns.todowebapp;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }
}
