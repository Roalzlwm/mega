package chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class quiz {
    public static void main(String[] args) {

        List<IntStream> numList = new ArrayList();
        IntStream num = new Random().ints(5,-1000,1000);
        numList.add(num);
        numList.forEach(n-> System.out.println(numList));


    }
}
