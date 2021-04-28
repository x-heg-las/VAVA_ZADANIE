/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.Users_GUI;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sk.stu.fiit.InputVerifiers;
import sk.stu.fiit.Loader;
import sk.stu.fiit.User;

/**
 * Trieda pre zobrazenie pouzivatela.
 * @author adamh
 */
public class User_Profile extends javax.swing.JFrame {
    private User user;
    private String image_path = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("");
    /**
     * Creates new form User_Profile
     */
    public User_Profile(User user) {
        this.user = user;
        initComponents();
        SetImageSize();
        enable_input();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        picture = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        new_image = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle"); // NOI18N
        jLabel1.setText(bundle.getString("USERNAME")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 40));
        getContentPane().add(jLabel1, new java.awt.GridBagConstraints());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(bundle.getString("TYPE")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(bundle.getString("AGE")); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(bundle.getString("ADDRESS")); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(bundle.getString("PICTURE")); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel5, gridBagConstraints);

        username.setEditable(false);
        username.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        if(user.getUsername().equals(Loader.getCurrentlyLogged().getUsername()))
        username.setText(user.getUsername());
        else password.setText("Not accesible");
        username.setPreferredSize(new java.awt.Dimension(120, 40));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new java.awt.GridBagConstraints());

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTextField2.setText(user.getType());
        jTextField2.setPreferredSize(new java.awt.Dimension(120, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jTextField2, gridBagConstraints);

        age.setEditable(false);
        age.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        age.setText(Integer.toString(user.getAge()));
        age.setPreferredSize(new java.awt.Dimension(120, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(age, gridBagConstraints);

        address.setEditable(false);
        address.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        address.setText(user.getAddress());
        address.setPreferredSize(new java.awt.Dimension(120, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(address, gridBagConstraints);

        picture.setText(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("JLABLE1"));
        picture.setPreferredSize(new java.awt.Dimension(120, 120));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        getContentPane().add(picture, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(bundle.getString("PASSWORD")); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 40));
        getContentPane().add(jLabel6, new java.awt.GridBagConstraints());

        name.setEditable(false);
        name.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        name.setText(user.getName());
        name.setPreferredSize(new java.awt.Dimension(120, 40));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(name, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(bundle.getString("NAME")); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel7, gridBagConstraints);

        password.setEditable(false);
        password.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        if(user.getUsername().equals(Loader.getCurrentlyLogged().getUsername()))
        password.setText(user.getPassword());
        else password.setText("Not accesible");
        password.setPreferredSize(new java.awt.Dimension(120, 40));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new java.awt.GridBagConstraints());

        jButton1.setText(bundle.getString("CONFIRM")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);
        if(!user.getUsername().equals(Loader.getCurrentlyLogged().getUsername()))
        jButton1.setVisible(false);

        new_image.setText(bundle.getString("NEW IMAGE")); // NOI18N
        new_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                new_imageMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(new_image, gridBagConstraints);
        new_image.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:

        String regex = "\\d+";
        try{
            InputVerifiers.hasEmptyFields(username, password, name, address, age);
            if (!age.getText().matches(regex)){
                JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("AGE CAN CONTAIN ONLY NUMBERS!"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("WRONG AGE TYPE!"), JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        } catch(Exception e){
             JOptionPane.showMessageDialog(rootPane, "Chosen file is not image!", "Wrong age type!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Loader.findUser(Loader.getCurrentlyLogged().getUsername()).setName(name.getText());
        Loader.findUser(Loader.getCurrentlyLogged().getUsername()).setUsername(username.getText());
        Loader.findUser(Loader.getCurrentlyLogged().getUsername()).setAge(Integer.parseInt(age.getText()));
        Loader.findUser(Loader.getCurrentlyLogged().getUsername()).setAddress(address.getText());
        Loader.findUser(Loader.getCurrentlyLogged().getUsername()).setPassword(password.getText());
        Loader.findUser(Loader.getCurrentlyLogged().getUsername()).setPicture(image_path);
        
        Loader.save();
        JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("CHANGES SAVED!"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("SUCCES"), JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseReleased

    private void new_imageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_imageMouseReleased
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
          fc.setCurrentDirectory(new File(".")); //NOI18N
        int desc = fc.showOpenDialog(fc);
        if (desc == 1)
            return;
        image_path = fc.getSelectedFile().getAbsolutePath();
        File file = new File(image_path);
            if (!InputVerifiers.check_image(file)){
                JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("CHOSEN FILE IS NOT IMAGE!"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("WRONG AGE TYPE!"), JOptionPane.ERROR_MESSAGE);
                image_path = java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("");
                return;
            }
        JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("NEW IMAGE CHOSEN!"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("SUCCESS"), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_new_imageMouseReleased

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
            java.util.logging.Logger.getLogger(User_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        User user = new User(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("IGNAC.B"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("LAJZA"),java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("IGNAC BAJZA"), 44, java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("HODONIN 17"),java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("USER"), java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("C:\\USERS\\ADAMH\\PICTURES\\FIITKA - OBRAZKY\\VAVA\\LOGO_2.JPG"));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Profile(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField name;
    private javax.swing.JButton new_image;
    private javax.swing.JTextField password;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Metoda na upravu velkosti obrazka pre okno.
     */
    public void SetImageSize(){
        ImageIcon icon = new ImageIcon(user.getPicture());
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        picture.setIcon(newImc);
    }
    
    /**
     * Metoda v pripade, ze chcem zmenit svoje nastavenia.
     */
    private void enable_input(){
        if(user.getUsername().equals(Loader.getCurrentlyLogged().getUsername())){
            username.setEditable(true);
            name.setEditable(true);
            age.setEditable(true);
            address.setEditable(true);
            password.setEditable(true);
            new_image.setVisible(true);
        }
    }
}
