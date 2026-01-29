package com.joao.todo_list.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private int id;
    private String description;
    private TaskState state;
}
