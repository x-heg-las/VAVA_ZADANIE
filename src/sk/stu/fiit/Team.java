/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *  Trieda reprezentujuca jednotlive timy pouzivatelov.
 */
public class Team implements Serializable{
    private String name;
    private ArrayList<User> teamMembers;
    private User leader;
    
    /**
     * Konstruktor pre vytvorenie timu.
     * @param users Zoznam pouzivatelov v time.
     * @param name Nazov timu.
     */
    public Team(List<User> users, String name) {
        teamMembers = (ArrayList<User>) users;
        this.name = name;
    }
    
    /**
     * Motada na pridanie usera.
     * @param user pridavany user.
     */
    public void addMember(User user){
        if(teamMembers != null){
            teamMembers.add(user);
        }
    }
    
    /**
     * Metoda ktora odstrani zvoleneho usera.
     * @param user User, ktoreho chceme odstranit
     * @return True ak bol odstraneny, inak false.
     */
    public boolean removeMember(User user){
        if(teamMembers != null && teamMembers.contains(user)){
            teamMembers.remove(user);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(ArrayList<User> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public User getLeader() {
        return leader;
    }

    public void setLeader(User leader) {
        this.leader = leader;
    }
    
    
}
