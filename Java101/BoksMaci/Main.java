package Java101.BoksMaci;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(0,2);

        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);

        if(random == 1){
            Ring ring = new Ring(marc,alex , 90 , 100);
            ring.run();
        }
        else {
            Ring ring = new Ring(alex,marc , 90 , 100);
            ring.run();
        }

    }
}
