package chapter13.lolPro;

import java.util.*;

public class MyChamp {
//    HashMap position = new HashMap();
    Set top = new HashSet();
    Set jungle = new HashSet();
    Set mid = new HashSet();
    Set oneDeal = new HashSet();
    Set support = new HashSet();


    void showMyChamp(){
        System.out.println("------MY CHAMPION------");
        System.out.println("top : "+top);
        System.out.println("jungle : "+jungle);
        System.out.println("mid : "+mid);
        System.out.println("oneDeal : "+oneDeal);
        System.out.println("support : "+support);
        System.out.println("-----------------------");
    }

    void inputMyChamp(){
        System.out.print("your champion name : ");
        Scanner sc = new Scanner(System.in);
        String myChampN = sc.nextLine();
        System.out.println("--------POSITION--------");
        System.out.println("1. top");
        System.out.println("2. jungle");
        System.out.println("3. mid");
        System.out.println("4. oneDeal");
        System.out.println("5. support");
        System.out.println("------------------------");
        System.out.print("your champion position : ");
        Scanner sc2 = new Scanner(System.in);
        int myChampP = sc2.nextInt();

        if(myChampP == 1){
            top.add(myChampN);
        }
        else if(myChampP == 2){
            jungle.add(myChampN);
        }
        else if(myChampP == 3){
            mid.add(myChampN);
        }
        else if(myChampP == 4){
            oneDeal.add(myChampN);
        }
        else if(myChampP == 5){
            support.add(myChampN);
        }
        else System.out.println("No position.");

        System.out.println(" ");
        showMyChamp();
    }

}
