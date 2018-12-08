package pms.test;

import java.util.Calendar;

/**
 * Created by Administrator on 2017/2/20.
 */
public class tttest {
    public static void main(String[] args) {
       // System.out.println("error312".substring(0,5).toUpperCase());
        Calendar cal = Calendar.getInstance();
        System.err.println(cal.getTime());
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        System.err.println(cal.getTime());
    }
}
