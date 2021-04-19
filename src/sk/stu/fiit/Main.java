package sk.stu.fiit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patoh
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ahoj");
        
        User user = new User("aAasdad", 54, "kuty 45", "C;'Ad,. ");
        System.out.println("user name = " + user.getName());
        System.out.println("age name = " + user.getAge());
        System.out.println("user name = " + user.getAddress());
    }
}
