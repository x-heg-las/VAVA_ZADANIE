/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author patoh
 */
public class Loader {
    
    private static ArrayList<User> users;
    
    
    static{
        users = new  ArrayList<>();
    }
    
    
    private static final String SAVEFILE = "save.xml";
    
    
    
    public static void save(){
        XMLEncoder encoder = null;
        
        try{
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SAVEFILE)));
            
        }catch(FileNotFoundException ex){
            //TODO: logger
        }
        
        encoder.writeObject(users);
        encoder.close();
    
    }
    
    public static void load(){
        XMLDecoder decoder = null;
        try{
            decoder = new XMLDecoder(new BufferedInputStream( new FileInputStream(SAVEFILE)));
            
        }catch(FileNotFoundException ex){}
        
        users = (ArrayList<User>)decoder.readObject();
        
    }
    
    public static ArrayList<User> getUsers(){
        return users;
    }
    

}
