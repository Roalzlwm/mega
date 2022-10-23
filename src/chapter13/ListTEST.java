package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ListTEST {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("icecream");
        list.add("chocolate");
        list.add(123);
        for(int i = 0; i < list.size(); i++) System.out.println(list.get(i));

    }
}
