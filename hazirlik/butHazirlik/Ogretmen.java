package hazirlik.butHazirlik;

public class Ogretmen extends Insan implements IYasam{
    private int maas;
    private int deneyim;

    public Ogretmen(){
        Insan.meslek = "Ogretmen";
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getDeneyim() {
        return deneyim;
    }

    public void setDeneyim(int deneyim) {
        this.deneyim = deneyim;
    }

    @Override
    public void ses(){
        System.out.println("Ogretmen");
    }

    public void suIc(){

    }

    public void yemekYe(){

    }

    public void uyu(){

    }
}
