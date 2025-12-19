package dev.faccordoba.apiusers;

import org.springframework.stereotype.Component;


//TODO: podriamos usar MapStruct para hacer el mapeo entre entidades y DTos

@Component
public class UserMapper {

    public UserDTOv1 toDTOv1(User user) {
        return new UserDTOv1(user.id(), user.name(), user.email());

    }


    public UserDTOv2 toDTOv2(User user) {
        String  nameParts[] = user.name().split(" ", 2);
        return new UserDTOv2(user.id(), nameParts[0], nameParts[1], user.email());
    }
}
