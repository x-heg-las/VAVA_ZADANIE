/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.Tasks;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author adamh
 */
public class Task {
    private Date start_date;
    private Date deadline;
    private LocalTime start_time;
    private LocalTime end_time;
    private String topic;

    public Task(Date start_date, Date deadline, LocalTime start_time, LocalTime end_time, String topic) {
        this.start_date = start_date;
        this.deadline = deadline;
        this.start_time = start_time;
        this.end_time = end_time;
        this.topic = topic;
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
    
    
}
