package cn.com.wscr.data.controller.lock;

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.testMethod();
    }
}
