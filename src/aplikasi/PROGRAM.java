package aplikasi;
import java.sql.*;
import javax.swing.JOptionPane;
import koneksi.koneksi1;

public class PROGRAM extends javax.swing.JFrame {
koneksi1 xxx;
    /**
     * Creates new form PROGRAM
     */
    public PROGRAM() {
        initComponents();
        xxx = new koneksi1();
        xxx.Class();
        this.setLocationRelativeTo(null);
    }
    private void login(){
        try {
            String nama = tnama.getText();
            String pas = new String(tpas.getText());
            xxx.ss = xxx.cc.createStatement();
            String sql = "Select * From tblogin Where USERNAME = '"+nama+"'And PASSWORD ='"+pas+"'";
            xxx.rr = xxx.ss.executeQuery(sql);
        if (xxx.rr.next()){
            if (tpas.getText().equals(xxx.rr.getString("password"))){
                new Menu_utama().show();
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "password salah, silakan masukkan kembali");
                tpas.setText("");
                tpas.requestFocus();
            }    
        }
        else{
            JOptionPane.showMessageDialog(null, "login gagal");
        }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpas = new javax.swing.JPasswordField();
        tnama = new javax.swing.JTextField();
        panelGambar12 = new aplikasi.PanelGambar();
        sign_up = new javax.swing.JButton();
        panelGambar11 = new aplikasi.PanelGambar();
        jLabel13 = new javax.swing.JLabel();
        panelGambar13 = new aplikasi.PanelGambar();
        panelGambar6 = new aplikasi.PanelGambar();
        panelGambar9 = new aplikasi.PanelGambar();
        jLabel3 = new javax.swing.JLabel();
        panelGambar10 = new aplikasi.PanelGambar();
        jLabel9 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelGambar5 = new aplikasi.PanelGambar();
        panelGambar7 = new aplikasi.PanelGambar();
        panelGambar3 = new aplikasi.PanelGambar();
        panelGambar4 = new aplikasi.PanelGambar();
        panelGambar2 = new aplikasi.PanelGambar();
        panelGambar1 = new aplikasi.PanelGambar();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelGambar8 = new aplikasi.PanelGambar();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tpas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpasActionPerformed(evt);
            }
        });
        getContentPane().add(tpas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 200, 30));

        tnama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });
        getContentPane().add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 200, 30));

        panelGambar12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sign_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGIN (1) - Copy.jpg"))); // NOI18N
        sign_up.setAutoscrolls(true);
        sign_up.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_upActionPerformed(evt);
            }
        });
        panelGambar12.add(sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 30));

        getContentPane().add(panelGambar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 130, 110));

        panelGambar11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelGambar11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -20, 360, 270));

        getContentPane().add(panelGambar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 110, 50));

        panelGambar13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelGambar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 110, 30));

        panelGambar6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelGambar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 230, 30));

        panelGambar9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USERNAME");
        panelGambar9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 30));

        getContentPane().add(panelGambar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 230, 50));

        panelGambar10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PASSWORD");
        panelGambar10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGIN (1).jpg"))); // NOI18N
        login.setAutoscrolls(true);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        panelGambar10.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("OR");
        panelGambar10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, 30));

        getContentPane().add(panelGambar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 210, 110));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginicon.png"))); // NOI18N
        jLabel12.setAutoscrolls(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, 250));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 640, 310));

        panelGambar5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelGambar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 190));

        panelGambar7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelGambar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 80));

        panelGambar3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelGambar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 140, 80));

        panelGambar4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelGambar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 230, 80));

        panelGambar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelGambar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 140, 190));

        panelGambar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelGambar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 230, 190));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LOGIN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Morning Fog Wallpapers 7.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 640, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images (18).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images (18).jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images (18).jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 350, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images (18).jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 350, 70));

        panelGambar8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("please sign here");
        panelGambar8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        getContentPane().add(panelGambar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 200, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed

    }//GEN-LAST:event_tnamaActionPerformed

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed
        dispose();
    }//GEN-LAST:event_sign_upActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
login();
    }//GEN-LAST:event_loginActionPerformed

    private void tpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpasActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PROGRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROGRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROGRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROGRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROGRAM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton login;
    private aplikasi.PanelGambar panelGambar1;
    private aplikasi.PanelGambar panelGambar10;
    private aplikasi.PanelGambar panelGambar11;
    private aplikasi.PanelGambar panelGambar12;
    private aplikasi.PanelGambar panelGambar13;
    private aplikasi.PanelGambar panelGambar2;
    private aplikasi.PanelGambar panelGambar3;
    private aplikasi.PanelGambar panelGambar4;
    private aplikasi.PanelGambar panelGambar5;
    private aplikasi.PanelGambar panelGambar6;
    private aplikasi.PanelGambar panelGambar7;
    private aplikasi.PanelGambar panelGambar8;
    private aplikasi.PanelGambar panelGambar9;
    private javax.swing.JButton sign_up;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tpas;
    // End of variables declaration//GEN-END:variables
}
