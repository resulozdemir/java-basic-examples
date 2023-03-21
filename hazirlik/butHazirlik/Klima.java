package hazirlik.butHazirlik;

public class Klima {
    private boolean guc;
    private double sicaklik;

    public Klima(){
        this.guc = false;
        this.sicaklik = 24.0;
    }

    public void klimaAc(){
        if(!this.guc){
            this.guc = true;
        }
    }

    public void klimaKapat(){
        if(this.guc){
            this.guc=false;
        }
    }

    public void sicaklikAyarla(double sicaklik){
        this.sicaklik = sicaklik;
    }

    public void sicaklikGoster(){
        System.out.println("Sicaklik : " + this.sicaklik);
    }

}
