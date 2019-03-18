package cn.com.wscr.data.controller.timer;

import java.util.Date;
import java.util.TimerTask;

public class Mytask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了，时间为：" + new Date());
    }
}
