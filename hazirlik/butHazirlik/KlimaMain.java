package hazirlik.butHazirlik;

public class KlimaMain {
    public static void main(String[] args) {
        Klima k1 = new Klima();
        k1.klimaAc();
        //k1.sicaklikAyarla(18.0);
        k1.sicaklikGoster();
        k1.klimaKapat();
    }
}
