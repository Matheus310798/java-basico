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
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		double n1, maior, menor;

		// recebendo a informação do usuário para armazenar os dados
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
		maior = n1;
		menor = n1;

		// após armazenar os valores do maior e menor, código para entrar no looping
		for (int i = 1; i < 10; i++) {
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
			if (n1 > maior) {
				maior = n1;
			}

			if (n1 < menor) {
				menor = n1;
			}
		}
		// exibindo os valor para o usuários
		JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\n" + "Menor número: " + menor);
	}

}
