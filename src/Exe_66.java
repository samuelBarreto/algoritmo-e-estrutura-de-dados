
public class Exe_66 {

	public static void main(String[] args) {
		double vetor[] = {1,5,7,6,4};
		
		selectSort(vetor);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}
	
	public static void selectSort(double vetor[]){
		int iA, iB, iC;
		double iT;
		
		for(iA = 0; iA < vetor.length - 1; iA++) {
			iC = iA;
			iT = vetor[iA];
			
			for(iB = iA + 1; iB < vetor.length; iB++) {
				if (vetor[iB] > iT) {
					iC = iB;
					iT = vetor[iB];
				}
			}
			vetor[iC] = vetor[iA];
			vetor[iA] = iT;
		}
		
		
	}

}
