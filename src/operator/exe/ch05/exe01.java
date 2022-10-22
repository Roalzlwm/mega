package operator.exe.ch05;

public class exe01 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <=100; i++) {
            int num = i % 5;
            if (num == 0) {
                sum += i;
            }
        }
            System.out.println("5dml qotndml gkqrPsms " + sum);
    }
}
