
public class Exe_03 {

	public static void main(String[] args) {
		char vetor[];
		vetor = new char[26];
		int i = 0;
		
		for (char c = 'A'; c <= 'Z'; c++) {
			vetor[i] = c;
			i++;
		}
		
		for (int j = 0; j < vetor.length; j++) {
			System.out.println(vetor[j]);
		}
	}
}
