package cn.com.wscr.data.controller.test;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadTest2 implements Callable<Integer> {
    public static void main(String[] arg) {
        CallableThreadTest2 ctt2=new CallableThreadTest2();
        FutureTask<Integer> ft=new FutureTask<>(ctt2);
        for(int j=0;j<100;j++){
            System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+j);
            if(j==20)
            {
                new Thread(ft,"有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值："+ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() throws Exception {
        int i = 10;
        for (; i > 5; i--) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        return i;
    }
}
