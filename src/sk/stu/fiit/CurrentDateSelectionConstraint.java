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
 *  Trieda reprezentujuca obmedzenie vyberu dna, ktore sa moze aplikovat na komponent
 *  JDatePicker. Trieda implementuje rozhranie DateSelectionConstraint.
 */
public class CurrentDateSelectionConstraint implements DateSelectionConstraint{

    private static final SimpleDateFormat formatter;
    private Date upperConstraint;
    
    /**
     * Zakladny konstruktor triedy. 
     */
    public CurrentDateSelectionConstraint() {
        upperConstraint = null;
    }
    
    /**
     * Konstruktor triedy, ktory sposobi to, ze sa obmedzenie vyberu datumu aplikuje
     * z oboch stran.
     * @param upperConstraint Horna hranica, od ktorej bude vyber zakazany.
     */
    public CurrentDateSelectionConstraint(Date upperConstraint){
        this.upperConstraint = upperConstraint;
    }
    
    static{
        formatter = new SimpleDateFormat(java.util.ResourceBundle.getBundle("sk/stu/fiit/bundle").getString("YYYY.MM.DD"));
    }
    
    /**
     * Funkcia kontrolujuca, ktory datum je mozne podla zadanych informacii vybrat.
     * @param dm Model datumu.
     * @return True ak je mozne vybrat skumany datum, inak false.
     */
    @Override
    public boolean isValidSelection(DateModel<?> dm) {
        
        
        Calendar cal = (Calendar) dm.getValue();
        
          
        if(cal == null){
            cal = Calendar.getInstance();
            cal.set(dm.getYear(), dm.getMonth(), dm.getDay(),0,0,0);
        }
        
        if(upperConstraint != null ){
            
            if(cal.getTime().after(upperConstraint)){
                dm.setValue(null);
                return false;
                
            }
        }
      
        //Kontrola ci zvoleny den je skor ako aktualny den;
        return new Date().before(cal.getTime());
       
    }
    
    
    
}
