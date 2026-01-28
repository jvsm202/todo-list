package com.joao.todo_list.service;

import com.joao.todo_list.domain.Task;
import com.joao.todo_list.domain.TaskState;
import com.joao.todo_list.dto.CreateTaskRequest;
import com.joao.todo_list.dto.UpdateTaskRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoListService {
    int id = 1;
    List<Task> taskList = new ArrayList<>();

    public Task create(CreateTaskRequest createTaskRequest){
        Task task = new Task();
        task.setId(id++);
        task.setDescription(createTaskRequest.getDescription());
        task.setState(TaskState.TO_DO);
        taskList.add(task);
        return task;
    }

}
