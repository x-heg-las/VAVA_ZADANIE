/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.io.Serializable;

/**
 *
 * @author adamh
 */
public class Project_Manager extends User implements Serializable{
    private String type = "project_manajer";

    public Project_Manager(String name, int age, String address, String picture) {
        super(name, age, address, picture);
    }
}
