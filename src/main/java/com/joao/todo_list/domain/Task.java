package com.joao.todo_list.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    int id;
    private String description;
    private TaskState state;

    public Task(){}

    public Task(String description){
        this.description = description;
    }
}
