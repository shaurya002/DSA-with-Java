public class SumOfDigits {

	public static void main(String[] args) {
		int res = S(1342);
		System.out.println(res);
	}

	private static int S(int i) {
		if(i%10==0) {
			return 0;
		}
		return i%10 + S(i/10);
	}

}
