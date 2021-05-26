package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar o valor da compra de acordo com o peso e dar desconto
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio59 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double morango, maca, kg, st, smo, sma;
		
		// capturando os dados do usuário
		morango = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos Kg de morangos:"));
		maca = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos Kg de maças:"));
		
		// definindo os valores de morango
		if (morango > 5) 
		{
			smo = morango * 2.2;
		} 
		
		else 
		{
		smo = morango * 2.5;	
		}
		
		// definindo os valores de maça
		if (maca > 5) 
		{
		sma = maca * 1.5;	
		}
		
		else 
		{
		sma = maca * 1.8;	
		}
		
		// operação para cálculo
		kg = maca + morango;
		st = smo + sma;
		
		// exibindo para o usuário
		if ((kg > 8) || (st > 25)) 
		{
		st = (st - (st * 0.1));
		JOptionPane.showMessageDialog(null, "Valor total da conta: R$ " + st);	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Valor total da conta: R$ " + st);	
		}
	}

}
