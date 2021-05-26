package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber as notas do aluno, efetuar a opera��o com os pesos e exibir o resultado.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio24 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double n1, n2, n3, nota1, nota2, nota3, notaf;
		
		// recebendo informa��o do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1� nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2� nota"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3� nota"));
		
		
		// opera��o
		nota1 = n1 * 2;
		nota2 = n2 * 3;
		nota3 = n3 * 5;
		notaf = nota1 + nota2 + nota3;
		
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "M�dia final: " + (notaf / 10));

	}

}
