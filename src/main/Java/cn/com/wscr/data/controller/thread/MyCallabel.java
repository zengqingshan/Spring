package cn.com.wscr.data.controller.thread;

import java.util.concurrent.Callable;

public class MyCallabel implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "MyCallabel==";
    }
}
