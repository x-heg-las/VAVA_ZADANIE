/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import sk.stu.fiit.CurrentDateSelectionConstraint;
import sk.stu.fiit.InputVerifiers;
import sk.stu.fiit.Loader;
import sk.stu.fiit.Priorities;
import sk.stu.fiit.Project;

/**
 * Trieda ovladajuca JFrame pre zadavanie novych projektov.
 * @author Patrik Heglas
 */
public class NewProjectViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProjectViewPanel
     */
    
    private static final Logger LOG = Logger.getLogger(NewProjectViewPanel.class.getName());
    /**
     * Konstruktor triedy NewProjectViewPanel inicializujuci okno pre vytvaranie
     * projektov .
     */
    public NewProjectViewPanel() {
        CurrentDateSelectionConstraint constraint = new CurrentDateSelectionConstraint();
        
        initComponents();
        
        deadline.addDateSelectionConstraint(constraint);
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

        projectPriorityGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        taName = new javax.swing.JTextField();
        taID = new javax.swing.JTextField();
        taTag = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        radioUrgent = new javax.swing.JRadioButton();
        radioNonUrgent = new javax.swing.JRadioButton();
        btnCreateProject = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deadline = new org.jdatepicker.JDatePicker();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Project", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle"); // NOI18N
        jLabel1.setText(bundle.getString("NAME")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(bundle.getString("ID")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(bundle.getString("TAG")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(bundle.getString("DESCRIPTION")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText(bundle.getString("PROJECT PRIORITY")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jLabel5, gridBagConstraints);

        taName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(taName, gridBagConstraints);

        taID.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(taID, gridBagConstraints);

        taTag.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(taTag, gridBagConstraints);

        taDescription.setColumns(20);
        taDescription.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        taDescription.setRows(5);
        jScrollPane1.setViewportView(taDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jScrollPane1, gridBagConstraints);

        radioUrgent.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        radioUrgent.setForeground(new java.awt.Color(0, 0, 0));
        radioUrgent.setText(bundle.getString("URGENT")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(radioUrgent, gridBagConstraints);
        projectPriorityGroup.add(radioUrgent);

        radioNonUrgent.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        radioNonUrgent.setForeground(new java.awt.Color(0, 0, 0));
        radioNonUrgent.setText(bundle.getString("NON-URGENT")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(radioNonUrgent, gridBagConstraints);
        projectPriorityGroup.add(radioNonUrgent);

        btnCreateProject.setBackground(new java.awt.Color(51, 153, 255));
        btnCreateProject.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnCreateProject.setForeground(new java.awt.Color(0, 0, 0));
        btnCreateProject.setText(bundle.getString("CREATE PROJECT")); // NOI18N
        btnCreateProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateProjectMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(btnCreateProject, gridBagConstraints);

        jLabel6.setText(bundle.getString("PREFIX ADDED TO THE PROJECT")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText(bundle.getString("PROJECT'S DEADLINE")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        add(deadline, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Po kliknuti sa vytvori nova instancia objektu Project, ktora sa dalej
     * spracovava.
     * @param evt 
     */
    private void btnCreateProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateProjectMouseClicked
        String errMessage = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("");
        try{
            errMessage = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("");
            //Overenie vstupu
            InputVerifiers.hasEmptyFields(taDescription, taID, taName, taTag);
            Priorities priority;
            
            if(Loader.getProjects().containsKey(taID.getText())){
                
                JOptionPane.showMessageDialog(null ,java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("USERNAME ALREADY USED"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("WARNING") , JOptionPane.WARNING_MESSAGE);
            }
            
            if(Loader.getProjects().containsKey(taID.getText())){
                errMessage = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("DUPLICIT PROJECT ID, CONSIDER CHANGING IT.");
                throw new RuntimeException(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("DUPLICIT PROJECT ID"));
            }
            
           
           

            if(radioNonUrgent.isSelected())
                priority = Priorities.NONURGENT;
            else
                priority = Priorities.URGENT;

            Project newProject = new Project(taName.getText(), priority,
            taTag.getText(), taID.getText(), taDescription.getText());
            
            JPanel next = new ProjectTeammates(newProject);
            Container pane = this.getParent();
            
            Date deadlinedate = ((Calendar) deadline.getModel().getValue()).getTime();
            if(deadline == null){
                errMessage = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("WRONG DEADLINE");
                throw new RuntimeException(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("BAD DATE INPUT"));
            }
            
            newProject.setDeadline(deadlinedate);
            newProject.setProject_manager(Loader.findUser(Loader.getCurrentlyLogged().getUsername()));
            pane.removeAll();
            next.setVisible(true);
            
            pane.add(next);
            pane.revalidate();
            pane.repaint();
        
        }catch (RuntimeException runt){
            LOG.log(Level.SEVERE, runt.getMessage());
            JOptionPane.showMessageDialog(null ,java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("WRONG INPUT: {0}"), new Object[] {errMessage}) , java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("WARNING"), JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateProjectMouseClicked

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProject;
    private org.jdatepicker.JDatePicker deadline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup projectPriorityGroup;
    private javax.swing.JRadioButton radioNonUrgent;
    private javax.swing.JRadioButton radioUrgent;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTextField taID;
    private javax.swing.JTextField taName;
    private javax.swing.JTextField taTag;
    // End of variables declaration//GEN-END:variables
}
