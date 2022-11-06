package Java102.Ornek1;

public abstract class Calisan {
    private String adSoyad;
    private String telefon;
    private String eposta;

    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris(){
        System.out.println(this.getAdSoyad() + " üniversiteye giris yapti !");
    }

    public void giris(String girisSaati){
        System.out.println(this.getAdSoyad() + " " + girisSaati + " saatinde üniversiteye giris yaptı !");
    }

    public void giris(String girisSaati, String cikisSaati){
        System.out.println(this.getAdSoyad() + " " + girisSaati + " saatinde üniversiteye giris yaptı ve" + cikisSaati + " saatinde universiteden cikis yapti !");
    }

    public void cikis(){
        System.out.println(this.getAdSoyad() + " üniversiteden cikis yapti !");
    }

    public void yemekhane(){
        System.out.println(this.getAdSoyad() + " yemekhaneye girdi !");
    }

    public static void girisYapanlar(Calisan[] loginUser){
        for (Calisan c : loginUser) {
            //c1.giris()
            //a1.giris()
            //m1.giris()
            //o1.giris()
            c.giris();
        }
    }
}
