package chapter14.slotMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Machine {
    List<String> slotList = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
    List line1 = new ArrayList();
    List line2 = new ArrayList();
    List line3 = new ArrayList();

    void randomSpin() {
        Random random = new Random();
        int randomIndex = random.nextInt(slotList.size());
        line1.add(slotList.get(randomIndex));
        randomIndex = random.nextInt(slotList.size());
        line1.add(slotList.get(randomIndex));
        randomIndex = random.nextInt(slotList.size());
        line1.add(slotList.get(randomIndex));
        randomIndex = random.nextInt(slotList.size());
        line2.add(slotList.get(randomIndex));
        randomIndex = random.nextInt(slotList.size());
        line2.add(slotList.get(randomIndex));
        randomIndex = random.nextInt(slotList.size());
        line2.add(slotList.get(randomIndex));
        randomIndex = random.nextInt(slotList.size());
        line3.add(slotList.get(randomIndex));
        randomIndex = random.nextInt(slotList.size());
        line3.add(slotList.get(randomIndex));
        randomIndex = random.nextInt(slotList.size());
        line3.add(slotList.get(randomIndex));
    }

    void showMachine() {
        randomSpin();
        System.out.println("-----LUCKY SLOT-----");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println("-------------------");
    }

    void result() {
        for (int i = 0; i < line1.size(); i++) {
            for (int j = 0; j < i; j++) {
                for(int k = 0; k <j; k++) {
                    if (line1.get(i).equals(line1.get(j))) {
                        System.out.println("line1 good");
                    } else if (line2.get(i).equals(line2.get(j))) {
                        System.out.println("line2 good");
                    } else if (line3.get(i).equals(line3.get(j))) {
                        System.out.println("line3 good");
                    } else System.out.println("mang");
                }
            }
        }
    }
}