import java.util.*;

class Solution {
    public void duplicateZeros(int[] nums) {
        int dupzero = 0;
        int len = nums.length - 1;
        for (int i = 0; i < nums.length - dupzero; i++) {
            System.out.println("i" +i + "\t" + "len" + len);
            System.out.println("Nums[i]" + nums[i]);
           if (nums[i] == 0){
               dupzero++;
               System.out.println("Dupllicate" + dupzero);
               if (nums[len] == len-dupzero){
                   nums[len] = 0;
                   len = len -1;
                   break;
               }
           }
        }
        for (int i = 0; i < nums.length - dupzero; i++){
            System.out.println("Nums" + nums[i]);
        }
        int last = len - dupzero;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (nums[i] == 0) {
                nums[i + dupzero] = 0;
                dupzero--;
                nums[i + dupzero] = 0;
            } else {
                nums[i + dupzero] = nums[i];
            }
        }
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
        s.duplicateZeros(nums);
//        for (int i = 0; i < number; i++) {
//            System.out.print(arr[i] + "\t");
//        }
    }
}