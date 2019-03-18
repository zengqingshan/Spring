package cn.com.wscr.data.controller.test;

public class ThreadB extends Thread {
    private MyList myList;

    public ThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        synchronized (myList){
            try {
                myList.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (myList.size() == 5) {
                System.out.println("==5了 b要退出了");
            }
        }

    }
}
