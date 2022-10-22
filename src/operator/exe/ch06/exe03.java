package operator.exe.ch06;

import java.util.Arrays;

public class exe03 {
    public static void main(String[] args) {

        int[] score = {90, 80, 60, 100};
        int totalScore = 0;
        double avgScore = 0;

        for(int n:score) {
            totalScore += n;
        }
        avgScore = totalScore/4;

        System.out.println(totalScore);
        System.out.println(avgScore);

    }
}
