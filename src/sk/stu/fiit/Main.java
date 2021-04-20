package sk.stu.fiit;

import java.time.LocalTime;
import java.util.Date;
import sk.stu.fiit.Tasks.Task;

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
        
        
        Task task = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "toto je super brutalny Task, na ktorom sa seci tesime a pracujeme :)))))");
        //Task task1 = new Task(new GregorianCalendar(), new Date(), new Date(), new Date(), "toto je super brutalny Task, na ktorom sa seci tesime a pracujeme :)))))");
        System.out.println("Casiiiiiiik je: " + task.getDeadline());
        
    }
}
