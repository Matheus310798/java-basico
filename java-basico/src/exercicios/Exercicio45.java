package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o sálario do funcionário reajustado sobre suas vendas.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double salf, valv, res, res1, res2;
		
		// recebendo a informação do usuário
		salf = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo:"));
		valv = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de vendas efetuadas:"));
		
		// operação
		res = valv * 0.03;
		res1 = ((valv - 1500) * 0.05);
		res2 = 1500 * 0.03;
		
		// exibindo para o usuário
		if (valv <= 1500) 
		{
		JOptionPane.showMessageDialog(null, "Salário final: R$ " + (salf + res));	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Salário final: R$ " + (salf + res1 + res2));	
		}
		
	}

}
