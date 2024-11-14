import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {19,21,29,2,5,7,10,12};
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void bubble(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
				}
			}
		}
	}

	private static void swap(int arr [], int i, int j) {
		int temp  = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
