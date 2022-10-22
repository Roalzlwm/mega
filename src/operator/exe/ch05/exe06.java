package operator.exe.ch05;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5-i; j > 0; j--) {
//                System.out.print(" ");
//            }
//
//            for (int e = 1; e <= i*2-1; e++) {
//                System.out.print("*");
//            }
//
//            System.out.println("");
//        }

        // 샘 답안

        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int left = mid;
        int right = mid;

        for (int i = 0; i < mid-1; i++) {
            for (int j = 0; j < mid*2+1; j++) {
                if(left<=j && j <= right) System.out.print("*");
                else System.out.print(" ");
            }
            left--;
            right++;
            System.out.println("");
        }


    }
}
