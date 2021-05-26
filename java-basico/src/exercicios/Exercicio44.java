package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o sálario do funcionário reajustado em caso de hora extra
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double sal, horas, res;
		
		// recebendo a informação do usuário
		horas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas no mês:"));
		sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário por hora:"));
		
		// operação
		res = (((sal * 0.5) + sal) * (horas - 160));
		
		// exibindo para o usuário
		if (horas <= 160) 
		{
		JOptionPane.showMessageDialog(null, "Salário final: R$ " + (sal * horas));	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Salário final: R$ " + (res + (160 * sal)));	
		}
		
	}

}
