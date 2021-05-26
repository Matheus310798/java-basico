
package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utiliza��o do vetor double em Java
 * @author mtomazs
 *
 */
public class VetorDouble {

	/**
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// definindo o vetor
		double vetor[];
		
		// inicializando e informando o tamanho do vetor
		vetor = new double[5];
		
		// recebendo os dados do usu�rio para valorizar o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}