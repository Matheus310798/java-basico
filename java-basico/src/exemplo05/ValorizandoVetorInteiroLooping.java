package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para valorizar um vetor do tipo inteiro informado pelo usuário usando o FOR
 * @author mtomazs
 * @since 11/02/2021
 */
public class ValorizandoVetorInteiroLooping {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando o vetor
		int vetor[];
		
		// inicializando o vetor e definindo o seu tamanho
		vetor = new int[5];
		
		// recebendo os valores do usuário com auxilio do comando FOR
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		// exibindo os valor contidos no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}