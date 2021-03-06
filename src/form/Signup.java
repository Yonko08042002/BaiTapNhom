/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import Connect.JDBCConnection_101;
import Connect.TaiKhoanDAO_101;
import java.awt.Color;
import java.awt.Font;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.taiKhoan_118_101;

public class Signup extends javax.swing.JFrame {

    
    public Signup() {
        initComponents();
        addPlaceholderStyle(txtname118);
        addPlaceholderStyle(txtaddress118);
        addPlaceholderStyle(txtphone118);
        addPlaceholderStyle(txtemail118);
        addPlaceholderStyle(txtusername118);
        addPlaceholderStyle(txtpass118);
        addPlaceholderStyle(txtconfirmpass118);
        this.setLocationRelativeTo(null);
        
    }
    public void init(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
    }
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttgroup1 = new javax.swing.ButtonGroup();
        formChinh_118 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        formMin_118 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bttdangki118 = new javax.swing.JButton();
        txtname118 = new javax.swing.JTextField();
        txtaddress118 = new javax.swing.JTextField();
        txtphone118 = new javax.swing.JTextField();
        txtemail118 = new javax.swing.JTextField();
        txtusername118 = new javax.swing.JTextField();
        txtpass118 = new javax.swing.JPasswordField();
        txtconfirmpass118 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btn_Back118 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        formChinh_118.setBackground(new java.awt.Color(200, 230, 250));
        formChinh_118.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/???Pngtree???business staff talking and working_7256294.png"))); // NOI18N
        formChinh_118.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 135, 361, 342));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Created By  Error Sever Team");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        formChinh_118.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 538, 245, 53));

        formMin_118.setBackground(new java.awt.Color(255, 255, 255));
        formMin_118.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("Sign Up");
        formMin_118.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jLabel3.setText("Hello ! Let's get started");
        formMin_118.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 50, 190, -1));

        bttdangki118.setBackground(new java.awt.Color(255, 255, 255));
        bttdangki118.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bttdangki118.setForeground(new java.awt.Color(71, 120, 197));
        bttdangki118.setText("SIGN UP");
        bttdangki118.setBorder(null);
        bttdangki118.setBorderPainted(false);
        bttdangki118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttdangki118ActionPerformed(evt);
            }
        });
        formMin_118.add(bttdangki118, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 342, 280, 40));

        txtname118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtname118.setText("Name");
        txtname118.setBorder(null);
        txtname118.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtname118FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtname118FocusLost(evt);
            }
        });
        txtname118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname118ActionPerformed(evt);
            }
        });
        formMin_118.add(txtname118, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 72, 290, 23));

        txtaddress118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtaddress118.setText("Address");
        txtaddress118.setBorder(null);
        txtaddress118.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddress118FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaddress118FocusLost(evt);
            }
        });
        txtaddress118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddress118ActionPerformed(evt);
            }
        });
        formMin_118.add(txtaddress118, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 20));

        txtphone118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtphone118.setText("Phone");
        txtphone118.setBorder(null);
        txtphone118.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtphone118FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtphone118FocusLost(evt);
            }
        });
        formMin_118.add(txtphone118, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 290, 23));

        txtemail118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtemail118.setText("Email");
        txtemail118.setBorder(null);
        txtemail118.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemail118FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemail118FocusLost(evt);
            }
        });
        formMin_118.add(txtemail118, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 290, 23));

        txtusername118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtusername118.setText("Username");
        txtusername118.setBorder(null);
        txtusername118.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusername118FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusername118FocusLost(evt);
            }
        });
        formMin_118.add(txtusername118, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 112, 290, 23));

        txtpass118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpass118.setText("Password");
        txtpass118.setBorder(null);
        txtpass118.setEchoChar('\u0000');
        txtpass118.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpass118FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpass118FocusLost(evt);
            }
        });
        formMin_118.add(txtpass118, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 148, 290, 23));

        txtconfirmpass118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtconfirmpass118.setText("ConfirmPassword");
        txtconfirmpass118.setBorder(null);
        txtconfirmpass118.setEchoChar('\u0000');
        txtconfirmpass118.setFocusAccelerator('\u0001');
        txtconfirmpass118.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtconfirmpass118FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtconfirmpass118FocusLost(evt);
            }
        });
        formMin_118.add(txtconfirmpass118, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 290, 23));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 255));
        formMin_118.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 280, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 255));
        formMin_118.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 51, 255));
        formMin_118.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 172, 280, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 51, 255));
        formMin_118.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 51, 255));
        formMin_118.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 51, 255));
        formMin_118.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 280, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 51, 255));
        formMin_118.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 272, 280, 10));

        jSeparator8.setBackground(new java.awt.Color(0, 51, 255));
        formMin_118.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 280, 10));

        formChinh_118.add(formMin_118, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 340, 420));

        btn_Back118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logout_w_30px.png"))); // NOI18N
        btn_Back118.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Back118MouseClicked(evt);
            }
        });
        formChinh_118.add(btn_Back118, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        getContentPane().add(formChinh_118);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
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

    private void txtconfirmpass118FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconfirmpass118FocusLost
        // TODO add your handling code here:
        if(txtconfirmpass118.getText().length()==0){
            addPlaceholderStyle(txtconfirmpass118);
            txtconfirmpass118.setText(("ConfirmPassword"));
            txtconfirmpass118.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtconfirmpass118FocusLost

    private void txtconfirmpass118FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconfirmpass118FocusGained
        // TODO add your handling code here:
        if(txtconfirmpass118.getText().equals("ConfirmPassword")){
            txtconfirmpass118.setText(null);
            txtconfirmpass118.requestFocus();
            txtconfirmpass118.setEchoChar('*');
            removePlaceholderStyle(txtconfirmpass118);
        }
    }//GEN-LAST:event_txtconfirmpass118FocusGained

    private void txtpass118FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpass118FocusLost
        // TODO add your handling code here:
        if(txtpass118.getText().length()==0){
            addPlaceholderStyle(txtpass118);
            txtpass118.setText(("Password"));
            txtpass118.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtpass118FocusLost

    private void txtpass118FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpass118FocusGained
        // TODO add your handling code here:
        if(txtpass118.getText().equals("Password")){
            txtpass118.setText(null);
            txtpass118.requestFocus();
            txtpass118.setEchoChar('*');
            removePlaceholderStyle(txtpass118);
        }
    }//GEN-LAST:event_txtpass118FocusGained

    private void txtusername118FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusername118FocusLost
        // TODO add your handling code here:
        if(txtusername118.getText().length()==0){
            addPlaceholderStyle(txtusername118);
            txtusername118.setText(("Username"));
        }
    }//GEN-LAST:event_txtusername118FocusLost

    private void txtusername118FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusername118FocusGained
        // TODO add your handling code here:
        if(txtusername118.getText().equals("Username")){
            txtusername118.setText(null);
            txtusername118.requestFocus();
            removePlaceholderStyle(txtusername118);
        }
    }//GEN-LAST:event_txtusername118FocusGained

    private void txtemail118FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemail118FocusLost
        // TODO add your handling code here:
        if(txtname118.getText().length()==0){
            addPlaceholderStyle(txtname118);
            txtname118.setText(("Email"));
        }
    }//GEN-LAST:event_txtemail118FocusLost

    private void txtemail118FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemail118FocusGained
        // TODO add your handling code here:
        if(txtemail118.getText().equals("Email")){
            txtemail118.setText(null);
            txtemail118.requestFocus();
            removePlaceholderStyle(txtemail118);
        }
    }//GEN-LAST:event_txtemail118FocusGained

    private void txtphone118FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphone118FocusLost
        // TODO add your handling code here:
        if(txtphone118.getText().length()==0){
            addPlaceholderStyle(txtphone118);
            txtphone118.setText(("Phone"));
        }
    }//GEN-LAST:event_txtphone118FocusLost

    private void txtphone118FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphone118FocusGained
        // TODO add your handling code here:
        if(txtphone118.getText().equals("Phone")){
            txtphone118.setText(null);
            txtphone118.requestFocus();
            removePlaceholderStyle(txtphone118);
        }
    }//GEN-LAST:event_txtphone118FocusGained

    private void txtaddress118FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddress118FocusLost
        // TODO add your handling code here:
        if(txtaddress118.getText().length()==0){
            addPlaceholderStyle(txtaddress118);
            txtaddress118.setText(("Address"));
        }
    }//GEN-LAST:event_txtaddress118FocusLost

    private void txtaddress118FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddress118FocusGained
        // TODO add your handling code here:
        if(txtaddress118.getText().equals("Address")){
            txtaddress118.setText(null);
            txtaddress118.requestFocus();
            removePlaceholderStyle(txtaddress118);
        }
    }//GEN-LAST:event_txtaddress118FocusGained

    private void txtname118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname118ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtname118ActionPerformed

    private void txtname118FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtname118FocusLost
        // TODO add your handling code here:
        if(txtname118.getText().length()==0){
            addPlaceholderStyle(txtname118);
            txtname118.setText(("Name"));
        }
    }//GEN-LAST:event_txtname118FocusLost

    private void txtname118FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtname118FocusGained
        // TODO add your handling code here:
        if(txtname118.getText().equals("Name")){
            txtname118.setText(null);
            txtname118.requestFocus();
            removePlaceholderStyle(txtname118);
        }
    }//GEN-LAST:event_txtname118FocusGained

    private void bttdangki118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttdangki118ActionPerformed
        // TODO add your handling code here:
       String passwork  = new String(txtpass118.getPassword());
       String confirmpass = new String(txtconfirmpass118.getPassword());
       
            JDBCConnection_101  con =  new JDBCConnection_101();
            
            if(txtname118.equals("")|| txtusername118.equals("")||txtpass118.equals("")||txtconfirmpass118.equals("")||txtaddress118.equals("")||txtphone118.equals("")||txtemail118.equals("")){
                JOptionPane.showMessageDialog(this, "Please fill in all the information");
            }else{
                if(passwork.equals(confirmpass)){
                    JOptionPane.showMessageDialog(this, "User Successfull Registered", "Success", JOptionPane.INFORMATION_MESSAGE);
                    taiKhoan_118_101 tk = new taiKhoan_118_101();
                    tk.setName(txtname118.getText());
                    tk.setUsername(txtusername118.getText());
                    tk.setPassword(txtpass118.getText());
                    tk.setConfirmpassword(txtconfirmpass118.getText());
                    tk.setAddress(txtaddress118.getText());
                    tk.setPhone(txtphone118.getText());
                    tk.setEmail(txtemail118.getText());
                    boolean isOk=true;
                    if(isOk){
                        new TaiKhoanDAO_101().addTaiKhoan(tk);
                        this.setVisible(isOk);
                        Signin ql = new Signin();
                        ql.setVisible(true);
                        this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Check your Username or Passwork for Error ", "User not registered", JOptionPane.ERROR_MESSAGE);
            }
            }
        
    }//GEN-LAST:event_bttdangki118ActionPerformed

    private void btn_Back118MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Back118MouseClicked
        // TODO add your handling code here:

        setVisible(false);

    }//GEN-LAST:event_btn_Back118MouseClicked

    private void txtaddress118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddress118ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddress118ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Back118;
    private javax.swing.JButton bttdangki118;
    private javax.swing.ButtonGroup bttgroup1;
    private javax.swing.JPanel formChinh_118;
    private javax.swing.JPanel formMin_118;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtaddress118;
    private javax.swing.JPasswordField txtconfirmpass118;
    private javax.swing.JTextField txtemail118;
    private javax.swing.JTextField txtname118;
    private javax.swing.JPasswordField txtpass118;
    private javax.swing.JTextField txtphone118;
    private javax.swing.JTextField txtusername118;
    // End of variables declaration//GEN-END:variables
}
