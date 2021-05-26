package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o estoque e escrever se precisa comprar ou n�o.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double n1, n2, n3, sa;
		
		// recebendo a informa��o do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade atual em estoque:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade m�xima do estoque:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade m�nima do estoque:"));
		
		// opera��o
		sa = ((n2 + n3) / 2);
		
		// exibindo para o usu�rio
		if (n1 >= sa) 
		{
		JOptionPane.showMessageDialog(null, "N�o efetuar compra");	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Efetuar compra");	
		}
		
	}

}
