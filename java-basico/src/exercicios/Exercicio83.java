package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o código do produto e seu preço, calcular e exibir a média
 * dos preços e o maior preço lido
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio83 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		String codigo;
		double preco, maior, media = 0;

		// recebendo a informação do usuário para armazenar os dados
		codigo = JOptionPane.showInputDialog("Informe o código do produto");
		do {
			preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço"));
		} while (preco <= 0);
		maior = preco;
		media += preco;

		// após armazenar os valores do maior e media, código para entrar no looping
		for (int i = 1; i < 5; i++) {
			codigo = JOptionPane.showInputDialog("Informe o código do produto");
			do {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço"));
			} while (preco <= 0);
			if (preco > maior) {
				maior = preco;
			}
			media += preco;
		}
		// exibindo os valor para o usuários
		JOptionPane.showMessageDialog(null,
				"O maior preço lido é: R$ " + maior + "\n" + "Média dos preços: R$ " + (media / 5));
	}

}
