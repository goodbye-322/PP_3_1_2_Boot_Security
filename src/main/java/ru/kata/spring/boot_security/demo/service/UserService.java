package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;
import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getUsers();

    void save(User user);

    User getUser(long id);

    void deleteUser(long id);

    User findByUsername(String username);
}