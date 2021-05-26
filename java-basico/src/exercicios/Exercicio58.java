package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 idades dos homens e 2 das mulheres, e realizar o c�lculo.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio58 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		int h1, h2, m1, m2;
		
		// recebendo a informa��o do usu�rio
		h1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do 1� Homem: "));
		h2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do 2� Homem: "));
		m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1� mulher: "));
		m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2� mulher:"));
		
		// exibindo para o usu�rio
		if ((h1 > h2) && (m1 > m2))
		{
		JOptionPane.showMessageDialog(null, "Soma: " + (h1 + m2) + "\n" +
											"Produto: " + (h2 * m1));
		}
		
		else if ((h2 > h1) && (m2 > m1))
		{
		JOptionPane.showMessageDialog(null, "Soma: " + (h2 + m1) + "\n" +
											"Produto: " + (h1 * m2));
		}
		
		else if ((h2 > h1) && (m1 > m2))
		{
		JOptionPane.showMessageDialog(null, "Soma: " + (h2 + m2) + "\n" +
											"Produto: " + (h1 * m1));
		}
		
		else if ((h1 > h2) && (m2 > m1))
		{
		JOptionPane.showMessageDialog(null, "Soma: " + (h1 + m1) + "\n" +
											"Produto: " + (h2 * m2));
		}
		}
		
	}
