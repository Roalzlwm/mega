package array;

public class chap02 {
    public static void main(String[] args) {

        int[] lotto = new int[6];

        int idx = 0;

        while (true) {
            // Math.random()*45 = 0~44
            // Math.random()*45 + 1 = 1~45
            int number = (int)(Math.random()*45)+1;

            boolean insert = true;
            for(int i = 0; i <= idx; i++) {
                if(lotto[i] == number) {
                    insert = false;
                    break;
                }
            }

            if(insert) {
                lotto[idx] = number;
                idx++;
            }
            if(idx == 6) break;


        }

        for(int i = 0; i < lotto.length; i++) {
            for(int j = i; j < lotto.length; j++) {
                if(lotto[i] > lotto[j]) {
                    int tmp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = tmp;

                }
            }
        }
        for(int i = 0; i<lotto.length; i++) System.out.println(lotto[i]);
    }
}
