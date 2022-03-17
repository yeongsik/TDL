package com.projectone.one.domain.todo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Entity
@NoArgsConstructor
public class ToDo {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column
    private String subject;

    @Column
    private String description;

    @Column
    private boolean isComplete;

    @Column
    private String importance;

    @Column
    private LocalDateTime regDateTime;

    @Builder
    public ToDo(String subject, String description, boolean isComplete, String importance, LocalDateTime regDateTime) {
        this.subject = subject;
        this.description = description;
        this.isComplete = isComplete;
        this.importance = importance;
        this.regDateTime = regDateTime;
    }
}
