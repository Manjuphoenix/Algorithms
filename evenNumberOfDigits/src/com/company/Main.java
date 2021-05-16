import java.util.*;

class Solution{
    public int findNumbers(int[] nums){
        String s = "";
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]<10){
                continue;
            }
            if(nums[i] >= 10 && nums[i] < 100){
//                s = String.valueOf(nums[i]);
                count++;

            }
            if(nums[i] >= 1000 && nums[i] < 10000){
//                s = String.valueOf(nums[i]);
                count++;
            }
            if(nums[i] >= 100000 && nums[i] <= 1000000){
//                s = String.valueOf(nums[i]);
                count++;
            }
        }
        return  count;
    }
}

 public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] nums = new int[number];
        for(int i = 0; i < number; i++){
            nums[i] = in.nextInt();
        }
        int result = s.findNumbers(nums);
        System.out.println(result);
    }
}
