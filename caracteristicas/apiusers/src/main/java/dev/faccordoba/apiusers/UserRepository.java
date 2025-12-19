package dev.faccordoba.apiusers;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private  final List<User> users = new ArrayList<>();

    @PostConstruct
    public void init() {
        users.add(new User(1, "Facundo Cordoba", "cordobafs@magic.com"));
        users.add(new User(2, "Fatima Quinteros", "fati@magic.com"));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(Integer id) {
        return users.stream()
                .filter(user -> user.id().equals(id))
                .findFirst()
                .orElse(null);
    }


}
