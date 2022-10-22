package OOP;

import java.util.Scanner;

public class CGV {

    Theater theater[] = new Theater[3];

    CGV(){
        theater[0] = new Theater();
        theater[1] = new Theater();
        theater[2] = new Theater();
    }

    void makeSchedule(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < theater.length; i++){
            String titile = sc.nextLine();
            theater[i].makeTitle(titile);
        }
    }

    void makeReservation(int number, int row, int column){
        theater[number].makeReservation(row,column);
    }

    void showAllSchedule(){
        for(int i = 0; i <theater.length; i++) theater[i].showSeats();
    }

}
