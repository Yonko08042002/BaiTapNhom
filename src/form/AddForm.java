/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import Connect.NhanVienDAO;
import javax.swing.JOptionPane;
import model.nhanVien;

/**
 *
 * @author DELL
 */
public class AddForm extends javax.swing.JFrame {

    /**
     * Creates new form AddForm
     */
    public AddForm() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        female118 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtid118 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname118 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        male118 = new javax.swing.JRadioButton();
        btadd118 = new com.k33ptoo.components.KButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txtaddress118 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtphone118 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txtemaill118 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtdate118 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txtposition118 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(105, 48, 195));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        female118.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female118);
        female118.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        female118.setForeground(new java.awt.Color(3, 37, 108));
        female118.setText("Female");
        jPanel1.add(female118, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(3, 37, 108));
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(3, 37, 108));
        jLabel6.setText("Phone :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(3, 37, 108));
        jLabel7.setText("Email :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(3, 37, 108));
        jLabel8.setText("Date of Birth :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(3, 37, 108));
        jLabel9.setText("Position :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 37, 108));
        jLabel1.setText("ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, -1));

        txtid118.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtid118.setForeground(new java.awt.Color(0, 48, 73));
        txtid118.setBorder(null);
        jPanel1.add(txtid118, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 311, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(3, 37, 108));
        jLabel3.setText("Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtname118.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtname118.setForeground(new java.awt.Color(0, 48, 73));
        txtname118.setBorder(null);
        jPanel1.add(txtname118, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(3, 37, 108));
        jLabel4.setText("Sex :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 41, -1));

        male118.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male118);
        male118.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        male118.setForeground(new java.awt.Color(3, 37, 108));
        male118.setText("Male");
        jPanel1.add(male118, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        btadd118.setText("ADD");
        btadd118.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btadd118.setkBorderRadius(50);
        btadd118.setkEndColor(new java.awt.Color(153, 0, 153));
        btadd118.setkHoverEndColor(new java.awt.Color(51, 204, 255));
        btadd118.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btadd118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadd118ActionPerformed(evt);
            }
        });
        jPanel1.add(btadd118, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 231, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 72, 310, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 310, 10));

        jSeparator8.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 310, 10));

        txtaddress118.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtaddress118.setForeground(new java.awt.Color(0, 48, 73));
        txtaddress118.setBorder(null);
        jPanel1.add(txtaddress118, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 310, 25));

        jSeparator9.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 310, 10));

        txtphone118.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtphone118.setForeground(new java.awt.Color(0, 48, 73));
        txtphone118.setBorder(null);
        jPanel1.add(txtphone118, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 310, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 310, 10));

        txtemaill118.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtemaill118.setForeground(new java.awt.Color(0, 48, 73));
        txtemaill118.setBorder(null);
        jPanel1.add(txtemaill118, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 310, 25));

        jSeparator11.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 310, 10));

        txtdate118.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtdate118.setForeground(new java.awt.Color(0, 48, 73));
        txtdate118.setBorder(null);
        jPanel1.add(txtdate118, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 310, 25));

        jSeparator12.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 310, 10));

        txtposition118.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtposition118.setForeground(new java.awt.Color(0, 48, 73));
        txtposition118.setBorder(null);
        jPanel1.add(txtposition118, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 310, 25));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Employees");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logout_w_30px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pencil_50px.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo-fococlipping-standard (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel11)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btadd118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadd118ActionPerformed
        // TODO add your handling code here:
        nhanVien ql = new nhanVien();
        ql.setID(txtid118.getText());
        ql.setName(txtname118.getText());
        ql.setAddress(txtaddress118.getText());
        ql.setDateOfBirth(txtdate118.getText());
        ql.setPhone(txtphone118.getText());
        ql.setPosition(txtposition118.getText());
        ql.setEmail(txtemaill118.getText());
        String gt="";
        if(male118.isSelected()){
            gt = "Nam";
        }
        else{
            gt = "Nữ";
        }
        ql.setSex(gt);
        boolean isOk=true;
            if(isOk){
                new NhanVienDAO().add(ql);
                JOptionPane.showMessageDialog(this, "Bạn đã thêm thông tin thành công!");
                Main fm = new Main();
                this.dispose();
                fm.setVisible(true);
            } 
    }//GEN-LAST:event_btadd118ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btadd118;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female118;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JRadioButton male118;
    private javax.swing.JTextField txtaddress118;
    private javax.swing.JTextField txtdate118;
    private javax.swing.JTextField txtemaill118;
    private javax.swing.JTextField txtid118;
    private javax.swing.JTextField txtname118;
    private javax.swing.JTextField txtphone118;
    private javax.swing.JTextField txtposition118;
    // End of variables declaration//GEN-END:variables
}
