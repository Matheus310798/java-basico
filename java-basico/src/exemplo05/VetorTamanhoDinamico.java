package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar vetor com o usuário informando o seu tamanho
 * @author mtomazs
 * @since 11/02/2021
 */
public class VetorTamanhoDinamico {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando o vetor
		int vetor[];
		
		// variável auxiliar informada pelo usuário para definir o tamanho do vetor
		int tamanho;
		
		// usuário informando o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		
		// inicializando o vetor e definindo o seu tamanho
		vetor = new int[tamanho];
		
		// recebendo do usuário os valores a serem gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		}
		
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}