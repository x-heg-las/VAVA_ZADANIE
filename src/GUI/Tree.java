/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import sk.stu.fiit.Project;
import sk.stu.fiit.Tasks.Task;
import sk.stu.fiit.Team;

/**
 *
 * @author adamh
 */
public class Tree {
    private ArrayList<Project> array_projects;

    public Tree(ArrayList<Project> array_projects) {
        this.array_projects = array_projects;
    }
    
    private void projects_trees(Project project, DefaultMutableTreeNode root){
        DefaultMutableTreeNode projects = null;
        System.out.println("projects = " + project.getProjectName());
        projects = new DefaultMutableTreeNode(project.getProjectName());
        root.add(projects);
        for (Team team : project.getTeams()) {
            teams_trees(team, projects);
        }
    }
    
    private void teams_trees(Team teams, DefaultMutableTreeNode project){
        DefaultMutableTreeNode team = null;
        team = new DefaultMutableTreeNode(teams.getName());
        project.add(team);
    }
    
    public DefaultMutableTreeNode get_tree(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Projects");
        for (Project project : array_projects) {
            projects_trees(project, root);
        }
        return root;
    }
/*
    private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;

        category = new DefaultMutableTreeNode("Books for Java Programmers");
        top.add(category);

        //original Tutorial
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Tutorial: A Short Course on the Basics",
            "tutorial.html"));
        category.add(book);

        //Tutorial Continued
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Tutorial Continued: The Rest of the JDK",
            "tutorialcont.html"));
        category.add(book);

        //JFC Swing Tutorial
        book = new DefaultMutableTreeNode(new BookInfo
            ("The JFC Swing Tutorial: A Guide to Constructing GUIs",
            "swingtutorial.html"));
        category.add(book);

        //Bloch
        book = new DefaultMutableTreeNode(new BookInfo
            ("Effective Java Programming Language Guide",
	     "bloch.html"));
        category.add(book);

        //Arnold/Gosling
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Programming Language", "arnold.html"));
        category.add(book);

        //Chan
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Developers Almanac",
             "chan.html"));
        category.add(book);

        category = new DefaultMutableTreeNode("Books for Java Implementers");
        top.add(category);

        //VM
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Virtual Machine Specification",
             "vm.html"));
        category.add(book);

        //Language Spec
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Language Specification",
             "jls.html"));
        category.add(book);
*/
}
