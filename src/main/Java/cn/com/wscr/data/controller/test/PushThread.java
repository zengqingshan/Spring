package cn.com.wscr.data.controller.test;

public class PushThread extends Thread {
    private Mystack mystack;

    public PushThread(Mystack mystack) {
        this.mystack = mystack;
    }

    @Override
    public void run() {
        super.run();
        mystack.push();
    }
}
