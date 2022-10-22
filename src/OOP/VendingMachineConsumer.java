package OOP;

import java.util.Scanner;

public class VendingMachineConsumer {

    int pocariSweat;
    int coke;
    int cider;
    int welchs;
    int vita500;


    VendingMachineConsumer(){
        this.pocariSweat = 700;
        this.coke = 1000;
        this.cider = 1000;
        this.welchs = 500;
        this.vita500 = 500;
    }

    void showMenu(){
        System.out.println("POCARISWEAT  "+this.pocariSweat);
        System.out.println("COKE  "+this.coke);
        System.out.println("CIDER  "+this.cider);
        System.out.println("WELCHS  "+this.welchs);
        System.out.println("VITA500  "+this.vita500);
    }

    void buy(){
        System.out.print("TRADENAME : ");
        Scanner tradeName = new Scanner(System.in);

    }

}
