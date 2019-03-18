package cn.com.wscr.data.controller.lock;

import java.util.Timer;

public class Run {
    public static void main(String[] arg) {
        MyService myService = new MyService();
        MyThread myThread1 = new MyThread(myService);
        MyThread myThread2 = new MyThread(myService);
        MyThread myThread3 = new MyThread(myService);
        MyThread myThread4 = new MyThread(myService);
        MyThread myThread5 = new MyThread(myService);
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        Timer timer=new Timer();
    }
}
