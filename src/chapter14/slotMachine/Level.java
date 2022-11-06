package chapter14.slotMachine;

import java.util.Scanner;

public class Level {
    int easy = 50;
    int normal = 30;
    int hard = 10;

    void chooseLevel(){
        System.out.println("-------------Level-------------");
        System.out.println("Easy : 50");
        System.out.println("Normal : 30");
        System.out.println("Hard : 10");
        System.out.println("-------------------------------");
        System.out.print("Choose a difficulty level : ");
        Scanner sc = new Scanner(System.in);
        int cl = sc.nextInt();
    }
}
