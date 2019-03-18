package cn.com.wscr.data.controller.pipeStreamTest;

import java.io.PipedOutputStream;

public class ThreaWrite extends Thread {
    private WriteDate writeDate;
    private PipedOutputStream out;

    public ThreaWrite(WriteDate writeDate, PipedOutputStream out) {
        this.writeDate = writeDate;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        writeDate.writeMethod(out);
    }
}
