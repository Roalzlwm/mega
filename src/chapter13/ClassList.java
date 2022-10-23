package chapter13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ClassList {
    public static void main(String[] args) {

//        List class1List = new ArrayList();
//        List class2List = new ArrayList();
//        List class3List = new ArrayList();
//        List class4List = new ArrayList();
//
//        class1List.add("a");
//        class1List.add("b");
//        class1List.add("c");
//        class1List.add("d");
//
//        class2List.add("A");
//        class2List.add("B");
//        class2List.add("C");
//        class2List.add("D");
//
//        class3List.add("1");
//        class3List.add("2");
//        class3List.add("3");
//        class3List.add("4");
//
//        class4List.add("6");
//        class4List.add("7");
//        class4List.add("8");
//        class4List.add("9");
//
//
//        System.out.print("class : ");
//        Scanner sc = new Scanner(System.in);
//
//        if (sc.nextInt() == 1) System.out.println(class1List);
//        else if (sc.nextInt() == 2) System.out.println(class2List);
//        else if (sc.nextInt() == 3) System.out.println(class3List);
//        else System.out.println(class4List);

        String class1[] = {"1","2","3","4","5"};
        String class2[] = {"6","7","8","9","10"};
        String class3[] = {"a","b","c","d","e"};
        String class4[] = {"f","g","h","i","j"};

        HashMap school = new HashMap();
        school.put(1,class1);
        school.put(2,class2);
        school.put(3,class3);
        school.put(4,class4);

        String target[] = (String[]) school.get(2);

        for(int i = 0; i < target.length; i++) System.out.println(target[i]);

    }
}
