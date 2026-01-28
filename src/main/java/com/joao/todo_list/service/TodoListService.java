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

    public Task getTask(int id){
        int lastId = taskList.getLast().getId();

        if(id > lastId) return null;
        Task task = null;

        for(Task currTask : taskList){
            if(currTask.getId() == lastId){
                task = currTask;
                break;
            }
        }
        return task;
    }

    public Task update(int id, UpdateTaskRequest updateTask){
        Task task = getTask(id);

        if(task == null) return null;
        String description = updateTask.getDescription();
        TaskState state = updateTask.getState();

        if(description != null){
            task.setDescription(description);
        }
        if(state != null){
            task.setState(state);
        }
        return task;
    }

    public boolean delete(int id){
        Task task = getTask(id);
        if(task == null) return false;
        return taskList.remove(task);
    }

    public List<Task> getAllTasks(){
        return taskList;
    }

    public List<Task> getTasksFilter(TaskState filter){
        if(filter == null) return taskList;
        List<Task> filteredList = new ArrayList<>();

        for(Task task : taskList){
            if(task.getState() == filter){
                filteredList.add(task);
            }
        }
        return filteredList;
    }
}
