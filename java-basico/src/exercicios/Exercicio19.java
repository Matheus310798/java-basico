package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber os dados, efetuar a operação e exibir o resultado do sálario reajustado
 * @author mtomazs
 * @since 05/20/2021
 */
public class Exercicio19 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double sal, rea, rea1, rea2;
		
		// Recebendo os dados do usuário
		sal = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário atual:"));
		rea = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do reajuste:"));
		
		// operação
		rea1 = rea / 100;
		rea2 = rea1 * sal;
		
		// Exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Sálario reajustado é: R$ " + (rea2 + sal));

	}

}
