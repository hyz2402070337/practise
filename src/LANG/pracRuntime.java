package LANG;

/**
 * Created by huangyazhou on 2016/8/29.
 */
public class pracRuntime {
    public static void   main(String[] strings){
        Runtime runtime=Runtime.getRuntime();
        System.out.println( "runtime.availableProcessors: "+runtime.availableProcessors()+" runtime.maxMemory() :"+runtime.maxMemory()+" runtime.totalMemory():"+runtime.totalMemory());
    }

}
