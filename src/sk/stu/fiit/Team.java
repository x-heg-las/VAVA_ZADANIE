/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patoh
 */
public class Team {
    private ArrayList<User> teamMembers;
    private User leader;
    

    public Team(List<User> users) {
        teamMembers = (ArrayList<User>) users;
    }
    
    public void addMember(User user){
        if(teamMembers != null){
            teamMembers.add(user);
        }
    }
    
    public boolean removeMember(User user){
        if(teamMembers != null && teamMembers.contains(user)){
            teamMembers.remove(user);
            return true;
        }
        return false;
    }
}
