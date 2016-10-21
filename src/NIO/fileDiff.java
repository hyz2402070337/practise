package NIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangyazhou on 2016/10/21.
 */
public class fileDiff {
    public static void main(String[] strings) throws IOException {
        File daifu=new File("D:\\123\\daifu.txt");
        File xiaojink=new File("D:\\123\\小金库发奖.txt");

        File diff=new File("D:\\123\\diff.txt");

        BufferedReader fileInputStreamDaifu=null;
        BufferedReader fileInputStreamXiaojink=null;
        BufferedWriter out=null;
        try {
            fileInputStreamDaifu= new BufferedReader(new InputStreamReader(new FileInputStream(daifu),"utf-8"));
            fileInputStreamXiaojink= new BufferedReader(new InputStreamReader(new FileInputStream(xiaojink),"utf-8"));

            out= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(diff),"utf-8"));
            String line1=null;
            String line2=null;
            Map<String,String> mapRead=new HashMap<String, String>(35000);
            while ((line1=fileInputStreamXiaojink.readLine())!=null){
                String[] segments1 = line1.split("\t");
                mapRead.put(segments1[0],line1+"\n");
            }
            while ((line2=fileInputStreamDaifu.readLine())!=null){
                String[] segments2 = line2.split("\t");
                if (null!=mapRead.get(segments2[0])){
                    mapRead.remove(segments2[0]);
                }
            }
            System.out.println("匹配到的数据条数为 ："+mapRead.size());
            for (String key :mapRead.keySet()){
                out.write(mapRead.get(key));
            }
         } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileInputStreamDaifu.close();
            fileInputStreamXiaojink.close();
            out.close();
        }
    }
}
