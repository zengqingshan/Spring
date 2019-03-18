package cn.com.wscr.data.controller.pipeStreamTest;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadDate {
    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read:");
            byte[] bytesArray = new byte[300];
            int readLength = input.read(bytesArray);
            while (readLength != -1) {
                String newData = new String(bytesArray, 0, readLength);
                System.out.println(newData);
                readLength = input.read(bytesArray);
            }
            System.out.println("read over");
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
