package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o s�lario do funcion�rio reajustado sobre suas vendas.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double salf, valv, res, res1, res2;
		
		// recebendo a informa��o do usu�rio
		salf = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio fixo:"));
		valv = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de vendas efetuadas:"));
		
		// opera��o
		res = valv * 0.03;
		res1 = ((valv - 1500) * 0.05);
		res2 = 1500 * 0.03;
		
		// exibindo para o usu�rio
		if (valv <= 1500) 
		{
		JOptionPane.showMessageDialog(null, "Sal�rio final: R$ " + (salf + res));	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Sal�rio final: R$ " + (salf + res1 + res2));	
		}
		
	}

}
