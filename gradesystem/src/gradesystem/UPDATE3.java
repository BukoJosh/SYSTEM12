/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gradesystem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author USER
 */
public class UPDATE3 extends javax.swing.JFrame {

     public UPDATE3() {
      initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Dispose the UPDATE frame without exiting HOME1
                dispose();
            }
        });
    
    }
   
     
    
    private double calculateFinalGrade(double calculus, double physics, double chemistry, double fundamental, double database, double pe, double nstp) {
    // Example: Simple average calculation for the final grade
    return (calculus + physics + chemistry + fundamental + database + pe + nstp) / 7;
}
    
    static void updateField(int column, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 public UPDATE3(String Name, String course, String CALCULUS, String PHYSICS, String CHEMISTRY, String FUNDAMENTAL, String DATABASE, String PE, String NSTP) {
        initComponents();
        
        
        name.setText(Name);
        courseandyear.setText(course);
        cal.setText(CALCULUS);
        ph.setText(PHYSICS);
        chem.setText(CHEMISTRY);
        fund.setText(FUNDAMENTAL);
        data.setText(DATABASE);
        p.setText(PE);
        ntp.setText(NSTP);
        setLocationRelativeTo(null);
    
    
    int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int frameWidth = this.getWidth();
    int x = (screenWidth - frameWidth) / 20 + 300; 
    int y = 5; 
    this.setBounds(x, y, frameWidth, this.getHeight());
    }
    /**
     * Creates new form UPDATE
     */
   

    String url = "jdbc:mysql://localhost:3306/gradesystem"; // Update with your DB name
    String username = "root"; // Replace with your database username
    String password = ""; // Replace with your database password

    // Button click event for the UPDATE button
    

    
   public void populateFields(String name, String calculus, String physics, String chemistry,
                           String fundamental, String database, String pe, String nstp) {
    
    cal.setText(calculus);
    ph.setText(physics);
    chem.setText(chemistry);
    fund.setText(fundamental);
    data.setText(database);
    p.setText(pe);
    ntp.setText(nstp);
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
        jLabel3 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        chem = new javax.swing.JTextField();
        ntp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ph = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fund = new javax.swing.JTextField();
        UPDATE = new javax.swing.JToggleButton();
        CLEAR = new javax.swing.JToggleButton();
        name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        courseandyear = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("INSERT GRADE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 10, 240, 35);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("x");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(590, 0, 10, 25);

        jToggleButton5.setBackground(new java.awt.Color(204, 0, 0));
        jToggleButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton5);
        jToggleButton5.setBounds(580, 0, 30, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NSTP:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 180, 50, 17);

        chem.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        chem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemActionPerformed(evt);
            }
        });
        jPanel1.add(chem);
        chem.setBounds(500, 100, 71, 22);

        ntp.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ntp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntpActionPerformed(evt);
            }
        });
        jPanel1.add(ntp);
        ntp.setBounds(140, 180, 71, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("FUNDAMENTAL:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 120, 20);

        p.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        jPanel1.add(p);
        p.setBounds(500, 140, 71, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("DATABASE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 140, 100, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("CALCULUS:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 100, 90, 17);

        cal.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calMouseClicked(evt);
            }
        });
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });
        jPanel1.add(cal);
        cal.setBounds(140, 100, 71, 22);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("PHYSICS:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 100, 70, 17);

        ph.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phActionPerformed(evt);
            }
        });
        jPanel1.add(ph);
        ph.setBounds(310, 100, 71, 22);

        data.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        jPanel1.add(data);
        data.setBounds(310, 140, 71, 22);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("CHEMISTRY:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(400, 100, 100, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("PE:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(460, 140, 40, 17);

        fund.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        fund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundActionPerformed(evt);
            }
        });
        jPanel1.add(fund);
        fund.setBounds(140, 140, 71, 22);

        UPDATE.setBackground(new java.awt.Color(0, 102, 255));
        UPDATE.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE);
        UPDATE.setBounds(130, 220, 100, 28);

        CLEAR.setBackground(new java.awt.Color(255, 0, 0));
        CLEAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        jPanel1.add(CLEAR);
        CLEAR.setBounds(350, 220, 84, 30);

        name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(130, 60, 187, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("NAME:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 60, 45, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("COURSE & YEAR:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(340, 60, 119, 17);

        courseandyear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        courseandyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseandyearActionPerformed(evt);
            }
        });
        jPanel1.add(courseandyear);
        courseandyear.setBounds(460, 60, 130, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        cal.setText("");
        ph.setText("");
        chem.setText("");
        fund.setText("");
        data.setText("");
        p.setText("");
        ntp.setText("");
    }//GEN-LAST:event_CLEARActionPerformed
    
    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
     
    }//GEN-LAST:event_calActionPerformed
    
    private void phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phActionPerformed

    private void chemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chemActionPerformed

    private void fundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fundActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pActionPerformed

    private void ntpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ntpActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        String studentName = name.getText();
    String courseYear = courseandyear.getText();
    String calculus = cal.getText();
    String physics = ph.getText();
    String chemistry = chem.getText();
    String fundamental = fund.getText();
    String database = data.getText();
    String peGrade = p.getText();
    String nstpGrade = ntp.getText();

    // Validation for numeric fields
    StringBuilder errorMessage = new StringBuilder("Please fix the following fields:\n");
    if (!calculus.isEmpty() && !calculus.matches("\\d+(\\.\\d+)?")) {
        errorMessage.append("- CALCULUS must contain only numeric characters\n");
    }
    if (!physics.isEmpty() && !physics.matches("\\d+(\\.\\d+)?")) {
        errorMessage.append("- PHYSICS must contain only numeric characters\n");
    }
    if (!chemistry.isEmpty() && !chemistry.matches("\\d+(\\.\\d+)?")) {
        errorMessage.append("- CHEMISTRY must contain only numeric characters\n");
    }
    if (!fundamental.isEmpty() && !fundamental.matches("\\d+(\\.\\d+)?")) {
        errorMessage.append("- FUNDAMENTAL must contain only numeric characters\n");
    }
    if (!database.isEmpty() && !database.matches("\\d+(\\.\\d+)?")) {
        errorMessage.append("- DATABASE must contain only numeric characters\n");
    }
    if (!peGrade.isEmpty() && !peGrade.matches("\\d+(\\.\\d+)?")) {
        errorMessage.append("- PE must contain only numeric characters\n");
    }
    if (!nstpGrade.isEmpty() && !nstpGrade.matches("\\d+(\\.\\d+)?")) {
        errorMessage.append("- NSTP must contain only numeric characters\n");
    }

    if (errorMessage.length() > "Please fix the following fields:\n".length()) {
        JOptionPane.showMessageDialog(rootPane, errorMessage.toString(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Define the update query to include FinalGrade
    String updateQuery = "UPDATE finalsgrades SET Calculus = ?, Physics = ?, Chemistry = ?, " +
                         "Fundamental = ?, `Database` = ?, PE = ?, NSTP = ?, FinalGrade = ? " +
                         "WHERE LOWER(Name) = LOWER(?) AND LOWER(CourseYear) = LOWER(?)";

    try (PreparedStatement preparedStatement = Gradesystem.mycon().prepareStatement(updateQuery)) {
        // Set the values for the prepared statement
        preparedStatement.setObject(1, calculus.isEmpty() ? null : Double.parseDouble(calculus));
        preparedStatement.setObject(2, physics.isEmpty() ? null : Double.parseDouble(physics));
        preparedStatement.setObject(3, chemistry.isEmpty() ? null : Double.parseDouble(chemistry));
        preparedStatement.setObject(4, fundamental.isEmpty() ? null : Double.parseDouble(fundamental));
        preparedStatement.setObject(5, database.isEmpty() ? null : Double.parseDouble(database));
        preparedStatement.setObject(6, peGrade.isEmpty() ? null : Double.parseDouble(peGrade));
        preparedStatement.setObject(7, nstpGrade.isEmpty() ? null : Double.parseDouble(nstpGrade));

        // Calculate the final grade only if all numeric fields are not empty
        double finalGrade = 0;
        if (!calculus.isEmpty() && !physics.isEmpty() && !chemistry.isEmpty() && 
            !fundamental.isEmpty() && !database.isEmpty() && !peGrade.isEmpty() && !nstpGrade.isEmpty()) {
            finalGrade = calculateFinalGrade(
                Double.parseDouble(calculus), 
                Double.parseDouble(physics), 
                Double.parseDouble(chemistry), 
                Double.parseDouble(fundamental), 
                Double.parseDouble(database), 
                Double.parseDouble(peGrade), 
                Double.parseDouble(nstpGrade));
        }
        preparedStatement.setObject(8, finalGrade == 0 ? null : finalGrade);

        preparedStatement.setString(9, studentName);
        preparedStatement.setString(10, courseYear);

        // Execute the update
        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(rootPane, "Record updated successfully!");
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "No record found to update.", "Update Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(rootPane, "Database error occurred while updating the record.\n" +
                "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();  // Print the error for debugging
    }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void courseandyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseandyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseandyearActionPerformed

    private void calMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calMouseClicked
    
    }//GEN-LAST:event_calMouseClicked

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
            java.util.logging.Logger.getLogger(UPDATE3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UPDATE3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UPDATE3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UPDATE3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UPDATE3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CLEAR;
    private javax.swing.JToggleButton UPDATE;
    private javax.swing.JTextField cal;
    private javax.swing.JTextField chem;
    private javax.swing.JTextField courseandyear;
    private javax.swing.JTextField data;
    private javax.swing.JTextField fund;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTextField name;
    private javax.swing.JTextField ntp;
    private javax.swing.JTextField p;
    private javax.swing.JTextField ph;
    // End of variables declaration//GEN-END:variables
}
