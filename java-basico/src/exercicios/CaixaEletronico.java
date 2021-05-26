package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Simular o caixa eletrônico
 * 
 * @author mtomazs
 *
 */
public class CaixaEletronico 
{

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) 
	{

		// declarando variáveis
		double saque, saque1;
		int valorsaque, n2, n5, n10, n20, n50, r2, r5, r10, r20, r50;

		// Recebendo informação do usuário
		saque = Double.parseDouble(JOptionPane.showInputDialog("=== Caixa eletrônico ===" + "\n"
				+ "Notas disponíveis: 2, 5, 10, 20, 50" + "\n\n" + "Informe o valor do Saque: "));
		
		// operação para verificar se possui centavos
		saque1 = saque % 1;
		valorsaque = (int) saque;

		if ((saque <= 1) || (saque == 3) || (saque1 > 0)) 
		{
			JOptionPane.showMessageDialog(null, "Valor inválido");
			
		}
		else
		{
			
		// operação 
			n50 = valorsaque / 50;
			r50 = valorsaque % 50;

			n20 = r50 / 20;
			r20 = r50 % 20;

			n10 = r20 / 10;
			r10 = r20 % 10;

			n5 = r10 / 5;
			r5 = r10 % 5;

			n2 = r5 / 2;
			r2 = r5 % 2;
			
		// arredondamento em caso de sobra
		if (r2 > 0) 
		{
			if ((valorsaque % 50 ==1 ) || (valorsaque % 50 ==3)) 
			{
				n50 = n50 - 1;
				n20 = n20 + 2;
				n5 = n5 + 1;
				n2 = n2 + 3;
			} 
			else 
			{
				if (n5 > 0) 
				{
					n5 = n5 - 1;
					n2 = n2 + 3;
				} 
				else if (n10 > 0) 
				{
					n10 = n10 - 1;
					n5 = n5 + 1;
					n2 = n2 + 3;
				}
				else if (n20 > 0)
				{
					n20 = n20 - 1;
					n10 = n10 + 1;
					n5 = n5 + 1;
					n2 = n2 + 3;
				}else{
					n50 = n50 - 1;
					n20 = n20 + 1;
					n10 = n10 + 1;
					n5 = n5 + 1;
					n2 = n2 + 3;
				}
			}
}			
		// impressão
		JOptionPane.showMessageDialog(null, "Valor sacado: R$ " + valorsaque + "\n" +
											"Notas de 2: " + n2 + "\n" + 
											"Notas de 5: " + n5 + "\n" +
											"Notas de 10: " + n10 + "\n" +
											"Notas de 20: " + n20 + "\n" +
											"Notas de 50: " + n50);
		}
	}
}