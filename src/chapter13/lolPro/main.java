package chapter13.lolPro;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        MyChamp mc = new MyChamp();

        for (;;){
            System.out.println("---------MAIN----------");
            System.out.println("1. Show my champion");
            System.out.println("2. Register");
            System.out.println("3. EXIT");
            System.out.println("-----------------------");
            System.out.print("Please enter a number : ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            if (a == 1){
                mc.showMyChamp();
            }

            else if (a == 2){
                mc.inputMyChamp();
            }

            else if (a == 3) break;

            else System.out.println("Re-enter the number.");
        }
    }
}
