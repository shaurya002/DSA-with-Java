public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {2,5,7,10,12,19,21,29};
		int s = 0;
		int e = arr.length-1;
		int target = 19;
		int idx = BS(s, e, target, arr);
		System.out.println(idx);
	}

	private static int BS(int s, int e, int target, int[] arr) {
		if (s > e) {
			return -1;
		}
		int mid = s+(e-s)/2;
		if(arr[mid]==target) {
			return mid;
		}else if(arr[mid]>target) {
			return BS(s, mid-1, target, arr);
		}else {
			return BS(mid+1, e, target, arr);
		}
	}

}
