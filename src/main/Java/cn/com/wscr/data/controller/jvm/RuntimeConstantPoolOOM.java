package cn.com.wscr.data.controller.jvm;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {
    /**
     * 不知道这么回事PermSizem设置为10k都无法看到OOM异常抛出
     * 注意：这段代码要在JDK1.6（含1.6）之前的版本运行才会报错
     * @param args
     */
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        int i = 0;
//        while (true) {
//            list.add(String.valueOf(i++).intern());
//        }
        String str1=new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);
        String str2=new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern()==str2);
    }
}
