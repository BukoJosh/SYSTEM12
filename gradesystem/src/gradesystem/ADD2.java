/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gradesystem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/**
 *
 * @author USER
 */
public class ADD2 extends javax.swing.JFrame {

    /**
     * Creates new form ADD
     */
     public ADD2() {
         setUndecorated(true);
        initComponents();
        loadComboBoxOptions();
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int frameWidth = this.getWidth();
        int x = (screenWidth - frameWidth) / 20 + 350;
        int y = 5;
        this.setBounds(x, y, frameWidth, this.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ADD = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        CLEAR = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        year = new javax.swing.JLabel();
        ADD1 = new javax.swing.JToggleButton();
        courseandyear = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Year = new javax.swing.JComboBox<>();

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("CHEMESTRY:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(180, 90, 187, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NAME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 90, 45, 17);

        ADD.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD);
        ADD.setBounds(20, 210, 80, 28);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ADD STUDENT TO THE LIST");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 30, 400, 35);

        CLEAR.setBackground(new java.awt.Color(204, 204, 204));
        CLEAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        jPanel1.add(CLEAR);
        CLEAR.setBounds(390, 210, 84, 28);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("x");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 0, 10, 25);

        jToggleButton5.setBackground(new java.awt.Color(204, 0, 0));
        jToggleButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton5);
        jToggleButton5.setBounds(470, 0, 30, 30);

        year.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        year.setText("      YEAR:");
        jPanel1.add(year);
        year.setBounds(100, 170, 70, 17);

        ADD1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ADD1.setText("ADD COURSE");
        ADD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD1ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD1);
        ADD1.setBounds(180, 210, 150, 28);

        courseandyear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseandyearMouseClicked(evt);
            }
        });
        courseandyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseandyearActionPerformed(evt);
            }
        });
        jPanel1.add(courseandyear);
        courseandyear.setBounds(180, 130, 190, 22);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("COURSE :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 130, 70, 17);

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });
        jPanel1.add(Year);
        Year.setBounds(180, 170, 190, 22);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
    String names = name.getText().trim(); // Student name
    String course = courseandyear.getSelectedItem().toString().trim(); // Course from JComboBox
    String year = Year.getSelectedItem().toString().trim(); // Year from JComboBox

    // Combine course and year
    String courseYear = course + " " + year;

    StringBuilder errorMessage = new StringBuilder("Please fill in the:\n");

    if (names.isEmpty()) {
        errorMessage.append("- Name\n");
    }
    if (course.isEmpty() || year.isEmpty()) {
        errorMessage.append("- Course and Year\n");
    }

    if (names.isEmpty() || courseYear.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, errorMessage.toString());
        return;
    }

    try (Statement checkStatement = Gradesystem.mycon().createStatement();
         Statement insertStatement = Gradesystem.mycon().createStatement()) {
        
        String checkQuery = "SELECT * FROM midtermgrades WHERE NAME = ? AND CourseYear = ?";
        try (PreparedStatement preparedStatement = Gradesystem.mycon().prepareStatement(checkQuery)) {
            preparedStatement.setString(1, names);
            preparedStatement.setString(2, courseYear);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(rootPane, "The student already exists in the database.");
            } else {
                String insertQuery = "INSERT INTO midtermgrades (Name, CourseYear) VALUES (?, ?)";
                try (PreparedStatement insertPreparedStatement = Gradesystem.mycon().prepareStatement(insertQuery)) {
                    insertPreparedStatement.setString(1, names);
                    insertPreparedStatement.setString(2, courseYear);
                    insertPreparedStatement.executeUpdate();
                }

                int choice = JOptionPane.showConfirmDialog(rootPane, 
                        "A new student has been successfully added. Do you want to add another student?", 
                        "Success", JOptionPane.YES_NO_OPTION);
                
                if (choice == JOptionPane.YES_OPTION) {
                    name.setText("");  // Clear name field
                    courseandyear.setSelectedIndex(-1);  // Clear the JComboBox selection
                    Year.setSelectedIndex(-1);  // Clear the Year JComboBox selection
                } else {
                    setVisible(false);  // Close the ADD JFrame
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(rootPane, "An error occurred while adding the student. " + e.getMessage());
    }
    }//GEN-LAST:event_ADDActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        name.setText("");
        courseandyear.setSelectedIndex(-1);
        Year.setSelectedIndex(-1);
    }//GEN-LAST:event_CLEARActionPerformed

    private void ADD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD1ActionPerformed
    String newOption = JOptionPane.showInputDialog("Enter new course and year:");

    if (newOption != null && !newOption.trim().isEmpty()) { // Ensure it's not null or empty
        // Add the new option to the combo box
        courseandyear.addItem(newOption);
        courseandyear.setSelectedItem(newOption); // Optionally set it as the selected item

        // Save the new option to a file
        try (FileWriter writer = new FileWriter("comboBoxOptions.txt", true)) {
            writer.write(newOption + System.lineSeparator());
            JOptionPane.showMessageDialog(this, "New course and year added and saved: " + newOption);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving option: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Invalid input. No option added.");
    }
    }//GEN-LAST:event_ADD1ActionPerformed
    private void loadComboBoxOptions() {
    try (BufferedReader reader = new BufferedReader(new FileReader("comboBoxOptions.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            courseandyear.addItem(line.trim());
        }
    } catch (IOException e) {
        System.out.println("Error loading combo box options: " + e.getMessage());
    }
}
    private void courseandyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseandyearActionPerformed
   
    }//GEN-LAST:event_courseandyearActionPerformed

    private void courseandyearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseandyearMouseClicked
      
    }//GEN-LAST:event_courseandyearMouseClicked

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearActionPerformed

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
            java.util.logging.Logger.getLogger(ADD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ADD;
    private javax.swing.JToggleButton ADD1;
    private javax.swing.JToggleButton CLEAR;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JComboBox<String> courseandyear;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTextField name;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
