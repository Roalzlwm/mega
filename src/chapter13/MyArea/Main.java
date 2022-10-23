package chapter13.MyArea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap stricts = new HashMap();
        List mapoSchools = new ArrayList();
        List junguSchools = new ArrayList();
        List west_doorSchools = new ArrayList();

        stricts.put("mapo",mapoSchools);
        stricts.put("jungu",junguSchools);
        stricts.put("west-door",west_doorSchools);


        HashMap seoulDesign = new HashMap();
        seoulDesign.put(1,8);
        seoulDesign.put(2,6);
        seoulDesign.put(3,7);
        mapoSchools.add(seoulDesign);

        HashMap sangarm = new HashMap();
        sangarm.put(1,5);
        sangarm.put(2,7);
        sangarm.put(3,8);
        mapoSchools.add(sangarm);


        HashMap lira = new HashMap();
        lira.put(1,5);
        lira.put(2,4);
        lira.put(3,4);
        junguSchools.add(lira);

        HashMap hanyang = new HashMap();
        hanyang.put(1,5);
        hanyang.put(2,7);
        hanyang.put(3,8);
        junguSchools.add(hanyang);


        Scanner sc = new Scanner(System.in);
        String findStricts = sc.nextLine();
        List schools = (List) stricts.get(findStricts);
        HashMap targetHM = (HashMap) schools.get(1);
        int targetClass = sc.nextInt();
        System.out.println(targetHM.get(targetClass));







    }
}
