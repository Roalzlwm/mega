package operator.exe.ch05;

public class exe07 {
    public static void main(String[] args) {

        int total = 0;

        while (true){
            int randomNumber = (int)(Math.random() * 10);
            total++;
            if (randomNumber==6) {
                System.out.println(randomNumber);
                break;
            }
            else System.out.println(randomNumber);
        }
        System.out.println("this total is " +total);

    }
}
