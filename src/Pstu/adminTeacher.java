/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pstu;

import Pstu.Conponent.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class adminTeacher extends javax.swing.JFrame {

    /**
     * Creates new form adminTeacher
     */
    public adminTeacher() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminTeacherPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        topleftborder = new javax.swing.JLabel();
        bottomrightborder = new javax.swing.JLabel();
        imageside = new javax.swing.JLabel();
        addNewStudent2 = new javax.swing.JButton();
        serchIdField = new javax.swing.JTextField();
        addNewStudent1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(634, 80));
        setUndecorated(true);

        adminTeacherPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adminTeacherPanelComponentShown(evt);
            }
        });
        adminTeacherPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/Faculty/cse.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminTeacherPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 160, 130));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secect Dept", "CCE", "CIT", "Math", "Physics", "English", "EEE" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 160, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/Faculty/Ag.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminTeacherPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 160, 130));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secect Dept", "CCE", "CIT", "Math", "Physics", "English", "EEE" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 160, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/Faculty/fish.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminTeacherPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 160, 130));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secect Dept", "CCE", "CIT", "Math", "Physics", "English", "EEE" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 160, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/Faculty/nfs.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminTeacherPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 160, 130));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secect Dept", "CCE", "CIT", "Math", "Physics", "English", "EEE" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 160, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/Faculty/bba.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminTeacherPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 160, 130));

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secect Dept", "CCE", "CIT", "Math", "Physics", "English", "EEE" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/Faculty/land.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminTeacherPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 160, 130));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secect Dept", "CCE", "CIT", "Math", "Physics", "English", "EEE" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 160, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/Faculty/disster.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminTeacherPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 160, 130));

        jComboBox8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secect Dept", "CCE", "CIT", "Math", "Physics", "English", "EEE" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 160, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/Faculty/dvm.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminTeacherPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 160, 130));

        jComboBox9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secect Dept", "CCE", "CIT", "Math", "Physics", "English", "EEE" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 160, 40));

        topleftborder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/bordertop left.png"))); // NOI18N
        adminTeacherPanel.add(topleftborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 330, 380));

        bottomrightborder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/border right bottom - Copy - Copy.png"))); // NOI18N
        adminTeacherPanel.add(bottomrightborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 330, 380));

        imageside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/admiTeacher.png"))); // NOI18N
        adminTeacherPanel.add(imageside, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 350, 250));

        addNewStudent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        addNewStudent2.setText(" Add Teacher");
        addNewStudent2.setActionCommand("Add Student");
        addNewStudent2.setBorder(null);
        addNewStudent2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudent2ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(addNewStudent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 40));

        serchIdField.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        serchIdField.setText("   Search with teacher id");
        serchIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                serchIdFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                serchIdFieldFocusLost(evt);
            }
        });
        serchIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchIdFieldActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(serchIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 270, 50));

        addNewStudent1.setBackground(new java.awt.Color(245, 178, 237));
        addNewStudent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        addNewStudent1.setText("View");
        addNewStudent1.setActionCommand("Add Student");
        addNewStudent1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudent1ActionPerformed(evt);
            }
        });
        adminTeacherPanel.add(addNewStudent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 120, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/1115855.png"))); // NOI18N
        background.setToolTipText("");
        background.setOpaque(true);
        adminTeacherPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 855));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminTeacherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminTeacherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudent2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewStudent2ActionPerformed

    private void serchIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serchIdFieldActionPerformed

    private void addNewStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudent1ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
//        DefaultTableModel table = (DefaultTableModel)studentTable.getModel();
//        int id = studentTable.getSelectedRow();
//        String session = table.getValueAt(id,0).toString();
//        String fac = table.getValueAt(id,1).toString();
//        new AllStudent(session,fac).setVisible(true);
    }//GEN-LAST:event_addNewStudent1ActionPerformed

    private void adminTeacherPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adminTeacherPanelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_adminTeacherPanelComponentShown

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void serchIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serchIdFieldFocusGained
        // TODO add your handling code here:
        serchIdField.setText("");
    }//GEN-LAST:event_serchIdFieldFocusGained

    private void serchIdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serchIdFieldFocusLost
        // TODO add your handling code here:
        
        serchIdField.setText("   Search with teacher id");
    }//GEN-LAST:event_serchIdFieldFocusLost

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
            java.util.logging.Logger.getLogger(adminTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewStudent1;
    private javax.swing.JButton addNewStudent2;
    private javax.swing.JPanel adminTeacherPanel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bottomrightborder;
    private javax.swing.JLabel imageside;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField serchIdField;
    private javax.swing.JLabel topleftborder;
    // End of variables declaration//GEN-END:variables
}
