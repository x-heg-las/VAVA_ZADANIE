/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.util.Date;

/**
 *
 * @author adamh
 */
public class Meeting_Task {
    private Date date;
    private Date start_time;
    private Date end_time;
    private String topic;

    public Meeting_Task(Date date, Date start_time, Date end_time, String topic) {
        this.date = date;
        this.start_time = start_time;
        this.end_time = end_time;
        this.topic = topic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    
}
