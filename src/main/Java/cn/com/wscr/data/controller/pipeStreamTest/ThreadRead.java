package cn.com.wscr.data.controller.pipeStreamTest;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ThreadRead extends Thread {
    private ReadDate readDate;
    private PipedInputStream input;

    public ThreadRead(ReadDate readDate, PipedInputStream input) {
        this.readDate = readDate;
        this.input = input;
    }

    @Override
    public void run() {
        super.run();
        readDate.readMethod(input);
    }
}
