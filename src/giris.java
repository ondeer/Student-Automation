
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;






public class giris extends javax.swing.JFrame {
    
    public static String k_id=null;//BAŞKA JFRAMELERDEN ULAŞMAMIZ İÇİN KULLANICI İD TANIMLIYORUZ
    public static String k_adi=null;//BAŞKA JFRAMELERDEN ULAŞMAMIZ İÇİN KULLANICI ADI TANIMLIYORUZ

   
    public giris() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_sifre = new javax.swing.JPasswordField();
        txt_kullanici = new javax.swing.JTextField();
        btn_giris = new javax.swing.JButton();
        btn_iptal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GİRİŞ");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "GİRİŞ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Şifre");

        btn_giris.setIcon(new javax.swing.ImageIcon("C:\\Users\\Önder\\Documents\\NetBeansProjects\\project Image\\login1.png")); // NOI18N
        btn_giris.setText("Giriş");
        btn_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });

        btn_iptal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Önder\\Documents\\NetBeansProjects\\project Image\\cancel1.png")); // NOI18N
        btn_iptal.setText("İptal");
        btn_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iptalActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Önder\\Documents\\NetBeansProjects\\project Image\\login-page-300x178.png")); // NOI18N

        btn_admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Önder\\Documents\\NetBeansProjects\\project Image\\key.png")); // NOI18N
        btn_admin.setText("Admin Giriş");
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_admin))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_giris)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_iptal))
                            .addComponent(txt_kullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_giris)
                    .addComponent(btn_iptal)
                    .addComponent(btn_admin))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 572, 482);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed
        
         String kullanici=txt_kullanici.getText();//KULLANICI DEĞİŞKENİNE TEXTE GİRİLEN DEĞERİNİ ATIYORUZ
            String sifre=txt_sifre.getText();//SİFRE DEĞİŞKENİNE TEXTE GİRİLEN DEĞERİNİ ATIYORUZ
            
             try {
                    
                if (kullanici.equals("") || sifre.equals("")) {//KULLANICI VEYA SİFRE BOŞ İSE

                    JOptionPane.showMessageDialog(this, "Lütfen Boş Alanları Doldurunuz!");

                } else { //DEĞİLSE           
                    Class.forName("com.mysql.jdbc.Driver");

                    Connection con = null;
                    Statement st = null;
                    ResultSet rs = null;//BAĞLANTI İÇİN GEREKLİ ALANLARA NULL DEĞERİ ATIYORUZ
                    
                    con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrenci_kayit?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
                    //ÖĞRENCİ DATABASESİNE BAĞLANIYORUZ
                    st = con.createStatement();
                    
                    rs = st.executeQuery("select * from ogrenci where ogrenci_id ='"+kullanici+"' and sifre='"+sifre+"'");
                    
                   
                    if(rs.last()){
                         k_id = rs.getString("ogrenci_id");
                        
                         
                      ogrpanel object = new ogrpanel();
                            object.setVisible(true);
                            this.setVisible(false);
                        
//                        
                        
                    }
                    else {//DEĞİLSE
                        JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Parola Hatalı! "); 
                        }
                        }
            
                    } catch (ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
            }
         
    }//GEN-LAST:event_btn_girisActionPerformed

    private void btn_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iptalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_iptalActionPerformed

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
      
        
        
        String kullanici=txt_kullanici.getText();//KULLANICI DEĞİŞKENİNE TEXTE GİRİLEN DEĞERİNİ ATIYORUZ
            String sifre=txt_sifre.getText();//SİFRE DEĞİŞKENİNE TEXTE GİRİLEN DEĞERİNİ ATIYORUZ
            
             try {
                    
                if (kullanici.equals("") || sifre.equals("")) {//KULLANICI VEYA SİFRE BOŞ İSE

                    JOptionPane.showMessageDialog(this, "Lütfen Boş Alanları Doldurunuz!");

                } else { //DEĞİLSE           
                    Class.forName("com.mysql.jdbc.Driver");

                    Connection con = null;
                    Statement st = null;
                    ResultSet rs = null;//BAĞLANTI İÇİN GEREKLİ ALANLARA NULL DEĞERİ ATIYORUZ
                    
                    con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrenci_kayit?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
                    //ÖĞRENCİ DATABASESİNE BAĞLANIYORUZ
                    st = con.createStatement();
                    
                    rs = st.executeQuery("select * from danisman where danisman_id ='"+kullanici+"' and sifre='"+sifre+"'");
                    
                    if(rs.last()){
                        
                      Panel object = new Panel();
                            object.setVisible(true);
                            this.setVisible(false);
                        
//                        
                        
                    }
                    else {//DEĞİLSE
                        JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Parola Hatalı! "); 
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
             }
            
            } catch (ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
            }
        
    }//GEN-LAST:event_btn_adminActionPerformed

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
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_giris;
    private javax.swing.JButton btn_iptal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_kullanici;
    private javax.swing.JPasswordField txt_sifre;
    // End of variables declaration//GEN-END:variables
}
