package OOP;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int a[] = new int[range];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }

        int avg = sum / a.length;

        for(int i = 0; i < a.length; i++){
            if(avg < a[i]) System.out.println(a[i]);
        }

    }
}
