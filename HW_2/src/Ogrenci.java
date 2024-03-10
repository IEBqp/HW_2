public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili = 1973;
    private int bolumKodu = 104;
    private String girisSirasi = "001";
    private String ogrNo;
    private double gano;
    public Ogrenci(String ad, String bolum) {
        //İsimler ve default değerler ile öğrenci oluşturuyor
        this(ad,bolum,0.0,"001",1973);
        /*
        Sadece this.ad ve this.bolum kullanarak atasam da şuan kullandığım default değerleri sahayesinde
        aynı sonuca ulaşırdım fakat ödev dosyasında this kullanmamız vurgulanmıştı.
         */

    }
    public Ogrenci(Ogrenci ogrenci) {
        throw new IllegalArgumentException("Burada ne yapmamız istendiği ödev açıklamasında belirtilmedi.");
    }
    public Ogrenci(String ad, String bolum, double gano, String girisSirasi, int girisYili) {
        //Gerekli değerler ile öğrenci oluşturuyor
        this.ad = ad;
        this.bolum = bolum;
        this.girisSirasi = girisSirasi;
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Girilen Gano Değeri 0-4 Aralığında değildir!");
        }
        this.gano = gano;
        this.girisYili = girisYili;
    }
    public Ogrenci() {
        //null değerleri ve default giriş sırası vb ile öğrenci oluşturuyor.
        //Ödevin açıklandığı dosyadaki çıktıyla aynı olması ve bu constructorun normalde
        //ne yapması gerektiği açıklanmadığı için böyle bıraktım.
    }
    public double harcHesapla(int dersSayisi) {
        //240 sayısı ödevde belirtilmemişti, çıktı aynı olacak şekilde tamamen rastgele.
        return dersSayisi * 240;
    }
    public double harcHesapla(int dersSayisi, double uzatilanYil) {
        //Sayılar ödevde belirtilmemişti, tekrardan çıktı aynı olacak şekilde tamamen rastgele.
        return dersSayisi *240 + uzatilanYil*240;
    }
    public String ogrenciNoOlustur() {
        this.ogrNo = ""+this.girisYili+this.bolumKodu+this.girisSirasi;
        return this.ogrNo;
    }
    public String getAd() {
        return this.ad;
    }
    public String getBolum() {
        return this.bolum;
    }
    public double getGano() {
        return this.gano;
    }

    //Kullanılmayan ama ödev bizden istiyor gibi duran methodlar.
    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getGirisYili() {
        return girisYili;
    }
    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }
    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }
}