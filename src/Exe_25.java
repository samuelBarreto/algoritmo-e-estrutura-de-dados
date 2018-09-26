public class Exe_25 {

	public static void main(String[] args) {
		float vetor[] = {1.0f,1.3f,1.5f,0.6f,3.5f,2.8f,4.2f,4.1f,2.8f,1.9f};
	
		System.out.println(""+ buscaIndice(vetor,0,2.8f));
	}
	
	private static int buscaIndice(float vetor[], int posicao, float valor) {
		
		if ((posicao<=vetor.length-1) && (valor != vetor[posicao])) 
			return buscaIndice(vetor, ++posicao, valor);
		return posicao;
	}
}
