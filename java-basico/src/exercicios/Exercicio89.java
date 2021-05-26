package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 20 notas, calcular a m�dia e escrever quantos alunos
 * ficaram acima da m�dia
 * 
 * @author mtomazs
 * @since 11/02/2021
 */
public class Exercicio89 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando vari�vel para o vetor
		double nota[];
		int contador;
		double media, soma;

		// iniciando a variavel soma
		soma = 0;
		contador = 0;

		// iniciando o vetor e definindo o tamanho
		nota = new double[20];

		// recebendo as notas do usu�rio
		for (int i = 0; i < nota.length; i++) {
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota:"));
		}

		// declarando vari�vel auxiliar para somar o vetor
		for (int i = 0; i < nota.length; i++) {
			soma += nota[i];
		}

		// calculando m�dia
		media = soma / 20;

		// verificando quantos alunos tiraram mais que a m�dia
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] > media) {
				contador++;
			}
		}
		// exibindo para o console
		System.out.println("M�dia dos alunos: " + media + "\n" + "Quantidade de alunos acima da m�dia: " + contador);
	}
}