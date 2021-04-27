/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sk.stu.fiit.Admin;
import sk.stu.fiit.Loader;
import sk.stu.fiit.Priorities;
import sk.stu.fiit.Project;
import sk.stu.fiit.Tasks.Task;
import sk.stu.fiit.Team;
import sk.stu.fiit.User;

/**
 *
 * @author adamh
 */
public class Login_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Login_Screen
     */
    public Login_Screen() {
        try {

            /*Loader.load();
            Project project = Loader.getUsers().get(0).getProjects().get(3);
            User user = Loader.getUsers().get(1);
            user.addProject(project);
            Loader.save();*/
            /*ArrayList<User> iny_zanestannci = new ArrayList<>();
            iny_zanestannci.add(Loader.getUsers().get(1));
            iny_zanestannci.add(Loader.getUsers().get(2));
            iny_zanestannci.add(Loader.getUsers().get(3));
            Team team = new Team(iny_zanestannci, "Dvojkarysky tim");
            project.add(team);
            Loader.save();*/
            
            /*Loader.load();
            Project project = new Project("Holikasd", Priorities.NORMAL, "hehe", "11", "Vyuplnovi dilino jako.");
            Team team = new Team(Loader.getUsers(), "Tim cislo jednicak");
            project.add(team);
            User user = Loader.getUsers().get(0);
            System.out.println("user name = " + user.getUsername());
            user.addProject(project);
            Loader.save();*/
//                    User user = new User("jonas.k", "dlhy","Jonas Kratky", 12, "Ilava 99", "user", "C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");
//
//        Task task1 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "toto je super husty popis", "Muziker_Site");
//        Task task2 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "Praca na tejto rychle rastujcej stranke o dronoch lulW", "Drony.sk");
//        Task task3 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "Task, ktory vytvara fatkury pre firmu Yanfeng, hlavne ne napadne jako :)", "Yanfeng");
//        Task task4 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "Task pre super firmu Reforamta LOLIIIIK XD", "Reformata stranka");
//        user.addUserTask(task1);
//        user.addUserTask(task2);
//        user.addUserTask(task3);
//        user.addUserTask(task4);
//        Loader.addUser(user);
//        User user1 = new User("edvard.p", "neparny","Edvard Parny", 13, "Ilava 99","user", "C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");
//        Loader.addUser(user1);
//        User user2 = new User("marina.k", "skareda","Marina Krasna", 14, "Ilava 99", "user","C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");
//        Loader.addUser(user2);
//        User user3 = new User("petra.s", "vlhka","Petra Sucha", 15, "Ilava 99", "project_manager","C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");
//        Loader.addUser(user3);
//        User user4 = new User("matus.v", "smradlavy","Matus Vonavy", 16, "Ilava 99", "user","C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");
//        Loader.addUser(user4);
//        User user5 = new User("otepka.d", "otepkis","Dagmar Otepka", 16, "Senica 63", "director", "C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_2.jpg");
//        Loader.addUser(user5);
//        User user6 = new User("admin", "admin","Dagmar OtepkaLUL", 16, "Senica 63", "admin", "C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_2.jpg");
//        Loader.addUser(user6);
//        Loader.save();

            User user = new User("jonas.k", "dlhy","Jonas Kratky", 12, "Ilava 99", "user", "C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");

        Task task1 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "toto je super husty popis", "Muziker_Site");
        Task task2 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "Praca na tejto rychle rastujcej stranke o dronoch lulW", "Drony.sk");
        Task task3 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "Task, ktory vytvara fatkury pre firmu Yanfeng, hlavne ne napadne jako :)", "Yanfeng");
        Task task4 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "Task pre super firmu Reforamta LOLIIIIK XD", "Reformata stranka");
        user.addUserTask(task1);
        user.addUserTask(task2);
        user.addUserTask(task3);
        user.addUserTask(task4);
        Loader.addUser(user);
        User user1 = new User("edvard.p", "neparny","Edvard Parny", 13, "Ilava 99","user", "C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");
        Loader.addUser(user1);
        User user2 = new User("marina.k", "skareda","Marina Krasna", 14, "Ilava 99", "user","C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");
        Loader.addUser(user2);
        User user3 = new User("petra.s", "vlhka","Petra Sucha", 15, "Ilava 99", "project_manager","C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");
        Loader.addUser(user3);
        User user4 = new User("matus.v", "smradlavy","Matus Vonavy", 16, "Ilava 99", "user","C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_1.png");
        Loader.addUser(user4);
        User user5 = new User("otepka.d", "otepkis","Dagmar Otepka", 16, "Senica 63", "director", "C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_2.jpg");
        Loader.addUser(user5);
        User user6 = new User("admin", "admin","Dagmar OtepkaLUL", 16, "Senica 63", "admin", "C:\\Users\\adamh\\Pictures\\FIITka - obrazky\\VAVA\\logo_2.jpg");
        Loader.addUser(user6);
        Loader.save();

Loader.load();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login_Screen.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 740));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 740));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel2.setText("Vitajte v programe!");
        jLabel2.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.add(jLabel2, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jTextField1.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField1.setPreferredSize(new java.awt.Dimension(400, 70));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jTextField1, gridBagConstraints);

        jLabel1.setPreferredSize(new java.awt.Dimension(37, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Username:");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 80));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Password:");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 80));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jLabel4, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jButton1.setText("Login");
        jButton1.setPreferredSize(new java.awt.Dimension(200, 80));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel2.add(jButton1, gridBagConstraints);

        jLabel5.setPreferredSize(new java.awt.Dimension(37, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel2.add(jLabel5, gridBagConstraints);

        jPasswordField1.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(400, 70));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jPasswordField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
        User user = log_user();
        if (user != null){
            Loader.setCurrentlyLogged(user);
            Main_Window main_Window = new Main_Window(user);
            main_Window.setVisible(rootPaneCheckingEnabled);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1MouseReleased

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
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public User log_user(){
        String username = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        
        ArrayList<User> users = Loader.getUsers();
        System.out.println("Pocet userov je: " + users.size());
        for (User user : users) {
            System.out.println("username = " + user.getUsername());
            System.out.println("password = " + user.getPassword());
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                return user;
        }
        
        System.out.println("password = " + password);
        System.out.println("username = " + username);
        
        return null;
    }
}
