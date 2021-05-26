package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o s�lario do funcion�rio reajustado em caso de hora extra
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double sal, horas, res;
		
		// recebendo a informa��o do usu�rio
		horas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas no m�s:"));
		sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio por hora:"));
		
		// opera��o
		res = (((sal * 0.5) + sal) * (horas - 160));
		
		// exibindo para o usu�rio
		if (horas <= 160) 
		{
		JOptionPane.showMessageDialog(null, "Sal�rio final: R$ " + (sal * horas));	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Sal�rio final: R$ " + (res + (160 * sal)));	
		}
		
	}

}
