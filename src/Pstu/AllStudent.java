/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pstu;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class AllStudent extends javax.swing.JFrame {

    /**
     * Creates new form AllStudent
     */
    public String session = "";
    public String faculty = "";
    public String roll= "";
    public AllStudent(String sessions, String facultys) {
//        System.out.println("Constructor");
        session = sessions;
        faculty = facultys;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pstu = new javax.swing.JLabel();
        facultyText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        View = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(634, 80));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(65, 12, 62));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Id", "Registration", "Email", "Phone", "Hall"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setRowHeight(30);
        jTable1.setRowMargin(5);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 170, 1070, 170));

        pstu.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        pstu.setText("Patuakhali Science & Technology University");
        getContentPane().add(pstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 810, 50));

        facultyText.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        getContentPane().add(facultyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 630, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/vactorimage/under line design .png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 640, 80));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        close.setText("View");
        close.setActionCommand("Close");
        close.setBorder(null);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 130, 40));

        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close Jframe.png"))); // NOI18N
        View.setText("Close");
        View.setBorder(null);
        View.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        getContentPane().add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 790, 130, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/1115855.png"))); // NOI18N
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1115, 855));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
                // TODO add your handling code here:
        
        facultyText.setText(faculty+" :- "+session);
        try{
//            System.out.println("Form Component Shown");
            conn cc = new conn();
            try (ResultSet rs = cc.s.executeQuery("select * from student where session='"+session+"' and fac='"+faculty+"'")) {
                DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
                if(rs.next())
                    do{
                        String name = rs.getString(2);
                        String id = rs.getString(8);
                        String reg = rs.getString(9);
                        String email = rs.getString(12);
                        String phone = rs.getString(6);
                        String hall = rs.getString(15);
                        String st[] = {name,id,reg,email,phone,hall};
                        table.addRow(st);
                    }while(rs.next());
            }
               cc.s.close();
               
        }catch(SQLException e){
        }
    }//GEN-LAST:event_formComponentShown

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        
//        new adminStudent("").setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:

             this.setVisible(false);
             DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
             int id = jTable1.getSelectedRow();
             roll = table.getValueAt(id,1).toString();
             new print(roll).setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AllStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AllStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AllStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AllStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AllStudent("","").setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton View;
    private javax.swing.JLabel background;
    private javax.swing.JButton close;
    private javax.swing.JLabel facultyText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel pstu;
    // End of variables declaration//GEN-END:variables
}
