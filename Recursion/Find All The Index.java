import java.util.ArrayList;

public class FindAllindex {

	public static void main(String[] args) {
		int arr[] = {2,5,7,10,12,19,21,21,29};
		int idx = 0;
		int target = 21;
		findAllArray(arr, target, idx);
		System.out.println((list));

	}
	static ArrayList<Integer> list = new ArrayList<>();
	private static void findAllArray(int[] arr, int target, int idx) {
		if(idx == arr.length) {
			return;
		}
		if(arr[idx]==target) {
			list.add(idx);
		}
		findAllArray(arr, target, idx+1);	
	}

}
