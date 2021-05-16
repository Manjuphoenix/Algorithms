import java.util.*;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int high = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
//                System.out.println(i);
//                System.out.println("before increment count:" + count);
                count = 0;
            } else {
                count += 1;
//                System.out.println("After increment: "+ count);
                high = Math.max(high, count);
//                System.out.println("High value" + high);
            }
        }
        return high;
    }
}

class ConsecutiveOnes{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Solution s = new Solution();
        int number = in.nextInt();
        int[] nums = new int[number];
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
//            System.out.println(i);
        }
//        System.out.println("Working");
        int result = s.findMaxConsecutiveOnes(nums);
        System.out.print(result);
    }
}