package com.joao.todo_list.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private String description;
    private State state;

    public Task(){}

    public Task(String description){
        this.description = description;
    }
}
