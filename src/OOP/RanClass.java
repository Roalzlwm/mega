package OOP;

import java.util.Scanner;

public class RanClass {

    int untillNowMax;   // max값 초기화 안 당하게 하기 위함
    int untillNowMin;

    // 1. 배열은 받는다.
    // 2. ...(spread operator)

    void findMax(int ...y) {
        int max = y[0];

        for(int j:y){
            if(max<j) {
                max = j;
                if(untillNowMax < j) untillNowMax = j;
            }
        }
        System.out.println("max : "+max);
    }

    void findMin(int ...y) {
        int min = y[0];

        for(int j:y){
            if(min>j) {
                min = j;
                if(untillNowMin > j) untillNowMin = j;
            }
        }
        System.out.println("min : "+min);
    }

    // 한 번에 엮어보기
    void findMaxMin(int ...y) {
        findMax(y);
        findMin(y);
    }


    // 지금까지 가장 컸던 max 출력
    void showUntil(boolean isMax){
        if(isMax) System.out.println("untillNowMax : "+untillNowMax);
        else System.out.println("untillNowMin : "+untillNowMin);
    }

    void showMath(String cases) {
        if(untillNowMax==0 || untillNowMin == 0) System.out.println("sorry! you need to input numbers!");
        switch (cases){
            case "plus": System.out.println(untillNowMax+untillNowMin); break;
            case "minus": System.out.println(untillNowMax-untillNowMin); break;
            case "multiple": System.out.println(untillNowMax*untillNowMin); break;
            case "divide": System.out.println(untillNowMax/untillNowMin); break;
            default:
                System.out.println("you input wrong order");
                break;
        }

    }


}
