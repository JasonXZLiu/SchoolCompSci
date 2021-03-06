import java.awt.Font;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason_001
 */
public class DisplayEmployeeFrame extends javax.swing.JFrame {
    private static Font headerFont = new Font("Corbel", Font.BOLD, 32);
    private static Font plainFont = new Font("Corbel", Font.PLAIN, 20);
    private String [] header = {"Type", "Empoyee Number", "First Name", "Last Name", "Sex", "Work Location", "Deduction Rate", "Hourly Wage", "Hours/Week", "Weaks/Year", "Yearly Salary", "Net Income", "Gross Income"};
    private DefaultTableModel dtm = new DefaultTableModel(0, 0);
    protected static MyHashTable hT;
    
    /**
     * Creates new form DisplayEmployeeFrame
     */
    
    public DisplayEmployeeFrame(MyHashTable hT) {
        this.hT = hT;
        createModel();      
        initComponents();
        errorLabel.setVisible(false);
    }
    
    public DisplayEmployeeFrame(EmployeeInfo e) {
        initComponents();
        errorLabel.setVisible(false);
    }

    public void createModel() {
        dtm.setColumnIdentifiers(header);
        for(int i = 0; i < hT.getK(); i++) {
            if(hT.buckets[i] != null){
                String[] a; 
                for(int j = 0; j < hT.buckets[i].size(); j++) {
                    a = hT.buckets[i].get(j).toString().split(",");
                    dtm.addRow(a);
                }
            }
        }
    }
    
    private void displayError() {
        errorLabel.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        cancelButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(headerFont);
        jLabel1.setText("display employee");

        scrollPane.setFont(plainFont
        );

        displayTable.setModel(dtm);
        scrollPane.setViewportView(displayTable);

        cancelButton.setBackground(new java.awt.Color(231, 76, 60));
        cancelButton.setFont(plainFont
        );
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("cancel");
        cancelButton.setBorder(null);
        cancelButton.setContentAreaFilled(false);
        cancelButton.setOpaque(true);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(36, 113, 163));
        editButton.setFont(plainFont
        );
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("edit");
        editButton.setBorder(null);
        editButton.setContentAreaFilled(false);
        editButton.setMaximumSize(new java.awt.Dimension(31, 15));
        editButton.setMinimumSize(new java.awt.Dimension(31, 15));
        editButton.setOpaque(true);
        editButton.setPreferredSize(new java.awt.Dimension(31, 15));

        errorLabel.setFont(plainFont
        );
        errorLabel.setText("please select an employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorLabel)
                    .addComponent(jLabel1))
                .addContainerGap(810, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    public int checkForSelected() {
        int blah = displayTable.getSelectedRow();
        if(blah == -1) {
            displayError();
            return -1;
        }
        return Integer.valueOf((String) displayTable.getModel().getValueAt(blah, 1)); 
    }
    
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
            java.util.logging.Logger.getLogger(DisplayEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayEmployeeFrame(hT);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTable displayTable;
    protected javax.swing.JButton editButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
