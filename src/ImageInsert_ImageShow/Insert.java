/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageInsert_ImageShow;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author ASUS
 */
public class Insert extends javax.swing.JFrame {

    
    String s;
     ResultSet rs;
    /**
     * Creates new form Insert
     */
    public Insert() {
        initComponents();
    }
    
    public class func{
        public ResultSet find(String s) throws SQLException{
           
            try{      
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blob","root","");
                PreparedStatement ps=con.prepareStatement("Select * from  details where name = ?");
                ps.setString(1,s);
                rs  = ps.executeQuery(); 
            }catch(ClassNotFoundException ev){
            }
            return rs;
        
        }
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
        image = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        select = new javax.swing.JButton();
        retribes = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 300, 270));

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 130, 50));

        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 120, 50));

        retribes.setText("Retribe");
        retribes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retribesActionPerformed(evt);
            }
        });
        jPanel1.add(retribes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 120, 50));
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 360, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Insert Image with custom name. And retribe Image with image name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 510, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
       String getName = nameField.getText();
        try{      
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blob","root","");
            PreparedStatement ps=con.prepareStatement("insert into details (name,image) values(?,?)");
            FileInputStream fis= new FileInputStream(new File(s));
             ps.setString(1,getName);
             ps.setBlob(2, fis);
             ps.executeUpdate();
             JOptionPane.showMessageDialog(this,"Hello, Welcome to Javatpoint.");  
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_insertActionPerformed
    
    
    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileFilter filter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(filter);
        
        
       int result = fileChooser.showSaveDialog(null);
       if(result == JFileChooser.APPROVE_OPTION){
           File selectedFile = fileChooser.getSelectedFile();
           String photoPath = selectedFile.getAbsolutePath();
           image.setIcon(ResizeImage(photoPath));
           s = photoPath;
       }
    }//GEN-LAST:event_selectActionPerformed

    private void retribesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retribesActionPerformed
        // TODO add your handling code here:
       Insert.func f = new Insert.func();
        try {
            rs = f.find(nameField.getText());
            if(rs.next()){
                   byte[] img = rs.getBytes("image");
                   System.out.println(img);
                    ImageIcon MyImage1 = new ImageIcon(img);
                    Image img1 = MyImage1.getImage();
                    Image newImage1 = img1.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon image1 = new ImageIcon(newImage1);
                    image.setIcon(image1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_retribesActionPerformed

    /**
     * @param imafePaths
     * @return 
     */
    public ImageIcon ResizeImage(String imafePaths){
        ImageIcon MyImage = new ImageIcon(imafePaths);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton retribes;
    private javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}
