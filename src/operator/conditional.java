package operator;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        // if => if~else문, if~else if문
        // int 정수
        // double 실수
        // char 문자 하나
        // String 문자 여러개
        // boolean true or false

        // 자료형 boolean값만 들어갈 수 있음
//        if(true){
//            System.out.println("hello");
//        }
//
//
//        int score = 75;
//
//        System.out.println("test has started!");
//
//        if(score > 90){
//            System.out.println("you passed the test!");
//        }
//        System.out.println("test has done!");


//        int score = 75;
//
//        if(score > 80) System.out.println("A!");
//        else if(score > 60) System.out.println("B!");
//        else System.out.println("failed!");


        // 중첩 == nested
//        int math = 90;
//        int eng = 95;
//        int korean = 10;
//
//        if(math > 65){
//            if(eng > 65) System.out.println("Double A");
//                if(korean > 65) System.out.println("triple A");
//                else System.out.println("Double A");
//        }
//        else System.out.println("Only A");

        // 3 - triple a
        // 2 - double a
        // 1 - only a
        // 0 - no human
        int math = 74;
        int eng = 64;
        int kor = 164;

        // 무지성ㅋㅋ
//        if (math >= 65 && eng >= 65 && kor >= 65) System.out.println("triple A");
//        if (math >= 65 && eng >= 65 && kor < 65) System.out.println("double A");
//        if (math >= 65 && eng < 65 && kor >= 65) System.out.println("double A");
//        if (math < 65 && eng >= 65 && kor >= 65) System.out.println("double A");
//        if (math < 65 && eng < 65 && kor >= 65) System.out.println("only A");
//        if (math < 65 && eng >= 65 && kor < 65) System.out.println("only A");
//        if (math >= 65 && eng < 65 && kor < 65) System.out.println("only A");
//        if (math < 65 && eng < 65 && kor < 65) System.out.println("no human");

        // 정석
//        if(math>60){
//            if(eng>60){
//                if(kor>60) System.out.println("triple a");
//                else System.out.println("double a");
//            }
//            else{
//                if(kor>60) System.out.println("double a");
//                else System.out.println("only a");
//            }
//        }
//        else{
//            if(eng>60){
//                if(kor>60) System.out.println("double a");
//                else System.out.println("only a");
//            }
//            else{
//                if(kor>60) System.out.println("only a");
//                else System.out.println("no human");
//            }
//
//        }

        // 샘 답안
//        final int PASS_SCORE = 60;
//
//        int kor = 75;
//        int eng = 55;
//        int math = 85;
//        boolean korPassed = kor > PASS_SCORE;
//        boolean engPassed = eng > PASS_SCORE;
//        boolean mathPassed = math > PASS_SCORE;
//
//        int passedTestNumber = 0;
//        if(korPassed) passedTestNumber++;
//        if(engPassed) passedTestNumber++;
//        if(mathPassed) passedTestNumber++;
//
//        if(passedTestNumber == 3) System.out.println("Triple A");
//        if(passedTestNumber == 2) System.out.println("Double A");
//        if(passedTestNumber == 1) System.out.println("Only A");
//        if(passedTestNumber == 0) System.out.println("no human");

//        int a = 2;
//
//        switch (a){
//
//            case 1:
//                System.out.println("this is 1");
//                break;
//            case 2:
//                System.out.println("this is 2");
//                break;
//            case 3:
//                System.out.println("this is 3");
//                break;
//            case 4:
//                System.out.println("this is 4");
//                break;
//            case 5:
//                System.out.println("this is 5");
//                break;
//            default:
//                System.out.println("there is no number");
//
//        }



//        Scanner sc = new Scanner(System.in);
//        String a = "hello world";
//        // int b = 4;
//        // 기본형은 . 아무것도 안 나옴
//        // 참조형은 . 뒤에 참조에 관련된 명령어들이 나옴
//        int b = sc.nextInt();
//        System.out.println("this is number : "+b);


        System.out.println("Inset your score.");
        Scanner lulu = new Scanner(System.in);
        int score = lulu.nextInt();
        String grade = "";

        switch (score / 10){
            case 9 : grade = "A"; break;
            case 8 : grade = "B"; break;
            case 7 : grade = "C"; break;
            case 6 : grade = "D"; break;
            case 5 : grade = "E"; break;
            default: grade = "no human";
        }
        System.out.println("your score is "+grade);

    }
}
