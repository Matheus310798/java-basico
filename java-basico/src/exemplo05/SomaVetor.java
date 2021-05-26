package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a soma de um vetor do tipo inteiro
 * @author mtomazs
 * @since 11/02/2021
 */
public class SomaVetor {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando o vetor
		int vetor[];
		int soma;
		
		// inicializando e definindo o tamanho do vetor
		vetor = new int[5];
		
		// iniciando a variavel soma
		soma = 0;
		
		// valorizando as posições do vetor com os dados informados pelo usuário
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		// declarando variável auxiliar para somar o vetor
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i]; // ou pode ser soma = soma + vetor[i];
		}
		
		// exibindo o resultado da soma do vetor
		System.out.println(soma);
	}
}
		