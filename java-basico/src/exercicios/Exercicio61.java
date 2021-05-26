package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o produto, quantidade e preço unitário, calcular o desconto de acordo com a quantidade
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio61 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		String nome;
		double qa, pu , qt, des;
		
		// recebendo os dados do usuário
		nome = JOptionPane.showInputDialog("Descrição do produto:");
		qa = Double.parseDouble(JOptionPane.showInputDialog("Quantidade adquirida:"));
		pu = Double.parseDouble(JOptionPane.showInputDialog("Preço unitário:"));
		
		// cáluclo do desconto
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
		
		// exibindo para o usuário
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