package UTIL;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by huangyazhou on 2016/10/20.
 */
public class pracCollection {
    private final int ListNum=100;
    public static void main(String[] strings){
        pracCollection pracCollection=new pracCollection();
        List list= pracCollection.intList();
        System.out.println("list :"+list.toString());
        Collections.sort(list);
        System.out.println("list :"+list.toString());
        System.out.println(Collections.binarySearch(list,-111111));
    }

    public List intList(){

        List list=new ArrayList(ListNum);
        Random random=new Random();

        for (int i=0;i<ListNum;i++){
//            long set=(i+7)%13+1;
            long set =new BigDecimal(i).divide(new BigDecimal(13),4,BigDecimal.ROUND_HALF_DOWN).movePointRight(4).longValue();
            System.out.println("set :"+set);
            random.setSeed(set);
            list.add(random.nextInt());
        }
        return list;
    }
}
