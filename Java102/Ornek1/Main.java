package Java102.Ornek1;

public class Main {
    public static void main(String[] args) {
        //Calisan c1 = new Calisan("Resul Ozdemir","55533311122","resul@gmail.com");
        //Akademisyen a1 = new Akademisyen("Ben","1112226655","deneme@gmail.com","CENG","PROF");
        Calisan m1 = new Memur("eymen","4445556699","deneme2@gmail.com","CENG","09:00-18:00");
        //m1.getAdSoyad();
        //calisan sınıfından yeni bir memur uretebiliriz ama memur sınıfına ait metorlara erisemeyiz

        OgretimGorevlisi o1 = new OgretimGorevlisi("ali","4445556633","deneme3@gmail.com","CENG","DOC","1");
        //o1.giris();
        //o1.derseGir();
        //o1.getKapiNo();

        //o1.giris("15:00");
        //o1.giris("11:00","18:00");


        //method orverriding (metotlarda gecersiz kilma)
        //c1.giris();
        o1.giris();
        //en alttaki sub sınıftan baslayarak gider method overridinge

        //Calisan[] loginUser = {c1,a1,m1,o1};


        //Asbtraction (soyutlama) nesne uretilmeyecek sınıfların nesne uretımıne kapatılması
        //kalıtım icin kullanılan ve nesne uretmenın mantıksız oldugu classların nesne uretimine kapatılması
        //bir sinifa ait metodun abstract olabilmesi icin o sınıfında abstrack olması lazım
        //abstract sınıftan nesne uretlemez

        o1.derseGir("10:00");
    }
}
