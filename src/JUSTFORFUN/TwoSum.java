package JUSTFORFUN;

/**
 * Created by huangyazhou on 2016/10/20.
 */
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {

            int[] arr=new int[2];
            for(int i=0;i<4;i++){
                for(int j=i+1;j<4;j++){
                    if(nums[i]+nums[j]==target){
                        arr[0]=i;
                        arr[1]=j;
                    }

                }
            }
            System.out.println("arr:"+arr[0]+"\t"+arr[1]);
            return arr;
    }
    public static void main(String[] strings){
        TwoSum twoSum=new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target=13;
        twoSum.twoSum(nums,target);
    }
}
