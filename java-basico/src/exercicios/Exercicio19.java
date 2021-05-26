package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber os dados, efetuar a opera��o e exibir o resultado do s�lario reajustado
 * @author mtomazs
 * @since 05/20/2021
 */
public class Exercicio19 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double sal, rea, rea1, rea2;
		
		// Recebendo os dados do usu�rio
		sal = Double.parseDouble(JOptionPane.showInputDialog("Informe seu sal�rio atual:"));
		rea = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do reajuste:"));
		
		// opera��o
		rea1 = rea / 100;
		rea2 = rea1 * sal;
		
		// Exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "S�lario reajustado �: R$ " + (rea2 + sal));

	}

}
