package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um valor em d�lar e converter em reais
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio20 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double real, dolar;
		
		// recebendo informa��o do usu�rio
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em d�lar a ser convertido:"));
		
		// opera��o
		real = dolar * 6.61;
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Valor convertido em reais: R$ " + real);

	}

}
