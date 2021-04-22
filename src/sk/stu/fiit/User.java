/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author adamh
 */
public class User implements Serializable{
    private String name;
    private int age;
    private String address;
    private String picture;
    private String type = "user";
    private ArrayList<Project> projects;

    public User(String name, int age, String address, String picture) {
        this.projects = new ArrayList<>();
        this.name = name;
        this.age = age;
        this.address = address;
        this.picture = picture;
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
