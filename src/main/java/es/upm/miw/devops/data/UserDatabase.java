package es.upm.miw.devops.data;

import es.upm.miw.devops.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDatabase {

    private final List<User> users;

    public UserDatabase(){
        users = new ArrayList<>();
        users.add(new User(1L, "Ana", "ana@gmail.com"));
        users.add(new User(2L, "Carlos", "carlos@gmail.com"));
        users.add(new User(3L, "Laura", "laura@gmail.com"));
        users.add(new User(4L, "Pedro", "pedro@gmail.com"));
        users.add(new User(5L, "Maria", "maria@gmail.com"));
    }

    public User findById(Long id) {

        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
