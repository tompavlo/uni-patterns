package codebase.largeclass;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList(List<String> taskList){
        tasks = taskList;
    }

    public TaskList(){
        tasks = new ArrayList<>();
    }

    public void addTask(String task){
        tasks.add(task);
    }

    public void deleteTask(String task){
        tasks.remove(task);
    }
}
