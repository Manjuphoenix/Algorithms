import java.util.*;

class Solution {
    public int[] duplicateZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
           if (nums[i] == 0){
               nums[i+1] = 0;
               nums[i] = nums[i+1];
           }
        }
        return nums;
    }
}

class main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] nums = new int[number];
        for (int i = 0; i < number; i++) {
            nums[i] = in.nextInt();
        }
        int[] arr = s.duplicateZeros(nums);
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}