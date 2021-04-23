/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author patoh
 */
public class Loader {
    
  
    //User prihlaseny = p;
 
    private static ArrayList<User> users;
    //key : project ID
    private static HashMap<String, Project> projects;
    
    
    static{
        users = new  ArrayList<>();
        projects = new HashMap<>();
        
        //users.add(new User("jaja", 10, "Adresa", "pic"));
    }
    
    
    private static final String SAVEFILE = "save.ser";
    
    
    public static void addProject(Project project){
        projects.put(project.getId(), project);
        save();
    }
    
    public static HashMap<String, Project> getProjects(){
        return projects;
    }
    
    public static void addUser(User user){
        users.add(user);
        save();
    }
    
    public static ArrayList<User> getUsers(){
        return users;
    }
    
    public static void save(){
        FileOutputStream savefile;
        
        try{
            savefile = new FileOutputStream(SAVEFILE);
            ObjectOutputStream output = new ObjectOutputStream(savefile);
            //TODO : pridaj veci na ulozenie
            output.writeObject(users);
            output.writeObject(projects);
            output.close();
            savefile.close();
            //TODO : logger add logger
                  
        }catch(IOException ex){
            //TODO: logger
        }

   
    }

    
    public static void load() throws ClassNotFoundException{
              
            FileInputStream savefile;
        
        try{
            savefile = new FileInputStream(SAVEFILE);
            ObjectInputStream input = new ObjectInputStream(savefile);
            //TODO : pridaj veci na ulozenie
            users = (ArrayList<User>)input.readObject();
            projects = (HashMap<String,Project>)input.readObject();
            input.close();
            input.close();
            //TODO : logger add logger
                  
        }catch(IOException | ClassNotFoundException ex){
            //TODO: logger
        }
       
        
        
        
    }
    
       

}
