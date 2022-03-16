package com.projectone.one.domain.todo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class ToDo {

    private long id;
    private String subject;
    private String description;
    private boolean isComplete;
    private String importance;
    private LocalDateTime regDateTime;

}
