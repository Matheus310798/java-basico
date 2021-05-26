package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 números e exibir o resultado da soma dos seus intervalos
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio78 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int n1, n2, soma;

		// iniciando
		n1 = 0;
		n2 = 0;

		// usuário informando os valores
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1° número:"));
		do {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2° número:"));
		} while (n1 >= n2);

		// iniciando a variável
		soma = 0;
		for (int i = n1; i <= n2; i++) {
			soma += i;
		}
		// informando para o usuário
		JOptionPane.showMessageDialog(null, "Resultado da soma é: " + soma);

	}
}
