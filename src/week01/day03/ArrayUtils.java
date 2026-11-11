package week01.day03;
import java.util.Arrays;
import static java.util.Arrays.sort;

public class ArrayUtils {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }

    public static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<=high){
            mid= low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if (arr[mid] < target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] numbers = {45, 12, 89, 33, 67, 21};
        int[] numbers1 = {30, 25, 18, 7, 15, 3};

        System.out.println("Original: " + Arrays.toString(numbers));

        System.out.println("Min: " + findMin(numbers)
                + " | Max: " + findMax(numbers));

        System.out.println("Min: " + findMin(numbers1)
                + " | Max: " + findMax(numbers1));

        reverse(numbers);
        System.out.println("Reversed: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        System.out.println("Binary Search (33): Index "
                + binarySearch(numbers, 33));
    }

}

