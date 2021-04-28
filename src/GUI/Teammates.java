/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sk.stu.fiit.Loader;
import sk.stu.fiit.Project;
import sk.stu.fiit.User;

/**
 * Trieda, kde sa zobrazuju spolupracovnici na projekte.
 * @author patoh
 */
public class Teammates extends javax.swing.JPanel {
    private ArrayList<Project> array_projects = new ArrayList<>();
    private ArrayList<User> array_users = new ArrayList<>();
    /**
     * Creates new form Teammates
     */
    public Teammates(Project project) {
        initComponents();
        get_projects();
        if (array_projects.size() != 0)
            get_names(array_projects.get(0).getProjectName());
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

        String[] array = get_projects();
        if (array == null) return;
        jComboBox1 = new javax.swing.JComboBox<>(array);
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Project ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jComboBox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox1.addItemListener(new ItemListener() {
            // Listening if a new items of the combo box has been selected.
            public void itemStateChanged(ItemEvent event) {
                JComboBox jComboBox1 = (JComboBox) event.getSource();
                // The item affected by the event.
                String item = (String)event.getItem();
                //jList1 = new javax.swing.JList(get_names(item));
                get_names(item);
            }
        });
        /*
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        */
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jComboBox1, gridBagConstraints);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teammates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jList1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = get_names(array_projects.get(0).getProjectName());
            String[] strings = {java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("NONE")};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Metoda, ktora ziska vsetky mena userov na danom projekte.
     * @param project_name
     * @return 
     */
    private String[] get_names(String project_name){
        ArrayList<User> users = Loader.getUsers();
        String[] array_names = new String[Loader.getUsers().size()];
        
        array_users.clear();
        for (User user : users) {
            for (Project project : user.getProjects()) {
                if (project.getProjectName().equals(project_name)){
                    array_users.add(user);
                }
            }
        }
        
        for (int i = 0; i < array_users.size(); i++) {
            array_names[i] = array_users.get(i).getName();
        }
        jList1.setListData(array_names);
        return array_names;
    }
    
    /**
     * Metoda, na ziskanie "kliknuteho" pouzivatela.
     * @return 
     */
    public User get_clicked(){
        ArrayList<User> users = Loader.getUsers();
        if ( array_projects.size() == 0 )
            return null;
        if (jList1.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(jComboBox1, "Choose teammate!", "Choose teammate", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return array_users.get(jList1.getSelectedIndex());
    }
    
       /**
     * Tato metoda ziska vsetky projekty, medzi ktorymi si moze user prepinat.
     * @return 
     */
    private String[] get_projects(){
        if (Loader.getCurrentlyLogged().getProjects() == null){
            return null;
        }
        String[] names = new String[Loader.getCurrentlyLogged().getProjects().size()];
        int i = 0;
        
        for (Project project : Loader.getCurrentlyLogged().getProjects()) {
            array_projects.add(project);
            names[i] = project.getProjectName();
            i++;
        }
        return names;
    }
}
