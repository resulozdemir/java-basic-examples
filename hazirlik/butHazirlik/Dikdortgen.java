package hazirlik.butHazirlik;

public class Dikdortgen extends Sekil{
    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(String sekilIsmi, String sekilRengi, double uzunKenar, double kisaKenar){
        super(sekilIsmi,sekilRengi);
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double alan(){
        return (kisaKenar * uzunKenar);
    }

    public double cevre(){
        return (kisaKenar+uzunKenar)*2;
    }
}
