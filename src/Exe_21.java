
public class Exe_21 {

	public static void main(String[] args) {
		System.out.println(fatorial(10));
	}
	
	private static int fatorial(int n) {

		if (n<=1) {
			return 1;
		}
		else {
			return n * fatorial(n-1);
		}
	}
}
