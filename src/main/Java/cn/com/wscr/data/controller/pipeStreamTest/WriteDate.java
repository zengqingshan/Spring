package cn.com.wscr.data.controller.pipeStreamTest;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteDate {
    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
            }
            System.out.println("write over");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
