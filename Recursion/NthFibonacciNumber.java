public static void main(String[] args) {
		int res = fib(7);
		System.out.println(res);
	}

	private static int fib(int i) {
		if(i<2) {
			return i;
		}
		return fib(i-1) + fib(i-2);	
	}

}
