public class Exe_39 {

	public static void main(String[] args) {
		int vetor[] = {9,2,3,4,1,2,3,1,-1,0};
	
		int flu = 99;
		
		System.out.println("recursiivo: "+ buscaPrimeiroIndiceRecursiva(vetor,1,flu));
		System.out.println("recursivo: "+ buscaPrimeiroIndice(vetor,flu));
	}
	
	private static int buscaPrimeiroIndiceRecursiva(int vetor[], int posicao, int valor) {
		
		if ((posicao<=vetor.length-1) && (valor != vetor[posicao]))
			 return buscaPrimeiroIndiceRecursiva(vetor, posicao = posicao + 2, valor);
		return posicao;
	}
	
	private static int buscaPrimeiroIndice(int vetor[], int valor) {
		
		for (int i = 1; i < vetor.length; i=i+2) {
			if (vetor[i]==valor) {
				return i;
			}
		}
		
		return -1;
	}
	
}
