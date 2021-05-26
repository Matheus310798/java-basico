package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o sal�rio e o VR e exibir no console
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as vari�veis
		double salario, vr;

		// recebendo os dados do usu�rio
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu sal�rio: "));
		vr = Double.parseDouble(JOptionPane.showInputDialog("Informe seu VR: "));

		// exibindo no console
		System.out.println("Seu Sal�rio �: R$ " + salario + "\n" + 
						   "Seu Vale-Refei��o �: R$ " + vr); 

	}

}
