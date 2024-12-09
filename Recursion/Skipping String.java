public class SkipString {

	public static void main(String[] args) {
		String str = skip("abbscdapplekiller");
		System.out.println(str);
	}

	private static String skip(String up) {
		if(up.isEmpty()) {
			return "";
		}
		
		if(up.startsWith("apple")) {
			return skip(up.substring(5));
		}else {
			return up.charAt(0) + skip(up.substring(1));
		}
	}

}
