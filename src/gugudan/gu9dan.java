package gugudan;

import java.util.Scanner;
import java.util.stream.IntStream;

public class gu9dan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        IntStream gugudan = IntStream.range(2,10);
        gugudan.forEach(n-> System.out.println(n*num));

    }
}
