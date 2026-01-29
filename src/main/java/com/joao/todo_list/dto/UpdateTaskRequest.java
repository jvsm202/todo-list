package com.joao.todo_list.dto;

import com.joao.todo_list.domain.TaskState;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateTaskRequest {
    private String description;
    private TaskState state;
}
