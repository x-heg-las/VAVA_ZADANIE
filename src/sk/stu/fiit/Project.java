
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
    
   private User project_manager;

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
        this.teams = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.description = description;
    }
    
    //TODO: pridaj tasky

    public Project(ArrayList<Team> teams, User project_manager, String projectName, Date deadline, Priorities priority) {
        this.teams = teams;
        this.project_manager = project_manager;
        this.projectName = projectName;
        this.deadline = deadline;
        this.priority = priority;
        this.teams = new ArrayList<>();
        this.tasks = new ArrayList<>();
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

    public User getProject_manager() {
        return project_manager;
    }

    public void setProject_manager(User project_manager) {
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
    
    public boolean hasUser(User user){
        if(user != null){
            if (teams.stream().filter(team -> (team != null)).anyMatch(team -> 
                    (team.getTeamMembers().stream().anyMatch(teamMember -> 
                            (teamMember.getUsername().compareTo(user.getUsername()) == 0))))) 
            {
                return true;
            }
        }
        
        return false;
    }
    
}
