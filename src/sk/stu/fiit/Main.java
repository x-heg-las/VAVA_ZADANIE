package sk.stu.fiit;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
        
        Project_Manager project_Manager = new Project_Manager("Jozef Mlady", 12, "Mlada Boleslav 41", "nemam obrazok");
        
        Project project = new Project(new ArrayList(), project_Manager, "Najlepsi projekt na svete", new Date(), Priorities.CRITICAL);
        
        List<User> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            User user1 = new User("AdA", 88, "Holic 12", "cesta k obrazku");
            list.add(user1);
        }
        Team team = new Team(list);
        project.add(team);
        
        System.out.println("project veduic name = " + project.getProject_manager().getName());
        System.out.println("pocet teamov = " + project.getTeams().size());
        System.out.println("pocet zamoestnancov = " + project.getTeams().get(0));
        System.out.println("enum = " + project.getPriority());
    }
}
