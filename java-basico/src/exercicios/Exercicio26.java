package exercicios;

import javax.swing.JOptionPane;

/**
 * Exibir a quantidade de dias que j� se passaram utilizando a data informada.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio26 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double dias, mes, mes1, mes2;
		
		// recebendo informa��o do usu�rio
		dias = Double.parseDouble(JOptionPane.showInputDialog("Digite o dia:"));
		mes = Double.parseDouble(JOptionPane.showInputDialog("Digite o m�s:"));
		
		// OPERA��O
		mes1 = mes - 1;
		mes2 = mes1 * 30;
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "J� se passaram " + (dias + mes2) + " dias do ano atual");

	}

}
