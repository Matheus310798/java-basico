package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o estoque e escrever se precisa comprar ou não.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double n1, n2, n3, sa;
		
		// recebendo a informação do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade atual em estoque:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade máxima do estoque:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade mínima do estoque:"));
		
		// operação
		sa = ((n2 + n3) / 2);
		
		// exibindo para o usuário
		if (n1 >= sa) 
		{
		JOptionPane.showMessageDialog(null, "Não efetuar compra");	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Efetuar compra");	
		}
		
	}

}
