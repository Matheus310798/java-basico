package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma quantidade e a seguir ler a quantidade de números,
 * escrever o maior e a média dos números lidos
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio82 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int qt = 0;
		double n1, maior, media = 0;

		// recebendo a informação do usuário para armazenar os dados
		do {
			qt = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		} while (qt <= 0);
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o número"));
		maior = n1;
		media += n1;

		// após armazenar os valores do maior e media, código para entrar no looping
		for (int i = 1; i < qt; i++) {
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o número"));
			if (n1 > maior) {
				maior = n1;
			}
			media += n1;
		}
		// exibindo os valor para o usuários
		JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\n" + "Média dos números: " + (media / qt));
	}

}
