package exercicios;

import javax.swing.JOptionPane;

/**
 * Descobrir quantidade de litros através do valor do pagamento e do valor da gasolina.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio25 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double combustivel, pago;
		
		// recebendo informação do usuário
		combustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do litro do combustível:"));
		pago = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago pelo cliente:"));
			
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Quantidade de litros abastecido: " + (pago / combustivel));

	}

}
