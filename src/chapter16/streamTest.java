package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamTest {
    public static void main(String[] args) {
        String[] arrStr = new String[]{"ice americano","latte","mix coffee"};
        // 스트림은 데이터{배열,컬렉션프레임워크} 가공 문법
        // 배열을 스트림화 하기
        // 1. 스트림 생성
        Stream<String> stream1 = Arrays.stream(arrStr);

        // 2. 스트림 가공
        // stream1.(가공할 함수)

        // 3. 스트림 결과
        stream1.forEach(name-> System.out.println(name));

        List<String> kimbobs = new ArrayList();
        kimbobs.add("normal");
        kimbobs.add("tuna");
        kimbobs.add("bulgogi");

        // 1. 스트림 생성(스트림화)
        Stream<String> kimbobStream = kimbobs.stream();

        // 2. 스트림 가공


        //3. 스트림 결과
        kimbobStream.forEach(kimbobName->System.out.println(kimbobName));


        // 1. 스트림 생성
        Stream<Integer> stream = Stream.iterate(100,n->n+10).limit(10);

        // 2. 스트림 가공

        // 3. 스트림 결과
        stream.forEach(n-> System.out.println(n));


        // IntStream
        IntStream intStream = IntStream.range(1,101);
        intStream.forEach(num-> System.out.println(num));


        // Random 난수
        IntStream intStr = new Random().ints(5);
//        intStr.forEach(n-> System.out.println(n));

        intStr = new Random().ints(5,-100,100);
        intStr.forEach(n-> System.out.println(n));
    }
}
