/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import Connect.JDBCConnection;
import Connect.TaiKhoanDAO;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author ME1
 */
public class Signin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Signin() {
        initComponents();
        txtUsername_101.setBackground(new java.awt.Color(0,0,0,1));
        txtPassword_101.setBackground(new java.awt.Color(0,0,0,1));
       this.setLocationRelativeTo(null);
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
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Signin101 = new javax.swing.JPanel();
        jlbLogin_312 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername_101 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel_iconUser_101 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword_101 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        disable_101 = new javax.swing.JLabel();
        show_101 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        btnSignin_101 = new javax.swing.JButton();
        jlb_SignUp = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel_back_312 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Created By  Error Sever Team");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 360, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/—Pngtree—business staff talking and working_7256294.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 380, 360));

        jPanel_Signin101.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Signin101.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbLogin_312.setBackground(new java.awt.Color(0, 0, 0));
        jlbLogin_312.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jlbLogin_312.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLogin_312.setText("Sign In");
        jPanel_Signin101.add(jlbLogin_312, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 190, 41));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hello! Let's get started");
        jPanel_Signin101.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 380, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Username:");
        jPanel_Signin101.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 123, 341, -1));

        txtUsername_101.setFont(txtUsername_101.getFont().deriveFont(txtUsername_101.getFont().getSize()+2f));
        txtUsername_101.setBorder(null);
        jPanel_Signin101.add(txtUsername_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 140, 320, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("_______________________________________________");
        jPanel_Signin101.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 147, 330, 40));

        jLabel_iconUser_101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_iconUser_101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_25px.png"))); // NOI18N
        jPanel_Signin101.add(jLabel_iconUser_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 40, 39));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Password:");
        jPanel_Signin101.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 192, 341, -1));

        txtPassword_101.setFont(txtPassword_101.getFont().deriveFont(txtPassword_101.getFont().getSize()+2f));
        txtPassword_101.setBorder(null);
        txtPassword_101.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel_Signin101.add(txtPassword_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 320, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("_______________________________________________");
        jPanel_Signin101.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 216, 330, 40));

        disable_101.setBackground(new java.awt.Color(0, 0, 0));
        disable_101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable_101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/invisible_25px.png"))); // NOI18N
        disable_101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable_101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable_101MouseClicked(evt);
            }
        });
        jPanel_Signin101.add(disable_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 40, 40));

        show_101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye_25px.png"))); // NOI18N
        show_101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_101MouseClicked(evt);
            }
        });
        jPanel_Signin101.add(show_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 40, 40));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jCheckBox1.setText("Remember Password");
        jCheckBox1.setOpaque(false);
        jPanel_Signin101.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Forget Password ?");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Signin101.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 121, 27));

        btnSignin_101.setBackground(new java.awt.Color(255, 255, 255));
        btnSignin_101.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignin_101.setForeground(new java.awt.Color(71, 120, 197));
        btnSignin_101.setText("SIGN IN");
        btnSignin_101.setBorder(null);
        btnSignin_101.setBorderPainted(false);
        btnSignin_101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignin_101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignin_101ActionPerformed(evt);
            }
        });
        jPanel_Signin101.add(btnSignin_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 341, 40));

        jlb_SignUp.setBackground(new java.awt.Color(0, 0, 0));
        jlb_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlb_SignUp.setText("Sign Up");
        jlb_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlb_SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_SignUpMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlb_SignUpMousePressed(evt);
            }
        });
        jPanel_Signin101.add(jlb_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 60, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Don't have an account?");
        jPanel_Signin101.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 170, -1));

        jPanel1.add(jPanel_Signin101, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 420, 460));

        jLabel_back_312.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_back_312.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_back_312.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_back_312.setText("X");
        jLabel_back_312.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_back_312.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_back_312MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_back_312, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        setSize(new java.awt.Dimension(916, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_back_312MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_back_312MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_back_312MouseClicked

    private void disable_101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable_101MouseClicked
        txtPassword_101.setEchoChar((char)0);
        disable_101.setVisible(false);
        disable_101.setEnabled(false);
        show_101.setEnabled(true);
        show_101.setEnabled(true);
    }//GEN-LAST:event_disable_101MouseClicked

    private void show_101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_101MouseClicked
        txtPassword_101.setEchoChar((char)8226);
        disable_101.setVisible(true);
        disable_101.setEnabled(true);
        show_101.setEnabled(false);
        show_101.setEnabled(false);
    }//GEN-LAST:event_show_101MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened
        

    private void btnSignin_101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignin_101ActionPerformed

            Statement st;
            ResultSet rs;
        try {
            Connection con = JDBCConnection.JDBCConnection();
            String sql = "select* from TaiKhoan where username = ? and pass =?";//truy vấn đến sql
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, txtUsername_101.getText());
            ps.setString(2, txtPassword_101.getText());
            rs = ps.executeQuery();
            
            if(txtUsername_101.getText().equals("")|| txtPassword_101.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Username and Password is empty");
            }else 
                if(rs.next()){
                    Main ql = new Main();
                    ql.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "User has successfully login!");
                }else {
                    JOptionPane.showMessageDialog(this, "Login failed !");
                }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSignin_101ActionPerformed

    private void jlb_SignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_SignUpMousePressed
        // TODO add your handling code here:
        Signup signup =new Signup();
        signup.setVisible(true);//Hiển thị màn hình form đăng ký
        this.dispose();//thoát khỏi form đăng nhập
    }//GEN-LAST:event_jlb_SignUpMousePressed

    private void jlb_SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_SignUpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_SignUpMouseClicked

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
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignin_101;
    private javax.swing.JLabel disable_101;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_back_312;
    private javax.swing.JLabel jLabel_iconUser_101;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Signin101;
    private javax.swing.JLabel jlbLogin_312;
    private javax.swing.JLabel jlb_SignUp;
    private javax.swing.JLabel show_101;
    private javax.swing.JPasswordField txtPassword_101;
    private javax.swing.JTextField txtUsername_101;
    // End of variables declaration//GEN-END:variables
}
