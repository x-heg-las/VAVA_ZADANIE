/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.Tasks;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.Priorities;
import sk.stu.fiit.TaskState;
import sk.stu.fiit.User;

/**
 *
 * @author adamh
 */
public class Task implements Serializable{
    private String name;
    private Date start_date;
    private Date deadline;
    private LocalTime start_time;
    private LocalTime end_time;
    private String topic;
    private ArrayList<User> asignedTo;
    private Priorities priority;
    private TaskState taskState;

    public Priorities getPriority() {
        return priority;
    }

    public void setPriority(Priorities priority) {
        this.priority = priority;
    }

    public TaskState getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskState taskState) {
        this.taskState = taskState;
    }
    
    public ArrayList<User> getAsignedTo() {
        return asignedTo;
    }

    public void setAsignedTo(ArrayList<User> asignedTo) {
        this.asignedTo = asignedTo;
    }
    

    public Task(String name, Date start_date, Date deadline, String topic) {
        this.name = name;
        this.start_date = start_date;
        this.deadline = deadline;
        this.topic = topic;
        this.taskState = TaskState.TODO;
    }

    public Task(Date start_date, Date deadline, LocalTime start_time, LocalTime end_time, String topic, String name) {
        this.name = name;
        this.start_date = start_date;
        this.deadline = deadline;
        this.start_time = start_time;
        this.end_time = end_time;
        this.topic = topic;
        this.taskState = TaskState.TODO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public LocalTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    public void add(User user){
        if(asignedTo == null || asignedTo.isEmpty())
            asignedTo = new ArrayList<>();
        
        asignedTo.add(user);
    }
    
}
