public class InsertionSort {
	
	public void printArray (int[] arr) {
		
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println(" ");
	}
	
	public void sort(int[] arr) {
		int n = arr.length;
		
		//We start from i=1 since the first element is considered "sorted"
		
		for (int i = 1; i < n; i++) { // unsorted part
			int temp = arr[i];
			int j = i - 1; // sorted part
			 
			while (j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j]; // Shifting larger element to temp by 1 position
				j =  j - 1;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main (String[] args) {
		int[] nums = {12,4,5,7,1};
		InsertionSort is = new InsertionSort();
		
		is.printArray(nums);
		
	}

}
