package GUI;

import static com.sun.java.accessibility.util.AWTEventMonitor.addComponentListener;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sk.stu.fiit.Tasks.Task;

public class Standalone_Calendar{
    static JLabel lblMonth, lblYear;
    static JButton btnPrev, btnNext;
    static JTable tblCalendar;
    static JComboBox cmbYear;
    static JFrame frmMain;
    static Container pane;
    static DefaultTableModel mtblCalendar; //Table model
    static JScrollPane stblCalendar; //The scrollpane
    static JPanel pnlCalendar;
    static int realYear, realMonth, realDay, currentYear, currentMonth;
    
    public static void main (String args[]){
        create();
    }
    
    public static void create(){
        //Look and feel
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}
        catch (UnsupportedLookAndFeelException e) {}
        
        //Prepare frame
        frmMain = new JFrame ("Yours Calendar"); //Create frame
        frmMain.setSize(800, 600); //Set size to 400x400 pixels
        pane = frmMain.getContentPane(); //Get content pane
        pane.setLayout(null); //Apply null layout
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close when X is clicked
        //Create controls
        lblMonth = new JLabel ("January");
        lblYear = new JLabel ("Change year:");
        cmbYear = new JComboBox();
        btnPrev = new JButton ("&lt;&lt;");
        btnNext = new JButton ("&gt;&gt;");
        mtblCalendar = new DefaultTableModel(){public boolean isCellEditable(int rowIndex, int mColIndex){return false;}};
        tblCalendar = new JTable(mtblCalendar);
        stblCalendar = new JScrollPane(tblCalendar);
        pnlCalendar = new JPanel(null);
        
        //Set border
        pnlCalendar.setBorder(BorderFactory.createTitledBorder("Calendar"));
        
        //Register action listeners
        btnPrev.addActionListener(new btnPrev_Action());
        btnNext.addActionListener(new btnNext_Action());
        cmbYear.addActionListener(new cmbYear_Action());
        frmMain.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                frmMainComponentResized(evt);
            }
        });
        
        //Add controls to pane
        pane.add(pnlCalendar);
        pnlCalendar.add(lblMonth);
        pnlCalendar.add(lblYear);
        pnlCalendar.add(cmbYear);
        pnlCalendar.add(btnPrev);
        pnlCalendar.add(btnNext);
        pnlCalendar.add(stblCalendar);
        
        //Set bounds
        pnlCalendar.setBounds(0, 0, frmMain.getWidth(), frmMain.getHeight());//320
        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 100, 25);
        lblYear.setBounds(pnlCalendar.getWidth() - 200, 25, 80, 20);
        cmbYear.setBounds(pnlCalendar.getWidth() - 100, 25, 80, 20);
        btnPrev.setBounds(10, 25, 50, 25);
        btnNext.setBounds(260, 25, 50, 25);
        stblCalendar.setBounds(10, 50, pnlCalendar.getWidth() - 30, pnlCalendar.getHeight()-60);//300
        
        //Make frame visible
        frmMain.setResizable(true);
        frmMain.setVisible(true);
        frmMain.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //Get real month/year
        GregorianCalendar cal = new GregorianCalendar(); //Create calendar
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        realMonth = cal.get(GregorianCalendar.MONTH); //Get month
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        currentMonth = realMonth; //Match month and year
        currentYear = realYear;
        
        //Add headers
        String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; //All headers
        for (int i=0; i<7; i++){
            mtblCalendar.addColumn(headers[i]);
        }
        
        tblCalendar.getParent().setBackground(tblCalendar.getBackground()); //Set background
        
        //No resize/reorder
        tblCalendar.getTableHeader().setResizingAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);
        
        //Single cell selection
        tblCalendar.setColumnSelectionAllowed(true);
        tblCalendar.setRowSelectionAllowed(true);
        tblCalendar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //Set row/column count
        tblCalendar.setRowHeight(pnlCalendar.getHeight()/8);//38
        mtblCalendar.setColumnCount(7);
        mtblCalendar.setRowCount(6);
        
        //Populate table
        for (int i=realYear-20; i<=realYear+20; i++){
            cmbYear.addItem(String.valueOf(i));
        }
        
        //Refresh calendar
        refreshCalendar (realMonth, realYear); //Refresh calendar
    }
    
    private static void frmMainComponentResized(java.awt.event.ComponentEvent evt){
        pnlCalendar.setBounds(0, 0, frmMain.getWidth(), frmMain.getHeight());//320
        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 100, 25);
        lblYear.setBounds(pnlCalendar.getWidth() - 200, 25, 80, 20);
        cmbYear.setBounds(pnlCalendar.getWidth() - 100, 25, 80, 20);
        btnPrev.setBounds(10, 25, 50, 25);
        btnNext.setBounds(260, 25, 50, 25);
        stblCalendar.setBounds(10, 50, pnlCalendar.getWidth() - 30, pnlCalendar.getHeight()-60);//300
    }
    
    public static void refreshCalendar(int month, int year){
        //Variables
        String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int nod, som; //Number Of Days, Start Of Month
        
        //Allow/disallow buttons
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);
        if (month == 0 && year <= realYear-10){btnPrev.setEnabled(false);} //Too early
        if (month == 11 && year >= realYear+100){btnNext.setEnabled(false);} //Too late
        lblMonth.setText(months[month]); //Refresh the month label (at the top)
        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 180, 25); //Re-align label with calendar
        cmbYear.setSelectedItem(String.valueOf(year)); //Select the correct year in the combo box
        
        //Clear table
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                mtblCalendar.setValueAt(null, i, j);
            }
        }
        
        //Get first day of month and number of days
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        som = cal.get(GregorianCalendar.DAY_OF_WEEK);
        
        Task task_new = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "toto je super husty popis", "Muziker_Site");
        Task task_new1 = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "toto je super husty popis", "Yanfeng_Invoices");
        ArrayList<Task> array_tasks = new ArrayList<>();
        array_tasks.add(task_new);
        array_tasks.add(task_new1);
        //Draw calendar
        //tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new TextAreaRenderer_2());
        for (int i=1; i<=nod; i++){
            int row = new Integer((i+som-2)/7);
            int column  =  (i+som-2)%7;
            Date date = new GregorianCalendar(year, month, i).getTime();
            mtblCalendar.setValueAt(Integer.toString(i), row, column);
            
            String tasks = "";
            
            for (Task task : array_tasks) {
                if (WithoutTime(task.getDeadline()).equals(date)){
                    tasks = tasks + "\n" + task.getName();
                }
            }
            mtblCalendar.setValueAt(Integer.toString(i)+ "\n" + tasks, row, column);
            //mtblCalendar.setValueAt(Integer.toString(i), row, column);
            //mtblCalendar.setValueAt(i, row, column);
        }
        
        //Apply renderers
        
        //tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new TextAreaRenderer(task));
        tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new TextAreaRenderer_2());
        
        //tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
        //tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer_2());
