package cn.com.wscr.data.controller.test;

public class ThreadRunnableDemo {
    public static void main(String[] arg) {
//        for (int i = 10; i > 0; i--) {
//            ThreadRunnable threadRunnable = new ThreadRunnable();
//            Thread td = new Thread(threadRunnable, i + "");
//            td.start();
//        }
//        for (int j = 0; j < 10; j++) {
//            ThreadTest tt = new ThreadTest();
//            tt.start(j + "");
//        }
        testHoldLock();
    }

    public static  void testHoldLock(){
        final Object object=new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread" + Thread.currentThread().getName() + ":run");
                synchronized (object){
                    System.out.println("Thread" + Thread.currentThread().getName() + "is"+ Thread.holdsLock(object));
                }
            }
        },"线程1").start();
    }
}

class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread" + Thread.currentThread().getName() + ":run");
    }
}

class ThreadTest extends Thread {
    private Thread t;

    @Override
    public void run() {
        System.out.println("***Thread" + Thread.currentThread().getName() + ":run");
    }

    public void start(String name) {
        if (null == t) {
            t = new Thread(this, name);
            t.setPriority(7);
            t.setDaemon(true);
            t.start();
        }

    }
}
