public class CheckingSorting {

	public static void main(String[] args) {
		int arr[] = {2,5,7,10,12,19,21,29};
		int n = arr.length;
		int i=0;
		boolean res = sort(arr, i, n);
		System.out.println(res);
	}

	private static boolean sort(int[] arr, int i, int n) {
		if(i==n-1) {
			return true;
		}
		if(arr[i]<arr[i+1]) {
			i++;
			return sort(arr, i, n);
		}else {
			return false;
		}
	}
}
