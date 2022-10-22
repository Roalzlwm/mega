package calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class cal {
    public static void main(String[] args) {

        Date now = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("today Date : "+sf.format(now));
        System.out.println("-----------------------------");



    }
}
