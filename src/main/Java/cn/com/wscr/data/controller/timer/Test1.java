package cn.com.wscr.data.controller.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {
    public static void main(String[] arg) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 15);
        Date runDate = calendar.getTime();
        Mytask mytask = new Mytask();
        Timer timer = new Timer(true);
        timer.schedule(mytask,runDate);
//        timer.schedule(mytask,5000);
//        try {
//            while (true) {
//                Thread.sleep(4000);
//                Timer timer = new Timer(true);
//                timer.schedule(mytask, 1000);
//                Thread.sleep(4000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
