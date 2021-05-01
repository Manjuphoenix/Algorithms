import java.util.*;

class LinearSearch{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = in.nextInt();
        System.out.print("Enter the element value to be searched:");
        int number = in.nextInt();
        int arr1[] = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i = 0; i<n; i++) {
            arr1[i] = in.nextInt();
        }
        for(int i = 0; i<n ; i++){
            if (number==arr1[i])
                System.out.print("Element found at position:" + i);
        }
    }
}