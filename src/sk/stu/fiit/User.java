/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.io.Serializable;
import java.util.ArrayList;
import sk.stu.fiit.Tasks.Task;

/**
 *
 * @author adamh
 */
public class User implements Serializable{
    private String username;
    private String password;
    private String name;
    private int age;
    private String address;
    private String picture;
    private String type;
    private ArrayList<Project> projects;
    private ArrayList<Task> userTasks;

    public ArrayList<Task> getUserTasks() {
        return userTasks;
    }
    
    public void addUserTask(Task task){
        if(userTasks == null)
            userTasks = new ArrayList<>();
        
        userTasks.add(task);
    }

    public User(String username, String password, String name, int age, String address, String type, String picture) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.address = address;
        this.type = type;
        this.picture = picture;
        this.projects = new ArrayList<>();
    }

    public User(String name, int age, String address, String pic) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.picture = pic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addProject(Project project){
        projects.add(project);
    }
    
    public ArrayList<Project> getProjects(){
        return projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  name + "\t" + type ;
    }
    
    
    
}
