package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 20 notas, calcular a média e escrever quantos alunos
 * ficaram acima da média
 * 
 * @author mtomazs
 * @since 11/02/2021
 */
public class Exercicio89 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variável para o vetor
		double nota[];
		int contador;
		double media, soma;

		// iniciando a variavel soma
		soma = 0;
		contador = 0;

		// iniciando o vetor e definindo o tamanho
		nota = new double[20];

		// recebendo as notas do usuário
		for (int i = 0; i < nota.length; i++) {
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota:"));
		}

		// declarando variável auxiliar para somar o vetor
		for (int i = 0; i < nota.length; i++) {
			soma += nota[i];
		}

		// calculando média
		media = soma / 20;

		// verificando quantos alunos tiraram mais que a média
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] > media) {
				contador++;
			}
		}
		// exibindo para o console
		System.out.println("Média dos alunos: " + media + "\n" + "Quantidade de alunos acima da média: " + contador);
	}
}