//        tblCalendar.setDefaultRenderer(String[].class, new MyTableCellEditor());

    }
    
    private static Date WithoutTime(Date date) {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date_without_time = formatter.parse(formatter.format(date));
            return date_without_time;
        } catch (ParseException ex) {
            Logger.getLogger(Standalone_Calendar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

static class TextAreaRenderer_2 extends JScrollPane implements TableCellRenderer {
   JTextArea textarea;
   public TextAreaRenderer_2() {
      textarea = new JTextArea();
      textarea.setLineWrap(true);
      textarea.setWrapStyleWord(true);
      textarea.setFont(new java.awt.Font("Segoe UI Light", 0, 12));
      getViewport().add(textarea);
      //textarea.setText(task.getTopic());
    }
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,int row, int column) {
        ArrayList<String> array_strings = new ArrayList<String>();
        String value_new = (String)value;
        if (value  != null){
            for (String line : value_new.split("\\n")){
                array_strings.add(line);
            }
        }
        
        textarea.setText((String)value);
        
        if (isSelected) {
          setForeground(table.getSelectionForeground());
          setBackground(table.getSelectionBackground());
          textarea.setForeground(table.getSelectionForeground());
          textarea.setBackground(table.getSelectionBackground());
         } else {
          setForeground(table.getForeground());
          setBackground(table.getBackground());
          textarea.setForeground(table.getForeground());
          textarea.setBackground(table.getBackground());
         }

         if (column == 0 || column == 6){ //Week-end
                 textarea.setBackground(new Color(255, 220, 220));
             }
             else{ //Week
                 setBackground(new Color(255, 255, 255));
             }
             if (value != null){
                 if (Integer.parseInt(array_strings.get(0)) == realDay && currentMonth == realMonth && currentYear == realYear){ //Today
                     textarea.setBackground(new Color(220, 220, 255));
                 }
             }
        return this;
   }
}
 
 static class TextAreaRenderer extends JScrollPane implements TableCellRenderer {
   JTextArea textarea;
   Task task;
   public TextAreaRenderer(Task task) {
      this.task = task;
      textarea = new JTextArea();
      textarea.setLineWrap(true);
      textarea.setWrapStyleWord(true);
      getViewport().add(textarea);
      //textarea.setText(task.getTopic());
   }
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,int row, int column) {
       System.out.println(value);
       textarea.setText("");
       if (isSelected) {
         setForeground(table.getSelectionForeground());
         setBackground(table.getSelectionBackground());
         textarea.setForeground(table.getSelectionForeground());
         textarea.setBackground(table.getSelectionBackground());
      } else {
         setForeground(table.getForeground());
         setBackground(table.getBackground());
         textarea.setForeground(table.getForeground());
         textarea.setBackground(table.getBackground());
      }
       //System.out.println(row);
       //System.out.println(column);
       System.out.println("----");
       if (column == 0 || column == 6){ //Week-end
                textarea.setBackground(new Color(255, 220, 220));
            }
            else{ //Week
                setBackground(new Color(255, 255, 255));
            }
            if (value != null){
                if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){ //Today
                    textarea.setBackground(new Color(220, 220, 255));
                }
            }
            /*
            Task task = (Task)value;
        textarea.setFont(new java.awt.Font("Segoe UI Light", 0, 10));
        if (task != null)
          textarea.setText(task.getTopic());
        textarea.setCaretPosition(0);*/
            if (value != null){
                    Integer num_value = (Integer)value;
                    textarea.setText(task.getName());
                    textarea.append("\n" + num_value.toString());
                }
        return this;
   }
}
    
    static class btnPrev_Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (currentMonth == 0){ //Back one year
                currentMonth = 11;
                currentYear -= 1;
            }
            else{ //Back one month
                currentMonth -= 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }
    static class btnNext_Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (currentMonth == 11){ //Foward one year
                currentMonth = 0;
                currentYear += 1;
            }
            else{ //Foward one month
                currentMonth += 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }
    static class cmbYear_Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (cmbYear.getSelectedItem() != null){
                String b = cmbYear.getSelectedItem().toString();
                currentYear = Integer.parseInt(b);
                refreshCalendar(currentMonth, currentYear);
            }
        }
    }
}

