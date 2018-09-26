
public class Aula1b {

	public static void main(String[] args) {
		System.out.println("pg "+ pg(4));

		System.out.println("pg "+ pg(2,2,20));
	}
	

	/**
	 * método simples de PG, com a razão e a1 constantes fixas.
	 * @param nEsimo
	 * @return
	 */
	private static int pg(int nEsimo) {

		int razao = 2;
		
		if (nEsimo<=1) {
			return 1;
		}
		else {
			return razao*pg(nEsimo-1);
		}
	}

	/**
	 * pg
	 * @param a1
	 * @param razao
	 * @param nEsimo
	 * @return
	 */
	private static int pg(int a1, int razao, int nEsimo) {

		if (nEsimo<=1) {
			return a1;
		}
		else {
			return razao*pg(a1, razao, nEsimo - 1);
		}
	}

}
