<<<<<<< HEAD
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
=======
>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 529483
 */

<<<<<<< HEAD
public class MainFrame extends javax.swing.JFrame{
    private AddEmployeeFrame addEmployeeFrame; 
    protected MyHashTable hashTable = new MyHashTable(5);
=======
public class MainFrame extends javax.swing.JFrame {
>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
<<<<<<< HEAD
        statusLabel.setText("You have " + hashTable.getSize() + " employees in the database.");
=======
>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06
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
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
<<<<<<< HEAD
        statusLabel = new javax.swing.JLabel();
=======
>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Employee Database");

        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("remove");
        removeButton.setToolTipText("");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        statusLabel.setText("jLabel2");

=======
>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
<<<<<<< HEAD
                    .addComponent(removeButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(83, 83, 83)
                        .addComponent(statusLabel)))
                .addContainerGap(253, Short.MAX_VALUE))
=======
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)))
                .addContainerGap(264, Short.MAX_VALUE))
>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
<<<<<<< HEAD
                    .addComponent(statusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeButton)
                .addContainerGap(56, Short.MAX_VALUE))
=======
                    .addComponent(removeButton))
                .addContainerGap(234, Short.MAX_VALUE))
>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06
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

<<<<<<< HEAD
=======
    
    
>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        addEmployeeFrame = new AddEmployeeFrame();
        addEmployeeFrame.setVisible(true);
        addEmployeeFrame.submitButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                addToDatabase();
                updateText();
                addEmployeeFrame.dispose();
            }
        });
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateText() {
        statusLabel.setText("You have " + hashTable.getSize() + " employees in the database.");
    }
    
    private void addToDatabase() {
        if(addEmployeeFrame.type) {
            PartTimeEmployee employee = addEmployeeFrame.createPartTimeEmployee();
            hashTable.addEmployee(employee);
        } else {
            FullTimeEmployee employee = addEmployeeFrame.createFullTimeEmployee();
            hashTable.addEmployee(employee);
        }
    }
    
=======
        ChooseEmployeeType chooseEmployeeType = new ChooseEmployeeType();
        chooseEmployeeType.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton removeButton;
<<<<<<< HEAD
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables

=======
    // End of variables declaration//GEN-END:variables
>>>>>>> d88fd25cad76a47e174b300df5ce829395b69f06
}
