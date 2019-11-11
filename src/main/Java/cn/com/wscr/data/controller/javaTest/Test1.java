package cn.com.wscr.data.controller.javaTest;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            if(StringUtils.equalsIgnoreCase("22",it.next())){
                it.remove();
            }
        }
        System.out.println(String.join(",",list));
    }
}
