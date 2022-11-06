package chapter14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mainTest {
    public static void main(String[] args) {

        List<Map<Integer,String>> list = new ArrayList();
        Map<Integer,String> koreaHashMap = new HashMap();
        koreaHashMap.put(1,"kim");
        koreaHashMap.put(2,"lee");
        koreaHashMap.put(3,"park");
        list.add(koreaHashMap);

        Map<Integer,String> japanHashMap = new HashMap();
        japanHashMap.put(1,"nakamura");
        japanHashMap.put(2,"abe");
        japanHashMap.put(3,"tanaka");
        list.add(japanHashMap);

        for(int i=0; i<list.size(); i++){
            Map map = list.get(i);
            for(int j=1;j<4;j++){
                System.out.println(map.get(j));
            }
        }

    }
}
