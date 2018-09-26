
public class Exe_05 {

	public static void main(String[] args) {
		int vetor[] = {0,1,1,0,3,2,4,4,2,2,4,7,7,7,7,7};
		int capicuas = 0;
	
		for (int i = 1; i < vetor.length-2; i++) {
			if (vetor[i]==vetor[i+1] && vetor[i-1]==vetor[i+2]) {
				capicuas++;
			}
		}
		
		System.out.println(capicuas);
	}
}
