package OOP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Theater {
//    int width;
//    String height;
//    List<String> seatlist = new ArrayList<>();
//    Set<String> seatset = new HashSet<String>(seatlist);
//    List<String> newseatlist = new ArrayList<String>(seatset);
//
//    void Reservation(String height, int width){
//        ShowCheck();
//        seatlist.add(height+width);
//    }
//
//    void ShowCheck(){
//        System.out.println(seatlist);
//    }

    // 쌤 답안
    private String movieTitle;
    private int column;
    private int row;
    private boolean seat[][];

    Theater(){
        this.row = 14;
        this.column = 14;
        this.seat = new boolean[this.row][this.column];
    }

    Theater(int row, int column){
        this.row = row;
        this.column = column;
        this.seat = new boolean[this.row][this.column];
    }


    void makeTitle(String title){
        this.movieTitle = title;
    }

    void makeReservation(int row, int column){
        if((this.row >= row && row >= 0) && (this.column >= column && column >= 0)) seat[row][column] = true;
        else if (seat[row][column] == true) System.out.println("this seat has reservation.");
        else System.out.println("you input a wrong seat.");
    }

    void showSeats(){
        System.out.println("--------screen--------");
        for(int i = 0; i < seat.length; i++){
            for(int j = 0; j < seat[i].length; j++){
                if(seat[i][j] == false) System.out.print("X");
                else System.out.print("O");
            }
            System.out.println();
        }
        System.out.println("--------end--------");
    }

}
