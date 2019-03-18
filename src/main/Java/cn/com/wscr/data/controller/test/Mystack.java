package cn.com.wscr.data.controller.test;

import java.util.ArrayList;
import java.util.List;

public class Mystack {
    //假设容器的大小为50，当容器>50时不生产
    private List<String> list = new ArrayList<>();

    synchronized public void push() {
        try {
            while (list.size() < 10) {
                list.add("a");
                System.out.println("生产一个产品" + list.size());
                this.notifyAll();
            }
            System.out.println("容器已满，生产处于等待状态" + list.size());
            this.wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public void get() {
        try {
            while (list.size() > 0) {
                list.remove(0);
                System.out.println("消费一个产品" + list.size());
                this.notifyAll();
            }
            System.out.println("容器已空，消费处于等待状态" + list.size());
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
