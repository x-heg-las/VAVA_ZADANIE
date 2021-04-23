
package sk.stu.fiit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.Tasks.Task;

/**
 *
 * @author patoh
 */
public class Project implements Serializable {
    private ArrayList<Team> teams;
    private ArrayList<Task> tasks;
    private Project_Manager project_manager;
    private String projectName;
    private Date deadline;
    private Priorities priority;
    private String description;
    private String id;

    private String tag;

    public Project(String projectName, Priorities priority, String tag, String prefix, String description) {
        this.projectName = projectName;
        this.priority = priority;
        this.id = prefix;
        this.tag = tag;
        this.description = description;
    }
    
    //TODO: pridaj tasky

    public Project(ArrayList<Team> teams, Project_Manager project_manager, String projectName, Date deadline, Priorities priority) {
        this.teams = teams;
        this.project_manager = project_manager;
        this.projectName = projectName;
        this.deadline = deadline;
        this.priority = priority;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
    
    public void add(Task task){
        tasks.add(task);
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
