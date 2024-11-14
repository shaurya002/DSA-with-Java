import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {19,21,29,2,5,7,10,12};
		ss(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void ss(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int sIdx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[sIdx]>arr[j]) {
					sIdx=j;
				}
			}
			swap(arr,sIdx, i);
		}	
	}

	private static void swap(int[] arr, int sIdx, int currIdx) {
		int temp = arr[sIdx];
		arr[sIdx] = arr[currIdx];
		arr[currIdx] = temp;
		
	}
}
