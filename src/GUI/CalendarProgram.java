package GUI;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.util.*;
import sk.stu.fiit.Tasks.Task;

public class CalendarProgram{
    static JLabel lblMonth, lblYear;
    static JButton btnPrev, btnNext;
    static JTable tblCalendar;
    static JComboBox cmbYear;
    static Container pane;
    static DefaultTableModel mtblCalendar; //Table model
    static JScrollPane stblCalendar; //The scrollpane
    static int realYear, realMonth, realDay, currentYear, currentMonth;
    
    public static void create (JPanel pnlCalendar, Container pane){
        //Look and feel
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}
        catch (UnsupportedLookAndFeelException e) {}
        
        //Prepare frame
        /*
        frmMain = new JFrame ("Gestionnaire de clients"); //Create frame
        frmMain.setSize(330, 375); //Set size to 400x400 pixels
        pane = frmMain.getContentPane(); //Get content pane
        pane.setLayout(null); //Apply null layout
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close when X is clicked
        */
        //Create controls
        lblMonth = new JLabel ("January");
        lblYear = new JLabel ("Change year:");
        cmbYear = new JComboBox();
        btnPrev = new JButton ("&lt;&lt;");
        btnNext = new JButton ("&gt;&gt;");
        mtblCalendar = new DefaultTableModel(){public boolean isCellEditable(int rowIndex, int mColIndex){return false;}};
        tblCalendar = new JTable(mtblCalendar);
        stblCalendar = new JScrollPane(tblCalendar);
        //pnlCalendar = new JPanel(null);
        
        //Set border
        pnlCalendar.setBorder(BorderFactory.createTitledBorder("Calendar"));
        
        //Register action listeners
        btnPrev.addActionListener(new btnPrev_Action());
        btnNext.addActionListener(new btnNext_Action());
        cmbYear.addActionListener(new cmbYear_Action());
        //mtblCalendar.addActionListener(new cmbYear_Action());
        
        //Add controls to pane
        //pane.add(pnlCalendar);
        pnlCalendar.add(lblMonth);
        pnlCalendar.add(lblYear);
        pnlCalendar.add(cmbYear);
        pnlCalendar.add(btnPrev);
        pnlCalendar.add(btnNext);
        pnlCalendar.add(stblCalendar);
        
        //Set bounds
        //pnlCalendar.setBounds(0, 0, 380, 335);//320
        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 100, 25);
        lblYear.setBounds(pnlCalendar.getWidth() - 200, 25, 80, 20);
        cmbYear.setBounds(pnlCalendar.getWidth() - 100, 25, 80, 20);
        btnPrev.setBounds(10, 25, 50, 25);
        btnNext.setBounds(260, 25, 50, 25);
        stblCalendar.setBounds(10, 50, pnlCalendar.getWidth() - 30, pnlCalendar.getHeight()-60);//300
        
        //Make frame visible
        /*
        frmMain.setResizable(true);
        frmMain.setVisible(true);
        */
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
        
        Task task = new Task(new Date(), new Date(), LocalTime.now(), LocalTime.now(), "toto je super husty popis", "Muziker_Site");
        //Draw calendar
        for (int i=1; i<=nod; i++){
            int row = new Integer((i+som-2)/7);
            int column  =  (i+som-2)%7;
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            mtblCalendar.setValueAt(i, row, column);
            //mtblCalendar.setValueAt(i, row, column);
        }
        
        //Apply renderers
        tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new TextAreaRenderer(task));
        //tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
        //tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer_2());
//        tblCalendar.setDefaultRenderer(String[].class, new MyTableCellEditor());
    }
/*
    static class tblCalendarRenderer extends DefaultTableCellRenderer{
        public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            if (column == 0 || column == 6){ //Week-end
                tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer_2());
                setBackground(new Color(255, 220, 220));
                setText("");
            }
            else{ //Week
                setBackground(new Color(255, 255, 255));
            }
            if (value != null){
                if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){ //Today
                    setBackground(new Color(220, 220, 255));
                }
            }
            setBorder(null);
            setForeground(Color.black);
            return this;
        }
    }
    
    static class tblCalendarRenderer_2 extends DefaultTableCellRenderer{
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel();
        TextArea textArea = new TextArea();
        public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){
            //super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            jLabel.setBackground(Color.BLUE);
            jPanel.add(jLabel);
            jPanel.add(textArea);
            jPanel.setBackground(Color.red);
            //textArea.setText((String)value);
            setBorder(null);
            setForeground(Color.black);
            //return this;
            return (Component) jPanel;
        }
    }

 public static class MyTableCellEditor extends AbstractCellEditor implements TableCellEditor {

  JComponent component = new JTextField();

  public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected,
      int rowIndex, int vColIndex) {

    ((JTextField) component).setText((String) value);

    return component;
  }

  public Object getCellEditorValue() {
    return ((JTextField) component).getText();
  }
}*/
 
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
