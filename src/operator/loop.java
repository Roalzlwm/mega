package operator;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // for문

        // start; end; 증감식
//        Scanner sc = new Scanner(System.in);
//        int end = sc.nextInt();
//        for (int i=0; i<end; i++){
//            System.out.println(i);
//        }

//        int sum = 0;
//        for (int i=1; i<100; i++){
//            sum += i;
//        }
//        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        int end = sc.nextInt();
//        int sum = 0;
//        for (int i=0; i<=end; i +=2){
//            sum += i;
//        }
//        System.out.println(sum);


        int a = 0;
        do {
            a++;
            System.out.println(a);
        }while(a < 100);

    }
}
