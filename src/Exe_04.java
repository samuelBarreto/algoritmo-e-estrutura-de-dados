
public class Exe_04 {

	public static void main(String[] args) {
		char vetor[];
		vetor = new char[26];
		int i = 0;
		
		// preenchendo o vetor de A a Z
		for (char c = 'A'; c <= 'Z'; c++) {
			vetor[i] = c;
			i++;
		}

		// realizando a troca A<->B, C<->D, ...
		char auxiliar;
		for (int j = 0; j < vetor.length; j=j+2) {
			auxiliar = vetor[j];
			vetor[j] = vetor[j+1];
			vetor[j+1] = auxiliar;
		}

		// imprimindo resultado
		for (int j = 0; j < vetor.length; j++) {
			System.out.println(vetor[j]);
		}
	}
}
