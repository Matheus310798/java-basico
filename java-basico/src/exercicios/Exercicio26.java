package exercicios;

import javax.swing.JOptionPane;

/**
 * Exibir a quantidade de dias que já se passaram utilizando a data informada.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio26 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double dias, mes, mes1, mes2;
		
		// recebendo informação do usuário
		dias = Double.parseDouble(JOptionPane.showInputDialog("Digite o dia:"));
		mes = Double.parseDouble(JOptionPane.showInputDialog("Digite o mês:"));
		
		// OPERAÇÃO
		mes1 = mes - 1;
		mes2 = mes1 * 30;
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Já se passaram " + (dias + mes2) + " dias do ano atual");

	}

}
