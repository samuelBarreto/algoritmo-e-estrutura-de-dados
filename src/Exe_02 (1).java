
public class Exe_02 {

	public static void main(String[] args) {
		
		int vetor[];
		vetor = new int[100];
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (i%2!=0) {
				vetor[i] = i;
			}
			System.out.println(vetor[i]);	
		}		
		
	}
}
