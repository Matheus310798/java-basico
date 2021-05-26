package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 n�meros e exibir o resultado da soma dos seus intervalos
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio78 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int n1, n2, soma;

		// iniciando
		n1 = 0;
		n2 = 0;

		// usu�rio informando os valores
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1� n�mero:"));
		do {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2� n�mero:"));
		} while (n1 >= n2);

		// iniciando a vari�vel
		soma = 0;
		for (int i = n1; i <= n2; i++) {
			soma += i;
		}
		// informando para o usu�rio
		JOptionPane.showMessageDialog(null, "Resultado da soma �: " + soma);

	}
}
