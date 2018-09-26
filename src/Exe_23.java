
public class Exe_23 {

	public static void main(String[] args) {
		int vetor[] = {0,1,1,0,3,2,4,4,2,1};
	
		System.out.println(""+ somaVetor(vetor,0));
	}
	
	private static int somaVetor(int vetor[], int posicao) {
		
		if (posicao==vetor.length-1) {
			return vetor[posicao];
		}
		else {
			return vetor[posicao] + somaVetor(vetor,posicao+1);
		}
	}
}
