package cn.com.wscr.data.controller.test;

public class GetThread extends Thread {
    private Mystack mystack;

    public GetThread(Mystack mystack) {
        this.mystack = mystack;
    }

    @Override
    public void run() {
        super.run();
        mystack.get();
    }
}
