package cn.com.wscr.data.controller.test;

import java.util.HashMap;

public class HashCode {
    public static void main(String[] arg){
        //1.String 的hashcode
       /* String a="sss";
        char[] value=a.toCharArray();
        System.out.println("String hashCod="+a.hashCode());

        int h=0;
        for (int i=0;i<a.length();i++){
            h = 31 * h + value[i];
        }
        System.out.println("*** hashCod="+h);*/
        //2.
        HashMap hashMap=new HashMap<>();
        hashMap.put("name","zhangshan");
        hashMap.size();
        hashMap.entrySet();
        hashMap.keySet();
        hashMap.hashCode();
        hashMap.toString();
        //
        String b="2323";
        b.intern();
    }
}
