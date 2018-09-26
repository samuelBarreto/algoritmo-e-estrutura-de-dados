import javax.swing.JOptionPane;

public class Exe_68 {

	public static void main(String[] args) {
		char vetor[] = {'Y','A','B','O','G'};
		char caracBusca = JOptionPane.showInputDialog("Digite o caractere a ser buscado.").charAt(0);
		
		selectSort(vetor);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		System.out.println(buscaChar(vetor, caracBusca, 0, vetor.length - 1));
	}
	
	public static void selectSort(char vetor[]){
		char  iT;
		int iA, iB, iC;
		
		for(iA = 0; iA < vetor.length - 1; iA++) {
			iC = iA;
			iT = vetor[iA];
			
			for(iB = iA+1; iB < vetor.length; iB++) {
				if (vetor[iB] < iT) {
					iC = iB;
					iT = vetor[iB];
				}
			}
			vetor[iC] = vetor[iA];
			vetor[iA] = iT;
		}
	}
	
	public static int buscaChar(char vetor[], char caracBusca, int iMenor, int iMaior) {
		int iMeio = (iMenor+iMaior)/2;
		
		if(vetor[iMeio] != caracBusca) {
			if(vetor[iMeio] > caracBusca) {
				return buscaChar(vetor, caracBusca, iMenor, iMeio - 1);
			        
         }else  {
				return -1;
            
			}
		}
		
		return iMeio;
	}

}
