package com.faccordoba.coffe.users;

import jakarta.annotation.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public @Nullable User findByEmail(String email) {

        // In a real application, this method would query a database.
        // Here, we return a dummy user for demonstration purposes.
        // null if not found explicitly
         return users.stream()
                .filter(user -> user.email().equalsIgnoreCase(email))
                .findFirst()
                .orElse(null);
    }
}
