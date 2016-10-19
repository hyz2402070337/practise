package LANG;

/**
 * Created by huangyazhou on 2016/8/30.
 */
public class pracThread implements Runnable{
    private int count=0;
    public static void main(String[] strings){
        pracThread p=new pracThread();
        Thread p1=new Thread(p);
        Thread p2=new Thread(p);
        p2.start();
//        p1.setDaemon(true);
        Thread.yield();
        p1.start();
        System.out.println("p1.getName():"+p1.getName()+"\tp1.getId():"+p1.getId());
        System.out.println("p2.getName():"+p2.getName()+"\tp2.getId():"+p2.getId());

        System.out.println("p1.getState():"+p1.getState()+"\tp1.getThreadGroup():"+p1.getThreadGroup()+"\tp1.getPriority():"+p1.getPriority());
        System.out.println("p2.getState():"+p2.getState()+"\tp2.getThreadGroup():"+p2.getThreadGroup()+"\tp2.getPriority():"+p2.getPriority());
    }

    @Override
    public void run() {
        System.out.println("hello world !"+count+"");
        count++;
    }
}
