package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber o valor de custo do carro, efetuar a opera��o e exibir o resultado com os reajustes.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio21 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double cf, pd, imp, vfc;
		
		// recebendo informa��o do usu�rio
		cf = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro:"));
		
		// opera��o
		pd = cf * 0.28;
		imp = cf * 0.45;
		vfc = imp + pd + cf;
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "O custo final do carro ao consumidor �: R$ " + vfc);

	}

}
