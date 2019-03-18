package cn.com.wscr.data.controller.test;

public class CountOperate2 implements Runnable {
    public CountOperate2(){
        System.out.println("11111="+Thread.currentThread().getName());
        System.out.println("22222="+this);

    }
    @Override
    public void run() {

    }
}
