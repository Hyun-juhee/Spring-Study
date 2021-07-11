package com.example.usermanagement.repository;

import java.util.List;
import java.util.Optional;
import com.example.usermanagement.domain.User;

public interface UserRepository {
    User save(User member);
    Optional<User> findById(Long id);
    Optional<User> findByName(String name);
    List<User> findAll();
}
