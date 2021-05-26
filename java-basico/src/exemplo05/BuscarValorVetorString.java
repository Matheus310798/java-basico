package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um valor especifico no vetor String
 * @author mtomazs
 * @since 11/02/2021
 */
public class BuscarValorVetorString {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando vetor
		String vetor[];
		
		// inicializando o vetor e definindo o tamanho
		vetor = new String[3];
		
		// vari�vel auxiliar para buscar um registro
		String  nome = "Matheus";
		
		// valorizando o vetor com os dados informado pelo usu�rio
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome:");
		}
		
		// varrendo o vetor para verificar os registros armazenados
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(nome)) {
				System.out.println("Achei o que vc procurava na posi��o: " + i);
			}
		}
	}
}