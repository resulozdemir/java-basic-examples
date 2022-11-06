package Java102.Ornek1;

import Java102.Ornek1.Akademisyen;

public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    @Override      //override metot bu sekilde belirtilmeli ki daha sonradan rahatca alabilabilsin
    public void giris(){
        System.out.println(this.getAdSoyad() + " akademisyen B kapisindan giris yapti !");
    }

    @Override
    public void derseGir(String saat){
        System.out.println(this.getAdSoyad() + "ogretim gorevlisi derse" + saat + "giris yaptı");
    }
}
