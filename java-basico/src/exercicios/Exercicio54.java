package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler três valores e escrever se forma ou não um triângulo.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double a, b, c;
		
		// recebendo a informação do usuário
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado B:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado C:"));
		
		// exibindo para o usuário
		if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) 
		{
		JOptionPane.showMessageDialog(null, "Forma um triângulo");
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Não forma um triângulo");	
		}
		}
		
	}
