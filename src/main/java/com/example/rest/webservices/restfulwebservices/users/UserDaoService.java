package com.example.rest.webservices.restfulwebservices.users;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Janet", LocalDate.now().minusYears(28)));
        users.add(new User(3, "Greg", LocalDate.now().minusYears(40)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
//    @GetMapping("/users/{id}")
//    public User findOne(int id){
//        return users.stream().filter(u -> u.id() == id).findFirst().get();
//    }
}
