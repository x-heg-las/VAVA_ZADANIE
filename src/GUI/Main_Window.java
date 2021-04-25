/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.CalendarProgram;
import GUI.*;
import java.awt.BorderLayout;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import sk.stu.fiit.Priorities;
import sk.stu.fiit.Project;
import sk.stu.fiit.Tasks.Task;
import sk.stu.fiit.Team;
import sk.stu.fiit.User;
import sk.stu.fiit.Users_GUI.User_Profile;

/**
 *
 * @author adamh
 */
public class Main_Window extends javax.swing.JFrame {
    private ArrayList<Project> array_projects;
    private User user;
    private Teammates teammates;
    /**
     * Creates new form Main_Window
     */
    public Main_Window(User user) {
        this.user = user;
        load_arrays();
        initComponents();
        CalendarProgram calendarProgram = new CalendarProgram();
        calendarProgram.create(jPanel7, this.getContentPane());
        
        showGraph();
        showUsersProject(null);
        showNotes();
        showCurrentUser();
        showTask(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DefaultMutableTreeNode root = new Tree(array_projects).get_tree();
        tree = new javax.swing.JTree(root);
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlDashboard = new javax.swing.JPanel();
        tasks = new javax.swing.JPanel();
        notes = new javax.swing.JPanel();
        graphPanel = new javax.swing.JPanel();
        projectPanel = new javax.swing.JPanel();
        current_users = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        pnlToolbar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        tree.setBackground(new java.awt.Color(255, 255, 255));
        tree.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        tree.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        tree.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane3.setViewportView(tree);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jScrollPane3, gridBagConstraints);

        pnlDashboard.setLayout(new java.awt.GridBagLayout());

        tasks.setBackground(new java.awt.Color(204, 204, 255));
        tasks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        tasks.setPreferredSize(new java.awt.Dimension(517, 345));

        javax.swing.GroupLayout tasksLayout = new javax.swing.GroupLayout(tasks);
        tasks.setLayout(tasksLayout);
        tasksLayout.setHorizontalGroup(
            tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        tasksLayout.setVerticalGroup(
            tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        pnlDashboard.add(tasks, gridBagConstraints);

        notes.setBackground(new java.awt.Color(255, 204, 255));
        notes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        notes.setPreferredSize(new java.awt.Dimension(260, 345));

        javax.swing.GroupLayout notesLayout = new javax.swing.GroupLayout(notes);
        notes.setLayout(notesLayout);
        notesLayout.setHorizontalGroup(
            notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        notesLayout.setVerticalGroup(
            notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        pnlDashboard.add(notes, gridBagConstraints);

        graphPanel.setBackground(new java.awt.Color(255, 204, 204));
        graphPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        graphPanel.setPreferredSize(new java.awt.Dimension(260, 345));

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        pnlDashboard.add(graphPanel, gridBagConstraints);

        projectPanel.setBackground(new java.awt.Color(255, 255, 204));
        projectPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        projectPanel.setPreferredSize(new java.awt.Dimension(260, 345));

        javax.swing.GroupLayout projectPanelLayout = new javax.swing.GroupLayout(projectPanel);
        projectPanel.setLayout(projectPanelLayout);
        projectPanelLayout.setHorizontalGroup(
            projectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        projectPanelLayout.setVerticalGroup(
            projectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        pnlDashboard.add(projectPanel, gridBagConstraints);

        current_users.setBackground(new java.awt.Color(204, 255, 204));
        current_users.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        current_users.setPreferredSize(new java.awt.Dimension(260, 345));

        javax.swing.GroupLayout current_usersLayout = new javax.swing.GroupLayout(current_users);
        current_users.setLayout(current_usersLayout);
        current_usersLayout.setHorizontalGroup(
            current_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        current_usersLayout.setVerticalGroup(
            current_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        pnlDashboard.add(current_users, gridBagConstraints);

        jPanel7.setBackground(new java.awt.Color(255, 51, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(517, 345));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        pnlDashboard.add(jPanel7, gridBagConstraints);

        jScrollPane1.setViewportView(pnlDashboard);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jScrollPane1, gridBagConstraints);

        pnlToolbar.setBackground(new java.awt.Color(51, 51, 255));
        pnlToolbar.setMinimumSize(new java.awt.Dimension(0, 40));
        pnlToolbar.setPreferredSize(new java.awt.Dimension(864, 40));
        pnlToolbar.setLayout(new javax.swing.BoxLayout(pnlToolbar, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tasks");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 454545));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel2);

        jLabel1.setText("  ");
        pnlToolbar.add(jLabel1);

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Details");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel3);

        jLabel4.setText("  ");
        pnlToolbar.add(jLabel4);

        jLabel5.setBackground(new java.awt.Color(255, 255, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Calendar");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel5.setMaximumSize(new java.awt.Dimension(150, 40));
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel5);

        jLabel6.setText("  ");
        pnlToolbar.add(jLabel6);

        jLabel7.setBackground(new java.awt.Color(255, 255, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("New Task");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 40));
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel7);

        jLabel8.setText("  ");
        pnlToolbar.add(jLabel8);

        jLabel9.setBackground(new java.awt.Color(255, 255, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("New Project");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel9.setMaximumSize(new java.awt.Dimension(150, 40));
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel9MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel9);

        jLabel10.setText("  ");
        pnlToolbar.add(jLabel10);

        jLabel11.setBackground(new java.awt.Color(255, 255, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("New Profile");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel11.setMaximumSize(new java.awt.Dimension(150, 40));
        jLabel11.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        jPanel4.add(pnlToolbar, gridBagConstraints);

        jScrollPane2.setViewportView(jPanel4);

        getContentPane().add(jScrollPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        jPanel7.removeAll();

        //revalidate();
        //repaint();
        CalendarProgram calendarProgram = new CalendarProgram();
        calendarProgram.create(jPanel7, this.getContentPane());
    }//GEN-LAST:event_formComponentResized

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        Tasks_window tasks_window = new Tasks_window();
        tasks_window.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        // TODO add your handling code here:
        User user = teammates.get_clicked();
        if (user != null){
            User_Profile user_Profile = new User_Profile(user);
            user_Profile.setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        // TODO add your handling code here:
        Standalone_Calendar standalone_Calendar = new Standalone_Calendar();
        standalone_Calendar.create();
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseReleased

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ArrayList<Project> array_project = new ArrayList<Project>();
        /* Create and display the form */
        User user = new User("andrea", "adam","AdA", 88, "Holic 12", "user", "cesta k obrazku");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel current_users;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel notes;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlToolbar;
    private javax.swing.JPanel projectPanel;
    private javax.swing.JPanel tasks;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables

    private void load_arrays(ArrayList<Project> array_projects){
        this.array_projects = array_projects;
    }
    
    private void load_arrays(){
        array_projects = new ArrayList<>();
        Task task = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "toto je super brutalny Task, na ktorom sa seci tesime a pracujeme :)))))", "Yenfang_Invoices");
        //Task task1 = new Task(new GregorianCalendar(), new Date(), new Date(), new Date(), "toto je super brutalny Task, na ktorom sa seci tesime a pracujeme :)))))");
        User project_Manager = new User("jozef.m", "stary","Jozef Mlady", 12, "Mlada Boleslav 41", "project_manager", "nemam obrazok");
        Project project = new Project(new ArrayList(), project_Manager, "Najlepsi projekt na svete", new Date(), Priorities.CRITICAL);
        List<User> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            User user1 = new User("andrea", "adam","AdA", 88, "Holic 12", "user", "cesta k obrazku");
            list.add(user1);
        }
        Team team = new Team(list, "tim jednicka");
        project.add(team);
        
        array_projects.add(project);
    }
    
    private void showGraph(){
        JPanel graph = new UserTaskChart(user);
        graph.setPreferredSize(graphPanel.getPreferredSize());
        
        graph.setVisible(true);
        graphPanel.setLayout(new BorderLayout());
        graphPanel.removeAll();
        graphPanel.add(graph, BorderLayout.CENTER);
        graphPanel.revalidate();
        graphPanel.repaint();
       
    }
    
    private void showUsersProject(Project project){
        teammates = new Teammates(project);
        JPanel team = teammates;
        team.setPreferredSize(projectPanel.getPreferredSize());
        
        team.setVisible(true);
        projectPanel.setLayout(new BorderLayout());
        projectPanel.removeAll();
        projectPanel.add(team, BorderLayout.CENTER);
        projectPanel.revalidate();
        projectPanel.repaint();
        
    }
    
    private void showNotes(){
        JTextPane jTextPane = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(jTextPane);
        JLabel jLabel = new JLabel("Notes");
        jLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        
        notes.setLayout(new BorderLayout());
        notes.removeAll();
        jTextPane.setPreferredSize(notes.getPreferredSize());
        
        notes.add(jLabel, BorderLayout.NORTH);
        notes.add(scrollPane, BorderLayout.CENTER);
        jTextPane.setFont(new java.awt.Font("Segoe UI Light", 0, 15));
        notes.revalidate();
        notes.repaint();
    }
    
    private void showCurrentUser(){
        System.out.println("user = " + user.getType());
        JPanel current = new Current_User(user);
        current.setPreferredSize(current_users.getPreferredSize());
        
        current.setVisible(true);
        current_users.setLayout(new BorderLayout());
        current_users.removeAll();
        current_users.add(current, BorderLayout.CENTER);
        current_users.revalidate();
        current_users.repaint();
    }
    
    private void showTask(Task task){
        Task task1 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "toto je super husty popis", "Muziker_Site");
        
        JPanel current = new Task_show(task1);
        current.setPreferredSize(tasks.getPreferredSize());
        
        current.setVisible(true);
        tasks.setLayout(new BorderLayout());
        tasks.removeAll();
        tasks.add(current, BorderLayout.CENTER);
        tasks.revalidate();
        tasks.repaint();
    }
}