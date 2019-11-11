package cn.com.wscr.data.controller.thread;

import javax.ws.rs.core.Feature;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TestThread {
    public static void main(String[] args) {
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("########");
            }
        };
        Thread thread = new MyThread();
        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Callable callable = new MyCallabel();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread3 = new Thread(futureTask);

    }
}
