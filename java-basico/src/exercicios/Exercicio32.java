package exercicios;

import javax.swing.JOptionPane;

/**
 *  Calcular a quantidade de litros comprados
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio32 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double lata, gar1, gar2, lata1, gar11, gar22;
		
		// recebendo os dados do usuário
		lata = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de latas (350 ml) compradas: "));
		gar1= Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de garrafas (600 ml) compradas: "));
		gar2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de garrafas (2 Litros) compradas: "));
		
		// operação
		lata1 = 0.35 * lata;
		gar11 = 0.60 * gar1;
		gar22 = gar2 * 2;
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Quantidade de litros comprados: " + (gar22 + gar11 + lata1) + " Litros");
	}

}
