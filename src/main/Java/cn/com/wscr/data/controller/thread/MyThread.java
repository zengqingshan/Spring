package cn.com.wscr.data.controller.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("****MyThread****");
    }
}
