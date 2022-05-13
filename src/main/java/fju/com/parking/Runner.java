package fju.com.parking;

import java.util.Date;

public class Runner {
    public static void main(String[] args){
        String id = "ABC-1234";
        String entertime = "08:00";
        String exittime = "11:00";
        Date d = new Date();
        System.out.print(d);
        long ms = 3*60*60*1000;
        Date d2 = new Date();
        System.out.println(d2);
        System.out.println(d2.getTime());
    }
}
