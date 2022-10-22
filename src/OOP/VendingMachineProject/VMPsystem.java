package OOP.VendingMachineProject;

import java.util.Scanner;

//전지적 관점 객체
public class VMPsystem {

    static int location = 0;
    static int buyerBeverage = 0;
    static int buyerBeverageQuantity = 0;

    private Scanner sc = new Scanner(System.in);
    void initlocate() {this.location = 0;}

    void locate(){
        this.location = sc.nextInt();
    }

    void setBuyerBeverage(){this.buyerBeverage = sc.nextInt();}
    void setBuyerBeverageQuantity(){this.buyerBeverageQuantity = sc.nextInt();}

}
