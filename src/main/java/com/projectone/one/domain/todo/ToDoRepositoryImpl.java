package com.projectone.one.domain.todo;

import com.projectone.one.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ToDoRepositoryImpl implements  ToDoRepository{

    @Override
    public ToDo save(ToDo todo) {
        return null;
    }

    @Override
    public List<ToDo> findByUserForDay(User user) {
        return null;
    }

    @Override
    public List<ToDo> findByUserForWeek(User user) {
        return null;
    }

    @Override
    public List<ToDo> findByUserForMonth(User user) {
        return null;
    }

    @Override
    public List<ToDo> findAllByUser(User user) {
        return null;
    }
}
