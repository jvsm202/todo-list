package com.joao.todo_list.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTaskRequest {
    private String description;
}
