package array;

import java.util.Scanner;

public class chap01 {
    public static void main(String[] args) {

//        //Java 시작
//        int[] students;
//        //C언어 시작
//        int teachers [] = null;

        //컴파일 단계 문법 오류
//        int b = 3.14;

        //런타임 단계 실행 오류
//        Scanner sc = new Scanner(System.in);
//        sc.nextInt();

        //컨텍스트(문맥) 단계 오류


        // 0번째 ~ 4번째 -> 프로그래밍의 시작은 0번부터!
        // 현재 모든 배열 인덱스는 0으로 초기화
        int[] students = new int[5];

        students[0] = 100;
        students[4] = 10;

        String a = null;
        String b = " ";

        String[] baskinRobins = {"choco","mint","strawberry"};
        System.out.println(baskinRobins[1]);


    }
}
