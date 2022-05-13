package fju.com.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) throws ParseException {
        String id = "ABC-1234";
        String entertime = "07:58";
        String exittime = "11:00";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        //Date d = new Date();
        Date d = null;
        try{
            d=sdf.parse(entertime);
        }catch(Exception e){
            System.out.println("wrong fromat");
        }
        //Date d= sdf.parse(entertime);
        System.out.print(d);
        //long ms = 3*60*60*1000;
        try{
            Date d2 = sdf.parse(exittime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)(d2.getTime()-d.getTime())/1000/60;
            System.out.println(mins);
            if (mins >= 15){
                int fee = 30*(mins/60)+30;
                System.out.println("Fee :"+fee);
            }else{
                int fee = 30*(mins/60);
                System.out.println("Fee :"+fee);
            }


            //int fee = 30*(mins/60);
            //System.out.println("Fee: "+fee);
            //3:14 => 90, 3:15 => 120
            //3:15-3:30 =>105
        }catch(Exception e){
            System.out.println("exit");
        }
        //Date d2 = new Date();
        //d2.setTime(d.getTime()+ms);
        //System.out.println(d2);
        //System.out.println(d2.getTime());
    }
}
