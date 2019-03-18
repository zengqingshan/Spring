package cn.com.wscr.data.controller.pipeStreamTest;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
    public static void main(String[] arg) {

        try {
            WriteDate writeDate = new WriteDate();
            ReadDate readDate = new ReadDate();

            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            pipedOutputStream.connect(pipedInputStream);

            ThreadRead threadRead = new ThreadRead(readDate, pipedInputStream);
            threadRead.start();
            threadRead.join();
            threadRead.isAlive();
            Thread.sleep(2000);

            ThreaWrite threaWrite = new ThreaWrite(writeDate, pipedOutputStream);
            threaWrite.start();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
