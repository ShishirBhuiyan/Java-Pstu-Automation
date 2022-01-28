/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pstu;

import ImageInsert_ImageShow.Insert;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class print extends javax.swing.JFrame {

    /**
     * Creates new form print
     */
    public String getId = "";
    public String getImageName = "";
     String s;
     ResultSet rs;
    public print(String id) {
        System.out.println("Constructor");
        getId = id;
        initComponents();
    }
    
    
        public class func{
            public ResultSet find(String s) throws SQLException{

                try{      
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
                    PreparedStatement ps=con.prepareStatement("Select * from  student where roll = ?");
                    ps.setString(1,s);
                    rs  = ps.executeQuery(); 
                }catch(ClassNotFoundException ev){
                }
                return rs;

            }
        }
    
//        sCardTitle.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if(adminStudentVisible==0){
//                    adminStudentVisible=1;
//                    new adminStudent().setVisible(true);
//                }
//            }
//
//        });
        
        public void showComponent(){
                System.out.println("formComponentShown");
                    // Call func meathoad
                   print.func f = new print.func();
                    try {
                        
                        //  recive func meathoad return query result                   
                        rs = f.find(getId);
                        if(rs.next()){
                                byte[] img = rs.getBytes("photo");
                                
                                if(img != null){
                                
                                ImageIcon MyImage1 = new ImageIcon(img);
                                Image img1 = MyImage1.getImage();
                                Image newImage1 = img1.getScaledInstance(profilePic.getWidth(), profilePic.getHeight(), Image.SCALE_SMOOTH);
                                ImageIcon image1 = new ImageIcon(newImage1);
                                profilePic.setIcon(image1);
                                }
                                
                                
                                
                                jnames.setText(rs.getString(2));
                                jphones.setText(rs.getString(6));
                                Jreg.setText(rs.getString(9));
                                Jsession.setText(rs.getString(10));
                                Jid.setText(rs.getString(8));
                                JBlood.setText(rs.getString(13));
                                Jdob.setText(rs.getString(11));
                                Jnid.setText(rs.getString(7));
                                Jsem.setText("Second");
                                Jhall.setText(rs.getString(15));
                                getImageName = rs.getString(16);
                                
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
        }
        
        public void prints(){
            showComponent();
            System.out.println("prints");
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable((Graphics pg, PageFormat pf, int pageNum) -> {
                pf.setOrientation(PageFormat.LANDSCAPE);
                if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47,0.47);
                print.print(g2);
                return Printable.PAGE_EXISTS;
            });
            
            
            boolean ok = job.printDialog();
            if(ok){
                try{

                job.print();
                }
                catch (PrinterException ex){
                }
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

        print = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        underText = new javax.swing.JLabel();
        forDeanfac = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        dot = new javax.swing.JLabel();
        dot7 = new javax.swing.JLabel();
        dot5 = new javax.swing.JLabel();
        dot1 = new javax.swing.JLabel();
        dot2 = new javax.swing.JLabel();
        dot4 = new javax.swing.JLabel();
        jnames = new javax.swing.JLabel();
        jphones = new javax.swing.JLabel();
        Jsession = new javax.swing.JLabel();
        Jreg = new javax.swing.JLabel();
        Jhall = new javax.swing.JLabel();
        Jsem = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        name9 = new javax.swing.JLabel();
        JBlood = new javax.swing.JLabel();
        Jdob = new javax.swing.JLabel();
        Jnid = new javax.swing.JLabel();
        dot10 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        dot11 = new javax.swing.JLabel();
        dot12 = new javax.swing.JLabel();
        name10 = new javax.swing.JLabel();
        name12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        border1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Jid = new javax.swing.JLabel();
        name13 = new javax.swing.JLabel();
        dot3 = new javax.swing.JLabel();
        profilePic = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(440, 10));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1300, 1700));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        print.setBackground(new java.awt.Color(255, 255, 255));
        print.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        print.setPreferredSize(new java.awt.Dimension(1300, 810));
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 38)); // NOI18N
        jLabel2.setText("Patuakhali Science & Technology University");
        print.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 790, 60));

        underText.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        underText.setText("Dumki-8602, Dumki, Patuakhali ");
        print.add(underText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 350, 40));

        forDeanfac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        forDeanfac.setText("Computer Science & Engineering");
        print.add(forDeanfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1050, 260, 30));

        name2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name2.setText("Name ");
        print.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 70, 30));

        name7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name7.setText("Session");
        print.add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 80, 40));

        name6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name6.setText("Reg");
        print.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 80, 30));

        dot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot.setText(":");
        print.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 20, 30));

        dot7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot7.setText(":");
        print.add(dot7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 20, -1));

        dot5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot5.setText(":");
        print.add(dot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 20, -1));

        dot1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot1.setText(":");
        print.add(dot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 20, 30));

        dot2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot2.setText(":");
        print.add(dot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 20, -1));

        dot4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot4.setText(":");
        print.add(dot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 10, 20));

        jnames.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(jnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 210, 30));

        jphones.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(jphones, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 180, 40));

        Jsession.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(Jsession, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 170, 40));

        Jreg.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(Jreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 190, 30));

        Jhall.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(Jhall, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 190, 30));

        Jsem.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(Jsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 220, 40));

        name11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name11.setText("Blood");
        print.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 60, 30));

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setText("DOB");
        print.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 60, 40));

        name9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name9.setText("Semister");
        print.add(name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 110, 40));

        JBlood.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(JBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 190, 30));

        Jdob.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(Jdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 190, 40));

        Jnid.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(Jnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 350, 190, 30));

        dot10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot10.setText(":");
        print.add(dot10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 20, 30));

        name4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name4.setText("Phone");
        print.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 80, 40));

        dot11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot11.setText(":");
        print.add(dot11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 20, 30));

        dot12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot12.setText(":");
        print.add(dot12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, 20, 40));

        name10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name10.setText("Nid");
        print.add(name10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 60, 30));

        name12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name12.setText("Hall");
        print.add(name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 80, 40));

        result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Semister", "Date", "GPA", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        result.setRowHeight(30);
        result.setRowMargin(20);
        result.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(result);

        print.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 1070, 310));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("This page is fully justified, this students details by PSTU ");
        print.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1300, 470, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Student Signature");
        print.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1050, 180, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        print.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 1040, 300, 10));

        border1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Border/under line design .png"))); // NOI18N
        print.add(border1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 640, 60));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        print.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1040, 320, 10));

        Jid.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        print.add(Jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 190, 40));

        name13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name13.setText("Id");
        print.add(name13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 80, 40));

        dot3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot3.setText(":");
        print.add(dot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 20, 40));

        profilePic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        print.add(profilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 230, 220));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setOpaque(true);
        print.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1810));

        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
                    // Call func meathoad
