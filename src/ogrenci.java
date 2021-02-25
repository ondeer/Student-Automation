public class ogrenci{
    private String id;
    private int tc;
    private  String ad;
    private String soyad;
    private String dogum_tarihi;
    
    private String cinsiyet;
    private String adres;
    private String bolum; 

    public ogrenci() {
        
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
     public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogum() {
        return dogum_tarihi;
    }

    public void setDogum(String dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

   

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String Bolum) {
        this.bolum = bolum;
    }

    public ogrenci(String id,int tc, String ad, String soyad, String dogum_tarihi, String cinsiyet, String adres, String bolum) {
        this.id = id;
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.dogum_tarihi = dogum_tarihi;
        this.cinsiyet = cinsiyet;
        this.adres = adres;
        this.bolum = bolum;
        
    }
    
    
}