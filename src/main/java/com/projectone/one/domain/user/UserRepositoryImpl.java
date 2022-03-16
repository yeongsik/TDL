package com.projectone.one.domain.user;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Optional<User> findById(User user) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByName(User user) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
