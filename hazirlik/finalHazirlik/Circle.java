package hazirlik.finalHazirlik;

public class Circle implements IShape{
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public void displayArea(){
        System.out.println(PI * radius * radius);
    }

    public void draw(){
        System.out.println("Drawing Circle");
    }


}
