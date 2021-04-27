/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import sk.stu.fiit.CurrentDateSelectionConstraint;
import sk.stu.fiit.InputVerifiers;
import sk.stu.fiit.Priorities;
import sk.stu.fiit.Project;
import sk.stu.fiit.TaskState;
import sk.stu.fiit.User;
import sk.stu.fiit.Loader;
import sk.stu.fiit.Tasks.Task;

/**
 *
 * @author patoh
 */
public class NewTask extends javax.swing.JFrame {

    private Project project;
    private ArrayList<User> asignedTo;
    private User curentUser;
    private Main_Window main;
    private final Logger LOG = Logger.getLogger(NewTask.class.getName());
    
    public NewTask(User user, Main_Window main)
    {
        this.main = main;
        this.project = null;
        this.curentUser = user;
        initComponents();
        CurrentDateSelectionConstraint constraint = new CurrentDateSelectionConstraint();
        taskDeadline.addDateSelectionConstraint(constraint);
        btnAssignUser.setVisible(false);
        userCombo.setVisible(false);
        
        DefaultListModel<User> model = ( DefaultListModel<User>) userList.getModel();
        model.addElement(user);
        userList.setModel(model);
        initializeValues();
    }
    
    public NewTask(Project project) {
        this.project = project;
        this.curentUser = null;
        this.asignedTo = new ArrayList<>();
        initComponents();
        CurrentDateSelectionConstraint constraint = new CurrentDateSelectionConstraint();
        taskDeadline.addDateSelectionConstraint(constraint);
        taskDeadline.addDateSelectionConstraint(new CurrentDateSelectionConstraint(project.getDeadline()));
        initializeValues();
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        taSummary = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        priorityCombo = new javax.swing.JComboBox<>(Priorities.values());
        stateCombo = new javax.swing.JComboBox<>(TaskState.values());
        jLabel6 = new javax.swing.JLabel();
        taskDeadline = new org.jdatepicker.JDatePicker();
        jScrollPane2 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        projectLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        projectTextLbl = new javax.swing.JLabel();
        projectIdLbl = new javax.swing.JLabel();
        btnCreateTask = new javax.swing.JButton();
        bntCancel = new javax.swing.JButton();
        btnAssignUser = new javax.swing.JButton();
        userCombo = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Task", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Summary");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jLabel3, gridBagConstraints);

        taDescription.setColumns(20);
        taDescription.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        taDescription.setLineWrap(true);
        taDescription.setRows(5);
        taDescription.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        taSummary.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(taSummary, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.green, null));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 509));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Priority");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setText("State");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel5, gridBagConstraints);

        priorityCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.05;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(priorityCombo, gridBagConstraints);

        stateCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.05;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(stateCombo, gridBagConstraints);

        jLabel6.setText("Deadline");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel6, gridBagConstraints);

        taskDeadline.setMinimumSize(new java.awt.Dimension(202, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.05;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(taskDeadline, gridBagConstraints);

        userList.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        userList.setModel(new DefaultListModel<User>());
        userList.setMaximumSize(null);
        userList.setMinimumSize(null);
        userList.setPreferredSize(null);
        jScrollPane2.setViewportView(userList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        jLabel7.setText("Assigned to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel7, gridBagConstraints);

        projectLabel.setText("Project");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(projectLabel, gridBagConstraints);

        idLabel.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(idLabel, gridBagConstraints);

        projectTextLbl.setText("jLabel10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weighty = 0.05;
        jPanel2.add(projectTextLbl, gridBagConstraints);

        projectIdLbl.setText("jLabel11");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 0.05;
        jPanel2.add(projectIdLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel2, gridBagConstraints);

        btnCreateTask.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnCreateTask.setText("Create");
        btnCreateTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateTaskMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(btnCreateTask, gridBagConstraints);

        bntCancel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bntCancel.setText("Cancel");
        bntCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntCancelMouseClicked(evt);
            }
        });
        bntCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(bntCancel, gridBagConstraints);

        btnAssignUser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnAssignUser.setText("Assign");
        btnAssignUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAssignUserMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(btnAssignUser, gridBagConstraints);

        userCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Loader.getUsers().forEach(user ->{
            userCombo.addItem(user);
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(userCombo, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntCancelActionPerformed

    private void btnAssignUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignUserMouseClicked
        int index = userCombo.getSelectedIndex();
        
        
        if(index >= 0){
            DefaultListModel<User> model = ( DefaultListModel<User>) userList.getModel();
            User user = (User) userCombo.getSelectedItem();
            if(model.contains(user))
                return;
            asignedTo.add(user);
            
            model.addElement(user);
            userList.setModel(model);
        }
    }//GEN-LAST:event_btnAssignUserMouseClicked

    private void btnCreateTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateTaskMouseClicked
        try{
            InputVerifiers.hasEmptyFields(taSummary);
            
            Date deadline = ((Calendar)taskDeadline.getModel().getValue()).getTime();
            Priorities priority = (Priorities) priorityCombo.getSelectedItem();
            if(priority == null){
                priority = Priorities.NORMAL;
            }
            if(deadline != null){
                Task task = new Task(taSummary.getText(), new Date(), deadline, taDescription.getText());
                task.setPriority(priority);
                 
                if(stateCombo.getSelectedIndex() >= 0)
                    {
                        task.setTaskState((TaskState) stateCombo.getSelectedItem());
                    }

                if(project != null){
                    task.setAsignedTo(asignedTo);
                    
                    //priradenie uloh k pouzivatelom
                    for(User user : asignedTo){
                        Loader.findUser(user.getUsername()).addUserTask(task);
                    }
                    project.add(task);
                }
                else if (curentUser != null){
                    
                    Loader.findUser(curentUser.getUsername()).addUserTask(task);
                }
                dispose();
                
                UserTaskChart chartInstance = UserTaskChart.getCurrentInstance();
                if(chartInstance != null && Loader.getCurrentlyLogged() != null &&
                        Main_Window.getInstance() != null){
                    chartInstance.updateChartInstance(Loader.getCurrentlyLogged());
                    Main_Window.getInstance().showGraph();
                }
                
                if (main != null){
                    main.showTask();
                    main.refreshCalendar();
                }
                
            }else
                throw new Exception("Zle udaje");
            
        }catch(Exception ex){
            //TODO :: pridaj logger
        }
        
        Loader.save();
    }//GEN-LAST:event_btnCreateTaskMouseClicked

    private void bntCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelMouseClicked
        dispose();
    }//GEN-LAST:event_bntCancelMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       Loader.saveDimension(this.getClass().getName(), this.getSize());
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       try{
            this.setPreferredSize(Loader.lookupDimension(this.getClass().getName()));
            pack();
        }catch(Exception ex){
            LOG.log(Level.SEVERE, "Chyba pri citani rozmerov z XML suboru");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //testovacia vzorka
                //new NewTask( new User("Patrik", 21, "ahoj", "ahoj") ).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancel;
    private javax.swing.JButton btnAssignUser;
    private javax.swing.JButton btnCreateTask;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<Priorities> priorityCombo;
    private javax.swing.JLabel projectIdLbl;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JLabel projectTextLbl;
    private javax.swing.JComboBox<TaskState> stateCombo;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTextField taSummary;
    private org.jdatepicker.JDatePicker taskDeadline;
    private javax.swing.JComboBox<User> userCombo;
    private javax.swing.JList<User> userList;
    // End of variables declaration//GEN-END:variables

    private void initializeValues(){
    
        if(curentUser != null && project == null){
            idLabel.setVisible(false);
            projectLabel.setVisible(false);
            projectTextLbl.setVisible(false);
            projectIdLbl.setVisible(false);
        }else if(curentUser == null && project != null){
            projectIdLbl.setText(project.getId());
            projectTextLbl.setText(project.getProjectName());
        }
    
    }
    
}
