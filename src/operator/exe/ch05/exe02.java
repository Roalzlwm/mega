package operator.exe.ch05;

public class exe02 {
    public static void main(String[] args) {

        int evenSum = 0;
        int oddSum = 0;

        for (int i=1; i<=100; i++) {
            if (i%2 == 0) {
                evenSum += i;
            }
            else oddSum += i;
        }
        System.out.println("Wkrtndml gkqrPsms "+evenSum);
        System.out.println("ghftndml gkqrPsms "+oddSum);

    }
}
