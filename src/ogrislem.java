
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ogrislem  {
    
    
     public String girisogr(){
        try {
             Class.forName("com.mysql.jdbc.Driver");

                    Connection con = null;
                    Statement st = null;
                    ResultSet rs1 = null;//BAĞLANTI İÇİN GEREKLİ ALANLARA NULL DEĞERİ ATIYORUZ
                    
                    
                    con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrenci_kayit?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
            String ogrenci = null;
           st =  con.createStatement();
            String sorgu1 = "Select ogrenci_id from ogrenci";
            ResultSet rs2 = st.executeQuery(sorgu1); 
            while(rs2.next()){
              ogrenci = rs2.getString("ogrenci_id");   
                
                
            }
            return ogrenci;
            
            
        } catch (Exception ex) {
            Logger.getLogger(ogrislem.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
    }
    
    
    
    
    
    
    
    
    
    
    public ArrayList<ogrenci> calisanlariGetir(String ogrenci) {
        
        ArrayList<ogrenci> cikti = new ArrayList<ogrenci>();
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrenci_kayit?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
            String sorgu =  "select * from ogrenci INNER JOIN bolum ON ogrenci.bolum_id=bolum.bolum_id where ogrenci_id=?";
             
             PreparedStatement preparedStatement = null;
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1,ogrenci); // sorgumuzdaki 1.? yerine parametre olarak gelen id degeri alınsın.
            ResultSet rs= preparedStatement.executeQuery();
            
        
            while(rs.next()) {
                String id = rs.getString("ogrenci_id");
                int tc = rs.getInt("tc");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String dogum_tarihi = rs.getString("dogum_tarihi");
                
                String cinsiyet = rs.getString("cinsiyet");
                String adres = rs.getString("adres");
                String bolum = rs.getString("bolum_ad");
                
                cikti.add(new ogrenci(id,tc, ad, soyad,dogum_tarihi,cinsiyet,adres,bolum));
         }
            return cikti;         
        } catch (Exception ex) {
            Logger.getLogger(ogrislem.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
