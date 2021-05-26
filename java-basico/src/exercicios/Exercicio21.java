package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber o valor de custo do carro, efetuar a operação e exibir o resultado com os reajustes.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio21 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double cf, pd, imp, vfc;
		
		// recebendo informação do usuário
		cf = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro:"));
		
		// operação
		pd = cf * 0.28;
		imp = cf * 0.45;
		vfc = imp + pd + cf;
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "O custo final do carro ao consumidor é: R$ " + vfc);

	}

}
