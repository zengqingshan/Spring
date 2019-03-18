package cn.com.wscr.data.controller.jvm;

public class JavaVMStackOOM {
    /**
     * 这个类最好不要用，容易导致电脑假死被迫重启
     */
    private void dontstop(){
        while (true){}
    }
    public void stackLeakByThread(){
        while (true){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    dontstop();
                }
            });
            thread.start();
        }
    }
    public static void main(String[] args) {
        JavaVMStackOOM oom=new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
