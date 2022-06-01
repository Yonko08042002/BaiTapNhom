
package form;

import Connect.NhanVienDAO;
import Service.Service;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.nhanVien;

public class UpdateForm extends javax.swing.JFrame {
    int selectedIndex;
    Service qlService;
    NhanVienDAO qlbd;
    DefaultTableModel defaultTableModel;
    private List<nhanVien> ql;
    private DefaultTableModel model;
    nhanVien nv;
    /**
     * Creates new form AddForm
     */
    public UpdateForm() {
        initComponents();
        qlbd = new NhanVienDAO();
        getDataComboBox();
    }
    private void getDataComboBox(){
        List<String> data = qlbd.getAllId();
        for(String s: data){
            jComboBox_id101.addItem(s);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        female118 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname101 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        male118 = new javax.swing.JRadioButton();
        btnupdate101 = new com.k33ptoo.components.KButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txtaddress101 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtphone101 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txtemail101 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtdate101 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txtposition101 = new javax.swing.JTextField();
        jComboBox_id101 = new javax.swing.JComboBox<>();
        btnrefresh101 = new com.k33ptoo.components.KButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel2.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(105, 48, 195));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employees");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logout_w_30px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Update");

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(3, 37, 108));
        jLabel3.setText("Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtname101.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtname101.setForeground(new java.awt.Color(0, 48, 73));
        txtname101.setBorder(null);
        jPanel1.add(txtname101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 30));

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

        btnupdate101.setText("UPDATE");
        btnupdate101.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdate101.setkBorderRadius(50);
        btnupdate101.setkEndColor(new java.awt.Color(153, 0, 153));
        btnupdate101.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnupdate101.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btnupdate101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate101ActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate101, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 110, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 310, 10));

        jSeparator8.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 310, 10));

        txtaddress101.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtaddress101.setForeground(new java.awt.Color(0, 48, 73));
        txtaddress101.setBorder(null);
        jPanel1.add(txtaddress101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 310, 25));

        jSeparator9.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 310, 10));

        txtphone101.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtphone101.setForeground(new java.awt.Color(0, 48, 73));
        txtphone101.setBorder(null);
        jPanel1.add(txtphone101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 310, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 310, 10));

        txtemail101.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtemail101.setForeground(new java.awt.Color(0, 48, 73));
        txtemail101.setBorder(null);
        jPanel1.add(txtemail101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 310, 25));

        jSeparator11.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 310, 10));

        txtdate101.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtdate101.setForeground(new java.awt.Color(0, 48, 73));
        txtdate101.setBorder(null);
        jPanel1.add(txtdate101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 310, 25));

        jSeparator12.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 310, 10));

        txtposition101.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtposition101.setForeground(new java.awt.Color(0, 48, 73));
        txtposition101.setBorder(null);
        jPanel1.add(txtposition101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 310, 25));

        jComboBox_id101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_id101ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_id101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 320, 30));

        btnrefresh101.setText("REFRESH");
        btnrefresh101.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnrefresh101.setkBorderRadius(50);
        btnrefresh101.setkEndColor(new java.awt.Color(153, 0, 153));
        btnrefresh101.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnrefresh101.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btnrefresh101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefresh101ActionPerformed(evt);
            }
        });
        jPanel1.add(btnrefresh101, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 120, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/set_100px.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/setting_100px.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings_100px.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 450, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/set_100px.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 80, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/setting_100px.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/setting_100px.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/setting_100px.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/setting_100px.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sett_100px.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/set_100px.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel17)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel12)
                        .addGap(27, 27, 27))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18)))
                                .addGap(55, 55, 55))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel20)
                                .addGap(64, 64, 64))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel15))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel17)
                        .addContainerGap())
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        getContentPane().add(kGradientPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdate101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate101ActionPerformed
        int otp = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa hay không?", "Confirm", JOptionPane.YES_OPTION);
        if(otp == JOptionPane.YES_OPTION){
            nhanVien bk = new nhanVien();
            bk.setID(jComboBox_id101.getSelectedItem().toString());
            bk.setName(txtname101.getText());
            bk.setAddress(txtaddress101.getText());
            bk.setPhone(txtphone101.getText());
            bk.setDateOfBirth(txtdate101.getText());
            bk.setEmail(txtemail101.getText());
            bk.setPosition(txtposition101.getText());
            String gt="";
            if(male118.isSelected()){
                gt = "Nam";
            }
            else{
                gt = "Nữ";
            }
            bk.setSex(gt);
            qlbd.updateUser(bk);
            JOptionPane.showMessageDialog(this, "Bạn đã sửa thông tin thành công!");
            Main fm = new Main();
            this.dispose();
            fm.setVisible(false);
        }
    }//GEN-LAST:event_btnupdate101ActionPerformed

    private void btnrefresh101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefresh101ActionPerformed
        // TODO add your handling code here:
        jComboBox_id101.setSelectedItem("");
        txtname101.setText("");
        txtaddress101.setText("");
        txtphone101.setText("");
        txtdate101.setText("");
        txtemail101.setText("");
        txtposition101.setText("");
        male118.setSelected(true);
    }//GEN-LAST:event_btnrefresh101ActionPerformed

    private void jComboBox_id101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_id101ActionPerformed
        // TODO add your handling code here:
            int index = jComboBox_id101.getSelectedIndex();
            String value = jComboBox_id101.getItemAt(index);
            nv = qlbd.find1TaiLieu(value);
            txtname101.setText(nv.getName());
            txtaddress101.setText(nv.getAddress());
            txtphone101.setText(nv.getPhone());
            txtdate101.setText(nv.getDateOfBirth());
            txtemail101.setText(nv.getEmail());
            txtposition101.setText(nv.getPosition());
             male118.setSelected(true);
    }//GEN-LAST:event_jComboBox_id101ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnrefresh101;
    private com.k33ptoo.components.KButton btnupdate101;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female118;
    private javax.swing.JComboBox<String> jComboBox_id101;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JRadioButton male118;
    private javax.swing.JTextField txtaddress101;
    private javax.swing.JTextField txtdate101;
    private javax.swing.JTextField txtemail101;
    private javax.swing.JTextField txtname101;
    private javax.swing.JTextField txtphone101;
    private javax.swing.JTextField txtposition101;
    // End of variables declaration//GEN-END:variables
}
