package com.joao.todo_list.controller;

import com.joao.todo_list.domain.Task;
import com.joao.todo_list.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo-list")
public class TodoListController {
    @Autowired
    TodoListService todoListService;

    @PostMapping("/create")
    public boolean createTask(@RequestBody Task task){
        return todoListService.createTask(task);
    }
}
