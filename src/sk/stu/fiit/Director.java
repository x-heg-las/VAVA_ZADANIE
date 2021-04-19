/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

/**
 *
 * @author adamh
 */
public class Director extends User {
    private final String type = "director";

    public Director(String name, int age, String address, String picture) {
        super(name, age, address, picture);
    }
}
