package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 idades dos homens e 2 das mulheres, e realizar o cálculo.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio58 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		int h1, h2, m1, m2;
		
		// recebendo a informação do usuário
		h1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do 1º Homem: "));
		h2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do 2º Homem: "));
		m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1º mulher: "));
		m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2º mulher:"));
		
		// exibindo para o usuário
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
