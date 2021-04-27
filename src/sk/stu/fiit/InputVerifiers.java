/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author patoh
 */
public class InputVerifiers {
    
    public static void hasEmptyFields(JComponent... components) throws RuntimeException{
        String content = "";
        for(JComponent component : components){
            
            if(component instanceof JTextField)
                content = ((JTextField) component).getText();
            else if(component instanceof JTextArea)
                content = ((JTextArea) component).getText();
            else if(component instanceof JPasswordField)
                content = Arrays.toString(((JPasswordField) component).getPassword());
            else
                continue;
                
            if(content.trim().isEmpty()){
                throw new RuntimeException("EmptyField");
            }
            
        }
        
    }
    
    public static boolean check_image(File file){        
        try {
            Image image = ImageIO.read(new File(file.getAbsolutePath()));
            if (image == null) {
                return false;
            }
        } catch(IOException ex) {
            return false;
        }
        return true;
    }
    
}
