package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber os dados, calcular o sal�rio final e exibir o resultado.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double cv, vtv, sal, com, n1, n2, sf;
		
		// recebendo informa��o do usu�rio
		cv = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de carros vendidos:"));
		vtv = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total de vendas"));
		sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio-fixo:"));
		com = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da comiss�o fixa por carro:"));
		
		// opera��o
		n1 = com * cv;
		n2 = 0.05 * vtv;
		sf = n2 + n1 + sal;
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Seu sal�rio final �: R$ " + sf);

	}

}
