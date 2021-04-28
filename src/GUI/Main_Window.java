/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.CalendarProgram;
import GUI.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import sk.stu.fiit.Loader;
import sk.stu.fiit.Project;
import sk.stu.fiit.Tasks.Task;
import sk.stu.fiit.User;
import sk.stu.fiit.Users_GUI.User_Profile;

/**
 * Trieda pre ovladanie hlavneho okna.
 * @author adamh
 */
public class Main_Window extends javax.swing.JFrame {
    private User user;
    private Teammates teammates;
    private static Main_Window instance;
    private static final Logger LOG = Logger.getLogger(Main_Window.class.getName());
    //public JTextPane jTextPane = new JTextPane();
    /**
     * Creates new form Main_Window
     * @param user Pouzivatel, pre ktoreho sa generuje hlavne okno
     */
    public Main_Window(User user) {
        this.user = user;
        initComponents();
        CalendarProgram calendarProgram = new CalendarProgram();
        calendarProgram.create(jPanel7, this.getContentPane());
        
        hide_buttons();
        instance = this;
        showGraph();
        showUsersProject(null);
        showNotes();
        showCurrentUser();
        showTask();
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
        DefaultMutableTreeNode root = new Tree().get_tree();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        AllProjects = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        new_task = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        new_project = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        new_profile = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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
        tasks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 255))); // NOI18N
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
        notes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 255))); // NOI18N
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
        graphPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 255))); // NOI18N
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
        projectPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 255))); // NOI18N
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
        current_users.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 255))); // NOI18N
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
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 255))); // NOI18N
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
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle"); // NOI18N
        jLabel2.setText(bundle.getString("TASKS")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 454545));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel2);
        jLabel2.getAccessibleContext().setAccessibleName(bundle.getString("TASKS")); // NOI18N

        jLabel1.setText(bundle.getString("  ")); // NOI18N
        pnlToolbar.add(jLabel1);

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(bundle.getString("DETAILS")); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel3);
        jLabel3.getAccessibleContext().setAccessibleName(bundle.getString("DETAILS")); // NOI18N

        jLabel4.setText(bundle.getString("  ")); // NOI18N
        pnlToolbar.add(jLabel4);

        jLabel5.setBackground(new java.awt.Color(255, 255, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(bundle.getString("CALENDAR")); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel5.setMaximumSize(new java.awt.Dimension(150, 40));
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel5);
        jLabel5.getAccessibleContext().setAccessibleName(bundle.getString("CALENDAR")); // NOI18N

        jLabel9.setText(bundle.getString("  ")); // NOI18N
        pnlToolbar.add(jLabel9);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(bundle.getString("SETTINGS")); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel12.setMaximumSize(new java.awt.Dimension(150, 454545));
        jLabel12.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel12);
        jLabel12.getAccessibleContext().setAccessibleName(bundle.getString("SETTINGS")); // NOI18N

        jLabel14.setText(bundle.getString("  ")); // NOI18N
        pnlToolbar.add(jLabel14);

        AllProjects.setBackground(new java.awt.Color(255, 255, 51));
        AllProjects.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        AllProjects.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AllProjects.setText(bundle.getString("PROJECTS")); // NOI18N
        AllProjects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        AllProjects.setMaximumSize(new java.awt.Dimension(150, 40));
        AllProjects.setPreferredSize(new java.awt.Dimension(150, 40));
        AllProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AllProjectsMouseReleased(evt);
            }
        });
        pnlToolbar.add(AllProjects);
        AllProjects.getAccessibleContext().setAccessibleName(bundle.getString("PROJECTS_MAIN")); // NOI18N

        jLabel6.setText(bundle.getString("  ")); // NOI18N
        pnlToolbar.add(jLabel6);

        new_task.setBackground(new java.awt.Color(255, 255, 51));
        new_task.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        new_task.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_task.setText(bundle.getString("NEW TASK")); // NOI18N
        new_task.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        new_task.setMaximumSize(new java.awt.Dimension(150, 40));
        new_task.setPreferredSize(new java.awt.Dimension(150, 40));
        new_task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                new_taskMouseReleased(evt);
            }
        });
        pnlToolbar.add(new_task);
        new_task.getAccessibleContext().setAccessibleName(bundle.getString("NEW TASK")); // NOI18N

        jLabel8.setText(bundle.getString("  ")); // NOI18N
        pnlToolbar.add(jLabel8);

        new_project.setBackground(new java.awt.Color(255, 255, 51));
        new_project.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        new_project.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_project.setText(bundle.getString("NEW PROJECT")); // NOI18N
        new_project.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        new_project.setMaximumSize(new java.awt.Dimension(150, 40));
        new_project.setPreferredSize(new java.awt.Dimension(150, 40));
        new_project.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                new_projectMouseReleased(evt);
            }
        });
        pnlToolbar.add(new_project);
        new_project.getAccessibleContext().setAccessibleName(bundle.getString("NEW PROJECT")); // NOI18N

        jLabel10.setText(bundle.getString("  ")); // NOI18N
        pnlToolbar.add(jLabel10);

        new_profile.setBackground(new java.awt.Color(255, 255, 51));
        new_profile.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        new_profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_profile.setText(bundle.getString("NEW PROFILE")); // NOI18N
        new_profile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        new_profile.setMaximumSize(new java.awt.Dimension(150, 40));
        new_profile.setPreferredSize(new java.awt.Dimension(150, 40));
        new_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                new_profileMouseReleased(evt);
            }
        });
        pnlToolbar.add(new_profile);
        new_profile.getAccessibleContext().setAccessibleName(bundle.getString("NEW PROFILE")); // NOI18N

        jLabel13.setText(bundle.getString("  ")); // NOI18N
        pnlToolbar.add(jLabel13);

        jLabel11.setText(bundle.getString("  ")); // NOI18N
        jLabel11.setMaximumSize(new java.awt.Dimension(80, 16));
        jLabel11.setPreferredSize(new java.awt.Dimension(80, 16));
        pnlToolbar.add(jLabel11);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(bundle.getString("LOG OUT")); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 454545));
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        pnlToolbar.add(jLabel7);
        jLabel7.getAccessibleContext().setAccessibleName(bundle.getString("LOGOUT")); // NOI18N

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

    private void new_taskMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_taskMouseReleased
        // TODO add your handling code here:
        NewTask newTask = new NewTask(user, this);
        newTask.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_new_taskMouseReleased

    private void new_projectMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_projectMouseReleased
        // TODO add your handling code here:
        JFrame window = new JFrame();
        JPanel panel = new NewProjectViewPanel();
        window.setSize(1000, 800);
        window.add(panel);
        window.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_new_projectMouseReleased

    private void new_profileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_profileMouseReleased
        
        
        JFrame newUser = new NewUserFactory();
        newUser.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_new_profileMouseReleased

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        // TODO add your handling code here:
        Loader.save();
        this.dispose();
        Login_Screen login  = new Login_Screen();
        login.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        User_Profile user_Profile = new User_Profile(Loader.getCurrentlyLogged());
        user_Profile.setVisible(rootPaneCheckingEnabled);
    }
    
    private void AllProjectsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllProjectsMouseReleased
        JFrame projects = new AllProjectsSummary(Loader.getCurrentlyLogged());
        projects.setVisible(true);
    }//GEN-LAST:event_AllProjectsMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Loader.saveDimension(this.getClass().getName(), this.getSize());
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            this.setPreferredSize(Loader.lookupDimension(this.getClass().getName()));
            pack();
        }catch(Exception ex){
            LOG.log(Level.SEVERE, java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("CHYBA PRI CITANI ROZMEROV Z XML SUBORU"));
        }
    }//GEN-LAST:event_formWindowOpened

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
                if (java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("NIMBUS").equals(info.getName())) {
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
        User user = new User(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("ANDREA"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("ADAM"),java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("ADA"), 88, java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("HOLIC 12"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("USER"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("CESTA K OBRAZKU"));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllProjects;
    private javax.swing.JPanel current_users;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel new_profile;
    private javax.swing.JLabel new_project;
    private javax.swing.JLabel new_task;
    private javax.swing.JPanel notes;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlToolbar;
    private javax.swing.JPanel projectPanel;
    private javax.swing.JPanel tasks;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables

    /**
     * Tato metoda zobrazi graf s rozlozenim prace na Taskoch.
     */
    protected void showGraph(){
        JPanel graph = new UserTaskChart(user);
        graph.setPreferredSize(graphPanel.getPreferredSize());
        
        graph.setVisible(true);
        graphPanel.setLayout(new BorderLayout());
        graphPanel.removeAll();
        graphPanel.add(graph, BorderLayout.CENTER);
        graphPanel.revalidate();
        graphPanel.repaint();
       
    }
    
    /**
     * Metoda sluzi pre zistenie aktualnej instancie okna.
     * @return Instancia triedy Main_Window
     */
    public static Main_Window getInstance(){
        return instance;
    }
    
        
    /**
     * Metoda, ktora zobrazi vsetkych spolupracovnikov na projekte.
     * @param project 
     */
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
    
    /**
     * Tato metoda zobrazi poznamkovy blok aj s poznamkami, ak su.
     */
    private void showNotes(){
        JTextPane jTextPane = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(jTextPane);
        JLabel jLabel = new JLabel(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("NOTES"));
        jLabel.setFont(new java.awt.Font(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("SEGOE UI LIGHT"), 0, 20));
        
        notes.setLayout(new BorderLayout());
        notes.removeAll();
        jTextPane.setPreferredSize(notes.getPreferredSize());
        
        notes.add(jLabel, BorderLayout.NORTH);
        notes.add(scrollPane, BorderLayout.CENTER);
        jTextPane.setFont(new java.awt.Font(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("SEGOE UI LIGHT"), 0, 15));
        
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true);

        SimpleAttributeSet invoice_text = new SimpleAttributeSet();
        StyleConstants.setItalic(invoice_text, true);
        
        jTextPane.getDocument().addDocumentListener(new MyDocumentListener(jTextPane));
        
        if (!Loader.getCurrentlyLogged().getNotes().isEmpty())
            jTextPane.setText(Loader.getCurrentlyLogged().getNotes());
        
        notes.revalidate();
        notes.repaint();
    }
    
    /**
     * Tato metoda zobrazi inforamacie o momentalnom pouzivatelovi.
     */
    private void showCurrentUser(){
        //Sysstem.out.println(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("USER = {0}"), new Object[] {user.getType())});
        JPanel current = new Current_User(user);
        current.setPreferredSize(current_users.getPreferredSize());
        
        current.setVisible(true);
        current_users.setLayout(new BorderLayout());
        current_users.removeAll();
        current_users.add(current, BorderLayout.CENTER);
        current_users.revalidate();
        current_users.repaint();
    }
    
    /**
     * Tu sa vytvori novy kalendar po pridani Tasku.
     */
    public void refreshCalendar(){
        jPanel7.removeAll();

        CalendarProgram calendarProgram = new CalendarProgram();
        calendarProgram.create(jPanel7, this.getContentPane());
    }
    
    /**
     * Metoda, ktora zobrazi najblizsi task pre usera.
     */
    public void showTask(){
        JLabel popis;
        JPanel current_none = new JPanel();
        Task closes_Task;
        if (Loader.getCurrentlyLogged().getUserTasks() == null){
            popis = new JLabel(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("USER HAS NO TASKS!"));
            current_none.add(popis);
            current_none.setVisible(true);
            tasks.setLayout(new BorderLayout());
            tasks.removeAll();
            tasks.add(current_none, BorderLayout.CENTER);
            tasks.revalidate();
            tasks.repaint();
        }
        else{
            closes_Task = Loader.getCurrentlyLogged().getUserTasks().get(0);
            for (Task userTask : Loader.getCurrentlyLogged().getUserTasks()) {
                if (userTask.getDeadline().before(closes_Task.getDeadline()))
                    closes_Task = userTask;
            }
            JPanel current = new Task_show(closes_Task);
            tasks.add(current, BorderLayout.CENTER);
            current.setPreferredSize(tasks.getPreferredSize());
        
            current.setVisible(true);
            tasks.setLayout(new BorderLayout());
            tasks.removeAll();
            tasks.add(current, BorderLayout.CENTER);
            tasks.revalidate();
            tasks.repaint();
        }
    }
    
    /**
     * Metoda, ktora zobrazuje tlacitka v liste podla typu usera.
     */
    private void hide_buttons(){
        String type_of_user = Loader.getCurrentlyLogged().getType();
        
        switch (type_of_user) {
            case "user":
                new_project.setVisible(false);
                new_profile.setVisible(false);
                break;
            case "project_manager":
                new_project.setVisible(false);
                new_profile.setVisible(false);
                break;
            case "director":
                new_profile.setVisible(false);
                break;
            default:
                break;
        }
    }
    
}

class MyDocumentListener implements DocumentListener {
    final String newline = "\n";
    private JTextPane jTextPane;

    public MyDocumentListener(JTextPane jTextPane) {
        this.jTextPane = jTextPane;
    }
        /**
         * Metoda, ktora sa vola pri zmene Textu v Notes.
         * @param e 
         */
        @Override 
        public void insertUpdate(DocumentEvent e) {
            
            Loader.getCurrentlyLogged().setNotes(jTextPane.getText());
            Loader.save();
        }
        /**
         * Metoda, ktora sa vola pri mazani textu v chate.
         * @param e 
         */
        @Override
        public void removeUpdate(DocumentEvent e) {
            //updateLog(e, "removed from");
            Loader.getCurrentlyLogged().setNotes(jTextPane.getText());
            Loader.save();
        }
        /**
         * Metoda, ktora sa vola pri zmene textoveho pola.
         * @param e 
         */
        @Override
        public void changedUpdate(DocumentEvent e) {
            //Plain text components don't fire these events.
            Logger logger = Logger.getLogger(this.getClass().getName());
            logger.log(Level.INFO, "TextArea was changed.");
        }
    }