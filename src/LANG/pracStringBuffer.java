package LANG;

/**
 * Created by huangyazhou on 2016/8/29.
 */
public class pracStringBuffer {
    public  static void main(String[] strings){
        try{
            StringBuffer stringBuffer=new StringBuffer();
            stringBuffer.append("hello world!afasdfasdfasdfadf\n");
            System.out.println("stringBuffer.capacity :"+stringBuffer.capacity()+"\nstringBuffer.codePointAt(1): "+stringBuffer.deleteCharAt(4));
            stringBuffer.ensureCapacity(256);
            System.out.println("stringBuffer.capacity :"+stringBuffer.capacity()+"\n"+stringBuffer.indexOf("r"));
            stringBuffer.insert(5,"haha");
            System.out.println("stringBuffer:"+stringBuffer.reverse());
            System.out.println("stringBuffer.length():"+stringBuffer.length());
            stringBuffer.setLength(10);
            System.out.println("stringBuffer:"+stringBuffer);
            stringBuffer.replace(0,stringBuffer.length(),"hello world!");
            System.out.println("stringBuffer:"+stringBuffer);

        }catch (Exception e){
            System.out.println(e);
        }


    }
}
