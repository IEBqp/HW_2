public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        Ogrenci ogr2=new Ogrenci("Gökhan","Bilgisayar Müh",0.0,"001",1985);
        Ogrenci ogr3=new Ogrenci("Ayşe","Makine Müh",0.0,"001",1985);
        Ogrenci ogr4=new Ogrenci("Elif","Elektrik-Elektronik Müh",1.98,"001",2020);
        System.out.println("Öğrencilerin Bilgileri");
        System.out.println("OGR-1 "+ogr1.getAd()+" "+ogr1.getBolum()+" "+ogr1.ogrenciNoOlustur()+" "+ogr1.getGano());
        System.out.println("OGR-2 "+ogr2.getAd()+" "+ogr2.getBolum()+" "+ogr2.ogrenciNoOlustur()+" "+ogr2.getGano());
        System.out.println("OGR-3 "+ogr3.getAd()+" "+ogr3.getBolum()+" "+ogr3.ogrenciNoOlustur()+" "+ogr3.getGano());
        System.out.println("OGR-4 "+ogr4.getAd()+" "+ogr4.getBolum()+" "+ogr4.ogrenciNoOlustur()+" "+ogr4.getGano());
        System.out.println("3. Öğrencinin ödeyeceği harç: "+ogr3.harcHesapla(2));
        System.out.println("4. Öğrencinin ödeyeceği harç: "+ogr4.harcHesapla(2,2));
    }
}