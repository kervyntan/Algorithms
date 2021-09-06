import java.util.*;

public class BinarySearch {
    
    public int binarySearch (int[] nums, int key) {
        Arrays.sort(nums);
        
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2; // middle index
            if (nums[mid] == key) return mid;
            
            if (key < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            }
            
            return -1;
        }
        
    
    public static void main(String args[]) {
        BinarySearch bs = new BinarySearch();
        int[] result = {1,2,3,4,5};
        
        int keyIndex =  bs.binarySearch(result, 5);
        
        System.out.println(keyIndex);
    }
}