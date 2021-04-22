
package sk.stu.fiit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author patoh
 */
public class Project implements Serializable {
    private ArrayList<Team> teams;
    private Project_Manager project_manager;
    private String projectName;
    private Date deadline;
    private Priorities priority;
    private String description;
    private String id;
    private String prefix;
    private String tag;

    public Project(String projectName, Priorities priority, String id, String prefix, String tag) {
        this.projectName = projectName;
        this.priority = priority;
        this.id = id;
        this.prefix = prefix;
        this.tag = tag;
    }
    
    //TODO: pridaj tasky

    public Project(ArrayList<Team> teams, Project_Manager project_manager, String projectName, Date deadline, Priorities priority) {
        this.teams = teams;
        this.project_manager = project_manager;
        this.projectName = projectName;
        this.deadline = deadline;
        this.priority = priority;
    }
    
   
    
    public void add(Team e) {
        teams.add(e);
    }

    public void remove(Team z) {
        teams.remove(z);
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getPrefix() {
        return prefix;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public Project_Manager getProject_manager() {
        return project_manager;
    }

    public void setProject_manager(Project_Manager project_manager) {
        this.project_manager = project_manager;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Priorities getPriority() {
        return priority;
    }

    public void setPriority(Priorities priority) {
        this.priority = priority;
    }
    
    
}
