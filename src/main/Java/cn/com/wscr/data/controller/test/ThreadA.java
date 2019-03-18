package cn.com.wscr.data.controller.test;

public class ThreadA extends Thread {
    private MyList myList;

    public ThreadA(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (myList) {
                myList.add();
                System.out.println("添加了" + (i + 1) + "个元素");
                if (i == 4) {
                    myList.notify();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
