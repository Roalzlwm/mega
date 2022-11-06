package chapter15;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaEx7 {
    public static void main(String[] args) {

        Supplier<String> s1 = () ->  "Hong";

        System.out.println(s1.get());

        s1 = () -> "Lee";
        System.out.println(s1.get());

        IntSupplier s2 = () -> (int)(Math.random() * 6) + 1;

        System.out.println("DICE : " + s2.getAsInt());

        DoubleSupplier s3 = () -> Math.random();
        System.out.println("RAMDOM : " + s3.getAsDouble());

    }
}
