package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e escrever a média aritmética dos números inteiros
 * entre 14 e 100 incluindo eles.
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio79 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		double media, contador;

		// iniciando as variáveis
		media = 0;
		contador = 0;

		// laços de repetição
		for (int i = 15; i <= 100; i++) {
			media += i;
			contador++;
		}
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Média é igual: " + (media / contador));
	}

}
