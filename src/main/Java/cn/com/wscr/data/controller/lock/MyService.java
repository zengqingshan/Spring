package cn.com.wscr.data.controller.lock;

import java.util.concurrent.locks.*;

public class MyService {
    private Lock lock=new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for(int i=0;i<5;i++){
            System.out.println("ThreadName"+Thread.currentThread().getName()+"  "+(""+(i+1)));
        }
        lock.unlock();
    }
}
