package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o c�digo do produto e seu pre�o, calcular e exibir a m�dia
 * dos pre�os e o maior pre�o lido
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio83 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		String codigo;
		double preco, maior, media = 0;

		// recebendo a informa��o do usu�rio para armazenar os dados
		codigo = JOptionPane.showInputDialog("Informe o c�digo do produto");
		do {
			preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o"));
		} while (preco <= 0);
		maior = preco;
		media += preco;

		// ap�s armazenar os valores do maior e media, c�digo para entrar no looping
		for (int i = 1; i < 5; i++) {
			codigo = JOptionPane.showInputDialog("Informe o c�digo do produto");
			do {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o"));
			} while (preco <= 0);
			if (preco > maior) {
				maior = preco;
			}
			media += preco;
		}
		// exibindo os valor para o usu�rios
		JOptionPane.showMessageDialog(null,
				"O maior pre�o lido �: R$ " + maior + "\n" + "M�dia dos pre�os: R$ " + (media / 5));
	}

}
