/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import sk.stu.fiit.Loader;
import sk.stu.fiit.Project;
import sk.stu.fiit.Tasks.Task;
import sk.stu.fiit.Team;
import sk.stu.fiit.User;

/**
 *
 * @author adamh
 */
public class Tree {
    private static void projects_trees(Project project, DefaultMutableTreeNode root){
        DefaultMutableTreeNode projects = null;
        projects = new DefaultMutableTreeNode(project.getProjectName());
        root.add(projects);
        for (Team team : project.getTeams()) {
            switch (Loader.getCurrentlyLogged().getType()) {
                case "project_manager":
                    teams_trees(team, projects, "project_manager");
                    break;
                case "director":
                    teams_trees(team, projects, "director");
                    break;
                case "admin":
                    teams_trees(team, projects, "admin");
                    break;
                default:
                    teams_trees(team, projects);
                    break;
            }
        }
    }
    
    private static void teams_trees(Team teams, DefaultMutableTreeNode project){
        DefaultMutableTreeNode team = null;
        team = new DefaultMutableTreeNode(teams.getName());
        for (User user  : teams.getTeamMembers()) {
            if (user.getUsername().equals(Loader.getCurrentlyLogged().getUsername())){
                project.add(team);
                break;
            }
        }
    }
    
    private static void teams_trees(Team teams, DefaultMutableTreeNode project, String type){
        DefaultMutableTreeNode team = null;
        team = new DefaultMutableTreeNode(teams.getName());
        project.add(team);
    }
    
    public static DefaultMutableTreeNode get_tree(){
        if (Loader.getCurrentlyLogged().getType().equals("director") || Loader.getCurrentlyLogged().getType().equals("admin")){
            ArrayList<String> already_done = new ArrayList<>();
            ArrayList<Project> projects = new ArrayList<>();
            for (User user : Loader.getUsers()) {
                
                for (Project project : user.getProjects()) {
                    System.out.println("project = " + project.getProjectName());
                    if (already_done.contains(project.getId()))
                        continue;
                    already_done.add(project.getId());
                    projects.add(project);
                }
            }
            DefaultMutableTreeNode root = start(projects);
            return root;
        }
        
        if (Loader.getCurrentlyLogged().getProjects() == null)
            return null;
        
        DefaultMutableTreeNode root = start();
        return root;
    }
    
    private static DefaultMutableTreeNode start(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Projects");
        for (Project project : Loader.getCurrentlyLogged().getProjects()) {
            projects_trees(project, root);
        }
        return root;
    }
    
    private static DefaultMutableTreeNode start(ArrayList<Project> projects){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Projects");
        for (Project project : projects) {
            projects_trees(project, root);
        }
        return root;
    }
}
