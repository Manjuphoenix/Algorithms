import java.util.Scanner;

class MergeSort
{
    void merge(int nums[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (int i=0; i<n1; ++i)
            L[i] = nums[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = nums[m + 1+ j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                nums[k] = L[i];
                i++;
            }
            else
            {
                nums[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            nums[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            nums[k] = R[j];
            j++;
            k++;
        }
    }
    // Main function that sorts nums[l..r] using
    // merge()
    void sort(int nums[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(nums, l, m);
            sort(nums , m+1, r);

            // Merge the sorted halves
            merge(nums, l, m, r);
        }
    }

    /* A utility function to print numsay of size n */
    static void printnumsay(int nums[])
    {
        int n = nums.length;
        for (int i=0; i<n; ++i)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
    // Driver method
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Solution s = new Solution();
        int number = in.nextInt();
        int nums[] = new int[number];
        for (int i = 0; i < number; i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Given numsay");
        printnumsay(nums);
        s.sortedSquares(nums);
        System.out.println("\nSorted numsay");
        printnumsay(nums);
    }
}

class Solution{
    public int[] sortedSquares(int[] nums) {
        MergeSort ob = new MergeSort();
        for (int i =0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i]* nums[i]);
        }
        ob.sort(nums, 0, nums.length-1);
        return nums;
    }
}