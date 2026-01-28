package com.joao.todo_list.dto;

import com.joao.todo_list.domain.State;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateTaskRequest {
    String description;
    State state;
}
