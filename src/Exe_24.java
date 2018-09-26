
public class Exe_24 {

	public static void main(String[] args) {

		System.out.println(""+ primo(7));
		
	}
	
	private static boolean primo(int n) {
		if (isPrimo(n,1)>2) {
			return false;
		}
		else {
			return true;
		}
	}
	
	private static int isPrimo(int n, int divisor) {
		
		if (divisor==n) {
			return 1;
		}
		else if (n%divisor==0) {
			return 1 + isPrimo(n,divisor+1);
		}
		else {
			return 0 + isPrimo(n,divisor+1);
		}
	}
}
