package calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class cal {
    public static void main(String[] args) {

//        Date now = new Date();
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println("today Date : "+sf.format(now));
//        System.out.println("-----------------------------");
//        System.out.println("hello");

        Calendar thatDay = Calendar.getInstance();
        thatDay.set(Calendar.YEAR,2020);
        thatDay.set(Calendar.MONTH,4);
        thatDay.set(Calendar.DATE,1);

        int num = thatDay.get(Calendar.DAY_OF_YEAR);

        Date d = new Date();
        Calendar today = Calendar.getInstance();
        today.setTime(d);
        System.out.println(d);
        int num1 = today.get(Calendar.DAY_OF_YEAR);

        boolean a = today.after(thatDay);

        if(a == true){
            System.out.println(num1 - num);

        }
        else System.out.println("X");




    }
}
