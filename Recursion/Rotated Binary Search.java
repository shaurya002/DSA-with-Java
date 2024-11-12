public class RotatedBinarySearch {

	public static void main(String[] args) {
		int arr[] = {19,21,29,2,5,7,10,12};
		int target = 7;
		int s = 0;
		int e = arr.length-1;
		int pivot = pivotSearch(arr, s, e);
		if(arr[pivot] ==target) {
			System.out.println(pivot);
		}
		int firstSearch = binary(arr, s, pivot, target);
		int secondSearch = binary(arr, pivot, e, target);
		if(firstSearch!=-1) {
			System.out.println(firstSearch);
		}else {
			System.out.println(secondSearch);
		}

	}

	private static int binary(int[] arr, int s, int e, int target) {
		if (s > e) {
			return -1;
		}
		int m = s+(e-s)/2;
		if(arr[m]==target) {
			return m;
		}else if(arr[m]>target) {
			return binary(arr, s, m-1, target);
		}else {
			return binary(arr, m+1, e, target);
		}
	}

	private static int pivotSearch(int[] arr, int s, int e) {
		int m = s+(e-s)/2;
		if(arr[m]>arr[m+1]) {
			return m;
		}else if(arr[m]<arr[m-1]) {
			return m-1;
		}else if(arr[s]<arr[m]) {
			return pivotSearch(arr, m+1, e);
		}else {
			return pivotSearch(arr, s, m-1);
		}
	}

}
