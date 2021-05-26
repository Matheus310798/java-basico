package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para eeceber a idade do usu�rio em anos, meses e dias e exibir o resultado em dias
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio17 {

	/*
	 * @ M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		int anos, meses, dias, res1, res2, res3;
		
		// Recebendo os dados do usu�rio
		anos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos anos completados:"));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos meses completados:"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos dias se passaram antes de completar 1 m�s:"));
		
		// Opera��o
		res1 = anos * 365;
		res2 = meses * 30;
		res3 = res1 + res2 + dias;
		
		// Exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Sua idade em dias �: " + res3);

	}

}
