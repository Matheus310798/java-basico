package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a total de mercadorias e o valor de cada, depois
 * imprimir a m�dia e o valor total.
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio80 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando vari�veis
		double vt = 0, preco = 0, media = 0;
		int quant = 0;

		// recebendo a informa��o do usu�rio e la�os de repeti��o
		do {
			quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
		} while (quant <= 0);

		for (int i = 0; i < quant; i++) {
			do {
				preco = Integer.parseInt(JOptionPane.showInputDialog("Informe o pre�o:"));
			} while (preco <= 0);

			// c�lculo da m�dia e do valor total
			vt += preco;
			media = vt / quant;
		}
		// exibindo a informa��o para o usu�rio
		JOptionPane.showMessageDialog(null, "Valor total: R$ " + vt + "\n" + "M�dia: R$ " + media);
	}

}
