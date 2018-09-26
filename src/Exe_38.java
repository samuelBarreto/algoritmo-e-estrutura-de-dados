public class Exe_38 {

	public static void main(String[] args) {
		int vetor[] = {9,2,3,4,1,2,3,1,-1,0};
	
		int flu = 1000;
		
		System.out.println("recursiivo: "+ buscaUltimoIndiceRecursiva(vetor,0,flu));
		System.out.println("n-recursivo: "+ buscaUltimoIndice(vetor,flu));
	}
	
	private static int buscaUltimoIndiceRecursiva(int vetor[], int posicao, int valor) {
		int k1 = -1, k2=-1;
		
		if ((posicao<=vetor.length-1) && (valor == vetor[posicao])) {
			k1 = posicao;
		}
		
		if ((posicao<=vetor.length-1) ) {
			 k2 = buscaUltimoIndiceRecursiva(vetor, ++posicao, valor);
			 if (k1>k2) 
				 return k1;
			 else 
				 return k2;
		}
		return -1;
	}
	
	private static int buscaUltimoIndice(int vetor[], int valor) {
		
		int posicao = -1;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]==valor) {
				posicao = i;
			}
		}
		
		return posicao;
	}
	
}
