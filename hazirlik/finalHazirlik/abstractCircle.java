package hazirlik.finalHazirlik;

public class abstractCircle extends Shape {
    private final double PI = 3.14;
    private double radius;

    public abstractCircle(double radius){
        this.radius=radius;
    }

    @Override
    public void abstractDraw(){
        System.out.println("Abstract drawing");
    }

    @Override
    public void abstractDisplayArea(){
        System.out.println(PI * radius * radius);
    }
}
