package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o produto, quantidade e pre�o unit�rio, calcular o desconto de acordo com a quantidade
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio61 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		String nome;
		double qa, pu , qt, des;
		
		// recebendo os dados do usu�rio
		nome = JOptionPane.showInputDialog("Descri��o do produto:");
		qa = Double.parseDouble(JOptionPane.showInputDialog("Quantidade adquirida:"));
		pu = Double.parseDouble(JOptionPane.showInputDialog("Pre�o unit�rio:"));
		
		// c�luclo do desconto
		qt = qa * pu;
		if (qa <= 5) 
		{
		des = qt * 0.02;	
		} 
		
		else if ((qa > 5) && (qa <= 10)) 
		{
		des = qt * 0.03;	
		}
		
		else 
		{
		des = qt * 0.05;	
		}
		
		// exibindo para o usu�rio
		if (qa <= 5) 
		{
		JOptionPane.showMessageDialog(null, "Total da conta: R$ " + qt + "\n" + 
											"Desconto de 2%" + "\n" +
											"Valor a pagar: R$ " + (qt - des));	
		}
		
		else if ((qa > 5) && (qa <= 10))
		{
		JOptionPane.showMessageDialog(null, "Total da conta: R$ " + qt + "\n" + 
											"Desconto de 3%" + "\n" +
											"Valor a pagar: R$ " + (qt - des));		
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Total da conta: R$ " + qt + "\n" + 
											"Desconto de 5%" + "\n" +
											"Valor a pagar: R$ " + (qt - des));		
		}
	}
}