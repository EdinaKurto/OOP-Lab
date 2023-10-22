package org.lab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Status {
    TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
}

class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status taskStatus;

    public TaskItem(int taskId, String taskDescription, Status taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    @Override
    public String toString() {
        return "TaskItem{" +
                "taskId=" + taskId +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStatus=" + taskStatus +
                '}';
    }
}

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to GitHub", Status.TO_DO),
                new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED));
    }

    public List<TaskItem> getAllTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus(Status status) {
        List<TaskItem> filteredTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskStatus() == status) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public List<TaskItem> getTasksWithIdGreaterThan(int id) {
        List<TaskItem> filteredTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskId() >= id) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public void printTaskDescriptions() {
        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
    }

    public static void main(String[] args) {
        DataStructures taskManager = new DataStructures();

        List<TaskItem> allTasks = taskManager.getAllTasks();
        System.out.println("All tasks:");
        for (TaskItem task : allTasks) {
            System.out.println(task);
        }

        List<TaskItem> inProgressTasks = taskManager.getByStatus(Status.IN_PROGRESS);
        System.out.println("\nIn Progress tasks:");
        for (TaskItem task : inProgressTasks) {
            System.out.println(task);
        }

        List<TaskItem> tasksWithIdGreaterThan2 = taskManager.getTasksWithIdGreaterThan(2);
        System.out.println("\nTasks with ID greater than or equal to 2:");
        for (TaskItem task : tasksWithIdGreaterThan2) {
            System.out.println(task);
        }

        System.out.println("\nTask Descriptions:");
        taskManager.printTaskDescriptions();
    }
}
