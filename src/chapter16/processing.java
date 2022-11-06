package chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class processing {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList();
        nameList.add("kim xx");
        nameList.add("kim yy");
        nameList.add("lee yy");
        nameList.add("park yy");
        nameList.add("park xx");

        // 1. 스트림 생성
        Stream<String> nameStream = nameList.stream();

        // 2. 스트림 가공 (가공하면 바로 결과가 나와야 함 -> 스트림은 일회성)
        nameStream.filter(name->name.contains("kim")).forEach(name-> System.out.println(name));


        //                                             이미 출력값을 보여줬기 때문에 IntStream ist = 생략
        IntStream.range(1,101).filter(num->num%5==0).forEach(num-> System.out.println(num));


    }
}
