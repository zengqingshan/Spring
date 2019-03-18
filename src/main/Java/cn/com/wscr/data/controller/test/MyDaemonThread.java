package cn.com.wscr.data.controller.test;

public class MyDaemonThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            MyThread myThread = new MyThread();
            myThread.setDaemon(true);
            myThread.start();
            while (i < 10) {
                i++;
                System.out.println("#i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
