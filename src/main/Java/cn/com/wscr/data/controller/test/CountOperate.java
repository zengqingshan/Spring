package cn.com.wscr.data.controller.test;

public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("11111="+Thread.currentThread().getName());
        System.out.println("22222="+this.getName());

    }

    @Override
    public void run() {
        System.out.println("33333="+Thread.currentThread().getName());
        System.out.println("44444="+this.getName());
    }
}
