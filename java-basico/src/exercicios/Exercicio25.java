package exercicios;

import javax.swing.JOptionPane;

/**
 * Descobrir quantidade de litros atrav�s do valor do pagamento e do valor da gasolina.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio25 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double combustivel, pago;
		
		// recebendo informa��o do usu�rio
		combustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do litro do combust�vel:"));
		pago = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago pelo cliente:"));
			
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Quantidade de litros abastecido: " + (pago / combustivel));

	}

}
