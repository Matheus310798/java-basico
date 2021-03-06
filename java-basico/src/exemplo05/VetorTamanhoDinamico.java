package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar vetor com o usu?rio informando o seu tamanho
 * @author mtomazs
 * @since 11/02/2021
 */
public class VetorTamanhoDinamico {

	/**
	 * M?todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando o vetor
		int vetor[];
		
		// vari?vel auxiliar informada pelo usu?rio para definir o tamanho do vetor
		int tamanho;
		
		// usu?rio informando o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		
		// inicializando o vetor e definindo o seu tamanho
		vetor = new int[tamanho];
		
		// recebendo do usu?rio os valores a serem gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		}
		
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}