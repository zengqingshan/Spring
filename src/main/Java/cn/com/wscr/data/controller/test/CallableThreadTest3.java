package cn.com.wscr.data.controller.test;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadTest3 implements Callable<String> {
    public static void main(String[] arg) {
        CallableThreadTest3 ctt3=new CallableThreadTest3();
        FutureTask<String> ft=new FutureTask<>(ctt3);
        new Thread(ft,"相册").start();
        try {
            System.out.println("%%%%" + ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String call() throws Exception {
        int i = 1000;
        System.out.println("call执行" + i);
        System.out.println(Thread.currentThread().getName()+"***");
        return "call的返回值";
    }
}
