package Java102.MaceraOyunu;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    //Location location = new Location();


    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz");
        System.out.print("Lutfen bir isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + "bu karanlık ve sisli adaya hosgeldin !");
        System.out.println("Burada yasananların hepsi gercek ");

    }

}
