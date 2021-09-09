public class BubbleSort {
    
    public void bubbleSort (int[] nums, int n) {
        boolean isSwapped;
        
        for (int i = 0; i < n - 1; i++ ){
            isSwapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false) break;
        }
    }
    
    
    public static void main(String args[]) {
      BubbleSort bs = new BubbleSort();
      
      int[] testArray = new int[5];
      testArray[0] = 3;
      testArray[1] = 2;
      testArray[2] = 4;
      testArray[3] = 5;
      testArray[4] = 1;
      
      
      for(int x : testArray) {
          System.out.print(x + " ");
      }
      bs.bubbleSort(testArray, 5);
      
      System.out.println("\n");
      
      for(int y : testArray) {
          System.out.print(y + " ");
    
      }      
          
      }
}