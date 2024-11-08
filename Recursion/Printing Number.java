public class PrintingNumber {

	public static void main(String[] args) {
		print(5);
	}

	private static void print(int i) {
		if(i==1) {
			System.out.println(i);
			return;
		}
		print(i-1);
		System.out.println(i);
		
	}

}
