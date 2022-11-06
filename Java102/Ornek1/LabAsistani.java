package Java102.Ornek1;

import Java102.Ornek1.Asistan;

public class LabAsistani extends Asistan {

    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + " laba girdi !");
    }
}
