package NIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by huangyazhou on 2016/10/20.
 */
public class pracFileChannel {

    private final long taskNum=100000000l;
    public void fileChannelWrite() throws IOException {
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream =new FileOutputStream(new File("D:\\123\\1111111.txt"));
            FileChannel fileChannel= fileOutputStream.getChannel();
            for (int i=0;i<taskNum;i++){
                fileChannel.write(ByteBuffer.wrap(("第"+i+"次写入\n").getBytes()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileOutputStream.close();
        }
    }
    public void fileWrite() throws IOException {
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream =new FileOutputStream(new File("D:\\123\\2222222.txt"));
            for (int i=0;i<taskNum;i++){
                fileOutputStream.write(("第"+i+"次写入\n").getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            fileOutputStream.close();
        }

    }
    public static void main(String[] strings) throws IOException {



        pracFileChannel pracFileChannel=new pracFileChannel();

        long startTime1=System.currentTimeMillis();
        pracFileChannel.fileChannelWrite();
        long endTime1=System.currentTimeMillis();
        System.out.println("fileChannelWrite 执行时间 ："+(endTime1-startTime1)/1000F+"s");

        long startTime2=System.currentTimeMillis();
        pracFileChannel.fileWrite();
        long endTime2=System.currentTimeMillis();
        System.out.println("fileWrite 执行时间 ："+(endTime2-startTime2)/1000F+"s");

    }
}
