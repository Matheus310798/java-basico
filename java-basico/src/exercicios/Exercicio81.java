package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever o maior e o menor valor lido
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio81 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		double n1, maior, menor;

		// recebendo a informa��o do usu�rio para armazenar os dados
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
		maior = n1;
		menor = n1;

		// ap�s armazenar os valores do maior e menor, c�digo para entrar no looping
		for (int i = 1; i < 10; i++) {
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
			if (n1 > maior) {
				maior = n1;
			}

			if (n1 < menor) {
				menor = n1;
			}
		}
		// exibindo os valor para o usu�rios
		JOptionPane.showMessageDialog(null, "Maior n�mero: " + maior + "\n" + "Menor n�mero: " + menor);
	}

}
