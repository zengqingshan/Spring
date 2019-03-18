package cn.com.wscr.data.controller.test;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<500;i++){
            System.out.println("&&&&&&&&&&&&&"+(i+1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
