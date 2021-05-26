package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler tr�s valores e escrever se forma ou n�o um tri�ngulo.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double a, b, c;
		
		// recebendo a informa��o do usu�rio
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado B:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado C:"));
		
		// exibindo para o usu�rio
		if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) 
		{
		JOptionPane.showMessageDialog(null, "Forma um tri�ngulo");
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "N�o forma um tri�ngulo");	
		}
		}
		
	}
