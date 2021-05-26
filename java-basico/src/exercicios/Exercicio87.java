package exercicios;

/**
 * Programa para desenhar um ret�ngulo
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio87 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int linha, coluna;

		// constru��o do ret�ngulo
		for (linha = 1; linha < 11; linha++) {
			for (coluna = 1; coluna < 61; coluna++) {
				if ((linha == 1) || (linha == 10)) {
					System.out.print("+");
				} else {
					if ((coluna == 1) || (coluna == 60)) {
						System.out.print("+");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}

	}
}