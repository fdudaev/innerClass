import javax.sound.sampled.AudioPermission;
import java.util.Scanner;
import java.util.zip.Adler32;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button myB = new Button("Print");

    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
       // myB.setOnClickListener(new ClickListener()); // local inner class
        myB.setOnClickListener(new Button.OnClickListener() { // Anonymous inner class
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }
private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    myB.onClick();
            }
        }




/*        GearBox Audi = new GearBox(7); // new object Audi is created from main GearBox class
*//*        GearBox.Gear fist = Audi.new Gear(1, 15.4); // Gear is inner class for GearBox class
        System.out.println(fist.driveSpeed(1000));*//*

        Audi.operateClutch(true);
        Audi.changeGear(1);
        Audi.operateClutch(false);
        System.out.println(Audi.wheelsSpeed(1000));
        Audi.changeGear(2);
        System.out.println(Audi.wheelsSpeed(3000));
        Audi.operateClutch(true);
        Audi.changeGear(3);
        Audi.operateClutch(false);
        System.out.println(Audi.wheelsSpeed(6000));*/


    }
}