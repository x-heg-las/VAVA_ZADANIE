/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import sk.stu.fiit.Project;

/**
 *  Trieda reprezentujuca JPanel, ktory sa vyuziva ako custom render v zozname
 * s projektmi.
 * @author Patrik Heglas
 */
public class ProjectTableItem extends javax.swing.JPanel {

    private final Project project;
    private static final Logger LOG = Logger.getLogger(ProjectTableItem.class.getName());
    
    /**
     * Konstruktor pre JPanel, ktory sluzi ako polozka v tabulke obsahujucej
     * vsetky vytvorene projekty.
     * @param project Projekt, ktoreho detail sa bude zobrazovat.
     */
    public ProjectTableItem(Project project) {
        this.project = project;
        initComponents();
        setValues();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDeadline = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblProjectManager = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(516, 100));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle"); // NOI18N
        jLabel1.setText(bundle.getString("PROJECT NAME")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(bundle.getString("PROJECT ID")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(bundle.getString("DEADLINE")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(jLabel3, gridBagConstraints);

        lblDeadline.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblDeadline.setForeground(new java.awt.Color(0, 0, 0));
        lblDeadline.setText(bundle.getString("JLABEL4")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(lblDeadline, gridBagConstraints);

        lblId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText(bundle.getString("JLABEL5")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(lblId, gridBagConstraints);

        lblName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText(bundle.getString("JLABEL7")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(lblName, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(bundle.getString("PROJECT MANAGER")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(jLabel4, gridBagConstraints);

        lblProjectManager.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblProjectManager.setForeground(new java.awt.Color(0, 0, 0));
        lblProjectManager.setText(bundle.getString("JLABEL5")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(lblProjectManager, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDeadline;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProjectManager;
    // End of variables declaration//GEN-END:variables

    /**
     * Funkcia nastavi komponenty nachadzajuce sa v JPanel na pozadovane
     * hodnoty podla priradeneho proektu.
     */
    private void setValues() {
        try{
            if(project != null){
              lblDeadline.setText(new SimpleDateFormat(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("DD.MM.YYYY")).format(project.getDeadline()));
              lblId.setText(project.getId());
              lblName.setText(project.getProjectName());
              lblProjectManager.setText(project.getProject_manager().getName());
            }
        }catch(Exception ex){
            LOG.log(Level.SEVERE, ex.getMessage());
        }
    }
}
