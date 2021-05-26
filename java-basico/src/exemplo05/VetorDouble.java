
package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização do vetor double em Java
 * @author mtomazs
 *
 */
public class VetorDouble {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// definindo o vetor
		double vetor[];
		
		// inicializando e informando o tamanho do vetor
		vetor = new double[5];
		
		// recebendo os dados do usuário para valorizar o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}