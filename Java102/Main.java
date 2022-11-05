package Java102;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Resul Ozdemir","55533311122","resul@gmail.com");
        Akademisyen a1 = new Akademisyen("Ben","1112226655","deneme@gmail.com","CENG","PROF");
        Calisan m1 = new Memur("eymen","4445556699","deneme2@gmail.com","CENG","09:00-18:00");
        m1.getAdSoyad();
        //calisan sınıfından yeni bir memur uretebiliriz ama memur sınıfına ait metorlara erisemeyiz

        OgretimGorevlisi o1 = new OgretimGorevlisi("ali","4445556633","deneme3@gmail.com","CENG","DOC","1");
        o1.giris();
        o1.derseGir();
        o1.getKapiNo();

    }
}
