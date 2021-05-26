package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar como valorizar um vetor inteiro recebido pelo usuário
 * @author mtomazs
 * @since 11/02/2021
 */
public class ValorizandoVetorInteiro {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declarando o vetor
		int vetor[];
		
		// inicializar e declarar o tamanho do vetor
		vetor = new int[5];
		
		// recebendo o valor do usuário
		vetor[0] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		vetor[1] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		vetor[2] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		vetor[3] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		vetor[4] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		
		// exibindo os dados do vetor
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println(vetor[4]);

	}

}
