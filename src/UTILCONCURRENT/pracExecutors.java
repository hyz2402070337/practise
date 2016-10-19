package UTILCONCURRENT;

import java.io.*;
import java.util.concurrent.*;

/**
 * Created by huangyazhou on 2016/10/19.
 */
public class pracExecutors {
    private static final int poolNum=10;
    public static ExecutorService executorService= Executors.newFixedThreadPool(poolNum);
    private static CompletionService<String> pool=new ExecutorCompletionService<String>(executorService);

    public static void main(String[] strings) throws InterruptedException, ExecutionException, FileNotFoundException {



        for (int i=0;i<1000000;i++){
            pool.submit( new calTask(i),"第"+i+"次完成");
        }

        for (int j=0;j<1000000;j++){
            if (null!=pool.take()){
                System.out.println(pool.take().get());
            }
        }
    }
    static class   calTask implements Runnable{

        private int num;

        public calTask(int i) {
            this.num=i;
        }

        @Override
        public void run() {
            FileOutputStream  fileOutputStream=null;
            try {
                fileOutputStream=new FileOutputStream(new File("D:\\123\\12313.txt"));
                fileOutputStream.write(("第"+num+"次完成").getBytes());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {

                }
            }

        }
    }
}
