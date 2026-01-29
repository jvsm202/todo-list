package com.joao.todo_list.controller;

import com.joao.todo_list.domain.Task;
import com.joao.todo_list.domain.TaskState;
import com.joao.todo_list.dto.CreateTaskRequest;
import com.joao.todo_list.dto.UpdateTaskRequest;
import com.joao.todo_list.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo-list")
public class TodoListController {
    @Autowired
    TodoListService todoListService;

    @PostMapping
    public Task createTask(@RequestBody CreateTaskRequest createTaskRequest){
        return todoListService.create(createTaskRequest);
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable int id){
        return todoListService.getTask(id);
    }

    @GetMapping
    public List<Task> getTaskList(@RequestParam(required = false)TaskState filter){
        return filter == null ? todoListService.getAllTasks() : todoListService.getTasksFilter(filter);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody UpdateTaskRequest updateTask){
        return todoListService.update(id, updateTask);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTask(@PathVariable int id){
        return todoListService.delete(id);
    }

}
