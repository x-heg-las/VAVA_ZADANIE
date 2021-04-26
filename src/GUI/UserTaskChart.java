/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import sk.stu.fiit.Loader;
import sk.stu.fiit.Priorities;
import sk.stu.fiit.Project;
import sk.stu.fiit.TaskState;
import sk.stu.fiit.Tasks.Task;
import sk.stu.fiit.User;

/**
 *
 * @author patoh
 */
public class UserTaskChart extends javax.swing.JPanel {

    /**
     * Creates new form UserTaskChart
     */
    
    private static UserTaskChart instance = null;
    
    public UserTaskChart(User user) {
        initComponents();
        createChart(user);
        instance = this;
    }
    
    public static UserTaskChart getCurrentInstance(){
        return instance;
    }
    
    public void updateChartInstance(User user){
        createChart(user);
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

        chartPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your ToDos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(chartPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartPanel;
    // End of variables declaration//GEN-END:variables


private void createChart(User user){

    JFreeChart chart = ChartFactory.createPieChart(
            "User's progress",
            createDataset(user),
            true,
            true,
            true
    );
    
    chartPanel.setLayout(new java.awt.BorderLayout());
    chartPanel.add(new ChartPanel(chart),BorderLayout.CENTER);;
    chartPanel.validate();
  }
    
    
  private static PieDataset createDataset(User user){
      
      DefaultPieDataset dataset = new DefaultPieDataset();
      if(user != null && user.getUserTasks()!=null){
       
 
        HashMap<TaskState, Integer> taskPriorities = new HashMap<>();

        user.getUserTasks().forEach(task -> {
           
            if(!taskPriorities.containsKey(task.getTaskState()))
                taskPriorities.put(task.getTaskState(), 1);
            else
                taskPriorities.put(task.getTaskState(),(int) (( taskPriorities.get(task.getTaskState())) +1) );
          });

        taskPriorities.entrySet().forEach(entry -> {
            if(entry != null && entry.getKey()!= null && entry.getValue() != null)
                dataset.setValue(entry.getKey(), entry.getValue());
          }); 
     }
      return dataset;
  }
  
  
}

