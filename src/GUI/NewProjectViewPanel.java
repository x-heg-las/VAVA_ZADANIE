/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import sk.stu.fiit.InputVerifiers;
import sk.stu.fiit.Loader;
import sk.stu.fiit.Priorities;
import sk.stu.fiit.Project;

/**
 *
 * @author patoh
 */
public class NewProjectViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProjectViewPanel
     */
    public NewProjectViewPanel() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Project", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tag");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Project Priority");
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
        radioUrgent.setText("Urgent");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(radioUrgent, gridBagConstraints);
        projectPriorityGroup.add(radioUrgent);

        radioNonUrgent.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        radioNonUrgent.setForeground(new java.awt.Color(0, 0, 0));
        radioNonUrgent.setText("Non-Urgent");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(radioNonUrgent, gridBagConstraints);
        projectPriorityGroup.add(radioNonUrgent);

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Create project");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jButton2, gridBagConstraints);

        jLabel6.setText("prefix added to the project");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(jLabel6, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String errMessage = "";
        try{
            errMessage = "";
            //Overenie vstupu
            InputVerifiers.hasEmptyFields(taDescription, taID, taName, taTag);
            Priorities priority;
            
            if(Loader.getProjects().containsKey(taID.getText())){
                errMessage = "Duplicit project ID, consider changing it.";
                throw new RuntimeException("Duplicit project ID");
            }

            if(radioNonUrgent.isSelected())
                priority = Priorities.NONURGENT;
            else
                priority = Priorities.URGENT;

            Project newProject = new Project(taName.getText(), priority,
            taTag.getText(), taID.getText(), taDescription.getText());
            
            JPanel next = new ProjectTeammates(newProject);
            removeAll();
            next.setVisible(true);
            add(next);
            revalidate();
            repaint();
        
        }catch (RuntimeException runt){
            //TODO :: add loggger
            JOptionPane.showMessageDialog(null ,"Wrong input: " + errMessage , "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