//                   print.func f = new print.func();
//                    try {
//                        
//                        //  recive func meathoad return query result                   
//                        rs = f.find(getId);
//                        if(rs.next()){
//                                byte[] img = rs.getBytes("photo");
//                                System.out.println(img);
//                                ImageIcon MyImage1 = new ImageIcon(img);
//                                Image img1 = MyImage1.getImage();
//                                Image newImage1 = img1.getScaledInstance(profilePic.getWidth(), profilePic.getHeight(), Image.SCALE_SMOOTH);
//                                ImageIcon image1 = new ImageIcon(newImage1);
//                                profilePic.setIcon(image1);
//                                
//                                
//                                jnames.setText(rs.getString(2));
//                                jphones.setText(rs.getString(6));
//                                Jreg.setText(rs.getString(9));
//                                Jsession.setText(rs.getString(10));
//                                Jid.setText(rs.getString(8));
//                                JBlood.setText(rs.getString(13));
//                                Jdob.setText(rs.getString(11));
//                                Jnid.setText(rs.getString(7));
//                                Jsem.setText("Second");
//                                Jhall.setText(rs.getString(15));
//                                getImageName = rs.getString(16);
//                                
//                        }
//                    } catch (SQLException ex) {
//                        Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
//                    }
        

    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new print("1234567").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JBlood;
    private javax.swing.JLabel Jdob;
    private javax.swing.JLabel Jhall;
    private javax.swing.JLabel Jid;
    private javax.swing.JLabel Jnid;
    private javax.swing.JLabel Jreg;
    private javax.swing.JLabel Jsem;
    private javax.swing.JLabel Jsession;
    private javax.swing.JLabel background;
    private javax.swing.JLabel border1;
    private javax.swing.JLabel dot;
    private javax.swing.JLabel dot1;
    private javax.swing.JLabel dot10;
    private javax.swing.JLabel dot11;
    private javax.swing.JLabel dot12;
    private javax.swing.JLabel dot2;
    private javax.swing.JLabel dot3;
    private javax.swing.JLabel dot4;
    private javax.swing.JLabel dot5;
    private javax.swing.JLabel dot7;
    private javax.swing.JLabel forDeanfac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jnames;
    private javax.swing.JLabel jphones;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name10;
    private javax.swing.JLabel name11;
    private javax.swing.JLabel name12;
    private javax.swing.JLabel name13;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JLabel name9;
    private javax.swing.JPanel print;
    private javax.swing.JLabel profilePic;
    private javax.swing.JTable result;
    private javax.swing.JLabel underText;
    // End of variables declaration//GEN-END:variables
}
