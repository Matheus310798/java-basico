package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o salário e o VR e exibir no console
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as variáveis
		double salario, vr;

		// recebendo os dados do usuário
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: "));
		vr = Double.parseDouble(JOptionPane.showInputDialog("Informe seu VR: "));

		// exibindo no console
		System.out.println("Seu Salário é: R$ " + salario + "\n" + 
						   "Seu Vale-Refeição é: R$ " + vr); 

	}

}
