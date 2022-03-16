package com.projectone.one.domain.todo;



import com.projectone.one.domain.todo.ToDo;
import com.projectone.one.domain.user.User;

import java.util.List;

public interface ToDoRepository {

    ToDo save(ToDo todo);

    List<ToDo> findByUserForDay(User user);

    List<ToDo> findByUserForWeek(User user);

    List<ToDo> findByUserForMonth(User user);

    List<ToDo> findAllByUser(User user);

}
