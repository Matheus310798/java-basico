package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a total de mercadorias e o valor de cada, depois
 * imprimir a média e o valor total.
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio80 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		double vt = 0, preco = 0, media = 0;
		int quant = 0;

		// recebendo a informação do usuário e laços de repetição
		do {
			quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
		} while (quant <= 0);

		for (int i = 0; i < quant; i++) {
			do {
				preco = Integer.parseInt(JOptionPane.showInputDialog("Informe o preço:"));
			} while (preco <= 0);

			// cálculo da média e do valor total
			vt += preco;
			media = vt / quant;
		}
		// exibindo a informação para o usuário
		JOptionPane.showMessageDialog(null, "Valor total: R$ " + vt + "\n" + "Média: R$ " + media);
	}

}
