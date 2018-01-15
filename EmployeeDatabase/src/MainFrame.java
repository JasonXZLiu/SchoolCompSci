import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.TitledBorder;

/** DISCLAIMER:
 *  to optimize the storage capacity of this program with the design, 
 *  some frames are utilized for different functions. 
 *  ex. AddEmployeeFrame is used to: add, edit, and display an employee 
 *      functionality determined by passing in a boolean/integer value 
 *      representing a certain function 
 */

public class MainFrame extends javax.swing.JFrame{
    // attributes of MainFrame
    // global variables for used frames
    private AddEmployeeFrame addEmployeeFrame; 
    private SearchEmployeeFrame searchEmployeeFrame; 
    private DisplayEmployeeFrame displayEmployeeFrame; 
    
    // K buckets for the hashtable -> originally hardcoded but can be editted
    protected static int K;
    // hashtable to store information (given K buckets in the beginning)
    protected static MyHashTable hashTable;
    // instantiated new font style
    private static Font headerFont = new Font("Corbel", Font.BOLD, 32);
    private static Font plainFont = new Font("Corbel", Font.PLAIN, 20);
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        // K (number of buckets) can be changed in program -> will add on settings feature to MainFrame later
        K = 5;
        // instantiate hashTable with the K set buckets
        hashTable = new MyHashTable(K);
        // try, catch statement to catch errors thrown when importing data
        try {                
            hashTable.importData();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        // initializes JFrame's components
        initComponents();
        // displays total number of employees in the database initially
        statusLabel.setText("You have " + hashTable.getSize() + " employees in the database.");
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
        titleLabel = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(headerFont);
        titleLabel.setText("employee database");

        removeButton.setBackground(new java.awt.Color(86, 101, 115));
        removeButton.setFont(plainFont);
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("remove");
        removeButton.setToolTipText("");
        removeButton.setBorder(null);
        removeButton.setBorderPainted(false);
        removeButton.setContentAreaFilled(false);
        removeButton.setOpaque(true);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        statusLabel.setFont(plainFont);
        statusLabel.setText("jLabel2");
        statusLabel.setMaximumSize(new java.awt.Dimension(20, 20));
        statusLabel.setMinimumSize(new java.awt.Dimension(20, 20));
        statusLabel.setPreferredSize(new java.awt.Dimension(20, 30));

        searchButton.setBackground(new java.awt.Color(86, 101, 115));
        searchButton.setFont(plainFont);
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("search");
        searchButton.setToolTipText("");
        searchButton.setBorder(null);
        searchButton.setContentAreaFilled(false);
        searchButton.setOpaque(true);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        displayButton.setBackground(new java.awt.Color(86, 101, 115));
        displayButton.setFont(plainFont);
        displayButton.setForeground(new java.awt.Color(255, 255, 255));
        displayButton.setText("display all");
        displayButton.setToolTipText("");
        displayButton.setBorder(null);
        displayButton.setContentAreaFilled(false);
        displayButton.setOpaque(true);
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(86, 101, 115));
        addButton.setFont(plainFont);
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("add");
        addButton.setToolTipText("");
        addButton.setBorder(null);
        addButton.setBorderPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.setOpaque(true);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(424, 424, 424)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // method invoked when removeButton is clicked
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // instantiates the SearchEmployeeFrame (utilized here to determine which employee to remove)
        // must find if employee is in database before removing
        searchEmployeeFrame = new SearchEmployeeFrame();
        // SearchEmployeeFrame used for searching + removing employees 
        // (change label to show user that this is the correct remove employee frame)
        searchEmployeeFrame.searchFrameLabel.setText("remove employee");
        searchEmployeeFrame.setVisible(true);
        // ActionListener invoked when submit button (from searchEmployeeFrame is clicked)
        searchEmployeeFrame.submitButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
               // sets initial values for searchEmployeeFrame (default to show user example inputs)
               searchEmployeeFrame.setValues();
               // check if there are errors <- error thrown if:
               // emp number is inputted OR employee number exists or not 
               if(searchEmployeeFrame.empNumber == -1 || hashTable.removeEmployee(searchEmployeeFrame.empNumber) == null) {
                   searchEmployeeFrame.displayError();
               } else {
                   // updates statusLabel (# of employees in database)
                   updateText();
                   // disposes of the frame
                   searchEmployeeFrame.dispose();
               }
            }
        });
    }//GEN-LAST:event_removeButtonActionPerformed

    // similar to removeButtonActionPerformed method except displays the searched employee
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchEmployeeFrame = new SearchEmployeeFrame();
        searchEmployeeFrame.searchFrameLabel.setText("search employee");
        searchEmployeeFrame.setVisible(true);
        searchEmployeeFrame.submitButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                searchEmployeeFrame.setValues();
                if(searchEmployeeFrame.empNumber == -1 || hashTable.searchByEmployeeNumber(searchEmployeeFrame.empNumber) == null) {
                   searchEmployeeFrame.displayError();
               } else {
                   EmployeeInfo employee = hashTable.searchByEmployeeNumber(searchEmployeeFrame.empNumber);
                   displaySearchedEmployee(employee);
                   searchEmployeeFrame.dispose();
               }
            }
        });
    }//GEN-LAST:event_searchButtonActionPerformed
    
    // displays the employee that was searched for
    private void displaySearchedEmployee(EmployeeInfo e) {
        addEmployeeFrame = new AddEmployeeFrame(0, e);
        addEmployeeFrame.setVisible(true);
    }
    
    // method invoked when displayButton is clicked 
    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        displayEmployeeFrame = new DisplayEmployeeFrame(hashTable);
        displayEmployeeFrame.setVisible(true);
        displayEmployeeFrame.editButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                int check = displayEmployeeFrame.checkForSelected();
                if(check != -1) {
                    editEmployee(check);
                    displayEmployeeFrame.dispose();
                }
            }
        });
    }//GEN-LAST:event_displayButtonActionPerformed

    // method invoked when addButton is clicked 
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // passed in parameter (1) represents the adding employee functionality
        addEmployeeFrame = new AddEmployeeFrame(1, null);
        addEmployeeFrame.setVisible(true);
        addEmployeeFrame.submitButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                addEmployeeFrame.setValues();
                // if no errors, add employee to database
                if(!addEmployeeFrame.checkError() && hashTable.search(addEmployeeFrame.empNumber) == -1) {
                    addToDatabase();
                    updateText();
                    addEmployeeFrame.dispose();
                } else {
                    addEmployeeFrame.error[1] = hashTable.search(addEmployeeFrame.empNumber);
                }
            }
        });
    }//GEN-LAST:event_addButtonActionPerformed

    // updates the statusLabel (displays correct number of employees after a ceratin action)
    private void updateText() {
        statusLabel.setText("You have " + hashTable.getSize() + " employees in the database.");
    }
    
    // adds new EmployeeInfo to hashTable
    private void addToDatabase() {
        // check if employee is part time or full time
        // (type is a boolean value. if true, employee is part time. else, full time)
        if(addEmployeeFrame.type) {
            PartTimeEmployee employee = addEmployeeFrame.createPartTimeEmployee();
            hashTable.addEmployee(employee);
        } else {
            FullTimeEmployee employee = addEmployeeFrame.createFullTimeEmployee();
            hashTable.addEmployee(employee);
        }
    }

    // removes employee from database with employee number empNum
     private void removeEmployee(int empNum) {
        hashTable.removeEmployee(empNum);
    }
    
    // edits employee by instantiating an AddEmployeeFrame (with edit functionality)
    public void editEmployee(int i) {
        EmployeeInfo e = hashTable.searchByEmployeeNumber(i);
        addEmployeeFrame = new AddEmployeeFrame(2, e);
        addEmployeeFrame.setVisible(true);
        addEmployeeFrame.submitButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                addEmployeeFrame.setValues();
                if(!addEmployeeFrame.checkError()) {
                    removeEmployee(addEmployeeFrame.empNumber);
                    addToDatabase();
                    updateText();
                    addEmployeeFrame.dispose();
                } else {
                    addEmployeeFrame.error[1] = hashTable.search(addEmployeeFrame.empNumber);
                }
            }
        });
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
        
        // try catch statement used to catch potential exceptions thrown when adding a default layout 
        // Nimbus is one of NetBeans default layout
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
                // instantiate MainFrame
                final MainFrame mainFrame = new MainFrame();
                // displays mainFrame
                mainFrame.setVisible(true);
                // stops frame from closing before data is exported into csv file
                mainFrame.setDefaultCloseOperation(MainFrame.DO_NOTHING_ON_CLOSE);
                // method invoked when mainFrame is attempted to be closed
                mainFrame.addWindowListener( new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent we) {
                        // if exporting data works (returns true), can dispose of mainFrame
                        if(hashTable.exportData()) mainFrame.dispose();
                    }
                } );
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton displayButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
