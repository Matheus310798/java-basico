package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para eeceber a idade do usuário em anos, meses e dias e exibir o resultado em dias
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio17 {

	/*
	 * @ Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		int anos, meses, dias, res1, res2, res3;
		
		// Recebendo os dados do usuário
		anos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos anos completados:"));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos meses completados:"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos dias se passaram antes de completar 1 mês:"));
		
		// Operação
		res1 = anos * 365;
		res2 = meses * 30;
		res3 = res1 + res2 + dias;
		
		// Exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + res3);

	}

}
