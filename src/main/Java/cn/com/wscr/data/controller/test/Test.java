package cn.com.wscr.data.controller.test;

public class Test {
    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        for (int i = 0; i < 10; i++) {
            PushThread threadA = new PushThread(mystack);
            threadA.start();
        }
        for (int j = 0; j < 15; j++) {
            GetThread threadB = new GetThread(mystack);
            threadB.start();
        }

    }
}


