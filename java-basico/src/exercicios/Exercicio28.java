package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcular o valor a ser pago pelos amigos Carlos, André e Felipe
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio28 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double vc, cd, cf, dif; 
		int cc, ca, cp, cf1;
		
		
		// recebendo informação do usuário
		vc = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta:"));
		
		
		// dividindo a conta pelos amigos
		cd = vc / 3;
		
		// informando ao programa apenas o valor inteiro da conta
		cc = (int)cd;
		ca = (int)cd;
		cf1 = (int)cd;
		
		// somando a conta com os valores em inteiro
		cp = cc + ca + cf1;
		
		// diferença do valor da conta
		dif = vc - cp;
		
		// somando o valor da diferença na conta do Felipe
		cf = dif + cf1;
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Valor da conta de Carlos: R$ " + cc + "\n" + 
											"Valor da conta de André: R$ " + ca + "\n" + 
											"Valor da conta de Felipe: R$ " + cf);

	}

}
