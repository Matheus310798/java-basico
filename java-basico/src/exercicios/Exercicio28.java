package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcular o valor a ser pago pelos amigos Carlos, Andr� e Felipe
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio28 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double vc, cd, cf, dif; 
		int cc, ca, cp, cf1;
		
		
		// recebendo informa��o do usu�rio
		vc = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta:"));
		
		
		// dividindo a conta pelos amigos
		cd = vc / 3;
		
		// informando ao programa apenas o valor inteiro da conta
		cc = (int)cd;
		ca = (int)cd;
		cf1 = (int)cd;
		
		// somando a conta com os valores em inteiro
		cp = cc + ca + cf1;
		
		// diferen�a do valor da conta
		dif = vc - cp;
		
		// somando o valor da diferen�a na conta do Felipe
		cf = dif + cf1;
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Valor da conta de Carlos: R$ " + cc + "\n" + 
											"Valor da conta de Andr�: R$ " + ca + "\n" + 
											"Valor da conta de Felipe: R$ " + cf);

	}

}
