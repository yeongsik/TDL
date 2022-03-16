package com.projectone.one.domain.user;

import com.projectone.one.domain.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User save(User user);

    Optional<User> findById(User user);

    Optional<User> findByName(User user);

    List<User> findAll();

}
