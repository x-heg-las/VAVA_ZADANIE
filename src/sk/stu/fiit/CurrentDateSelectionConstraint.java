/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.DateModel;
import org.jdatepicker.constraints.DateSelectionConstraint;

/**
 *
 * @author patoh
 */
public class CurrentDateSelectionConstraint implements DateSelectionConstraint{

    private static final SimpleDateFormat formatter;
    
    static{
        formatter = new SimpleDateFormat("yyyy.MM.dd");
    }
    
    @Override
    public boolean isValidSelection(DateModel<?> dm) {
        
        
        Calendar cal = (Calendar) dm.getValue();
        
        if(cal == null){
            cal = Calendar.getInstance();
            cal.set(dm.getYear(), dm.getMonth(), dm.getDay());
        }
        //Kontrola ci zvoleny den je skor ako aktualny den;
        return new Date().before(cal.getTime());
       
    }
    
    
    
}
