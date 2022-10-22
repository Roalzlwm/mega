package operator.exe.ch06;

import java.util.Scanner;

public class plusexam {
    public static void main(String[] args) {
        // 사용자에게 정수 다섯 개를 입력받고, 첫 번째 큰 수와 두 번째 큰 수 출력


        // 정수 5개 배열 선언
        int[] num = new int[5];

        // 유저한테 입력받는 행위
        Scanner sc = new Scanner(System.in);

        // 정수 n개 입력받는 행위
        for(int i =0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        // bubble sort로 내림차순 정리
        for(int i = 0; i <5 ; i++){
            for(int j = 0; j <5 ; j++){

                if(num[i] > num[j]){
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;

                }

            }
        }

        System.out.println(num[0]);
        System.out.println(num[1]);




    }
}
