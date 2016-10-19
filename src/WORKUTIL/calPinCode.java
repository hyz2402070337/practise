package WORKUTIL;

import java.math.BigDecimal;

/**
 * Created by huangyazhou on 2016/9/1.
 */
public class calPinCode {
    public static void main(String[] strings){
        BigDecimal pinCode=new BigDecimal(1269);
        System.out.println("库名为："+pinCode.divideAndRemainder(new BigDecimal(1024))[1].divideToIntegralValue(new BigDecimal(64)));
        System.out.println("表名为："+pinCode.divideAndRemainder(new BigDecimal(10))[1]);
    }
}
