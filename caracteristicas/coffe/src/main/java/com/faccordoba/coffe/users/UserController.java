package com.faccordoba.coffe.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/by-email")
    public User getUserByEmail(@RequestParam String email) {
        User user = userService.findByEmail(email);
        if(user.name().equalsIgnoreCase("Facundo"))
            System.out.println("Es Facundo");
        return user;
    }

}
