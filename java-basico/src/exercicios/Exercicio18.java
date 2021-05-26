package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber os dados, efetuar a opera��o e exibir os resultados da elei��o
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio18 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double tel, br, nu, va, pbr, pnu, pva;
		
		// Recebendo os dados do usu�rio
		tel = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos eleitores:"));
		br = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos votaram em branco:"));
		nu = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos votaram nulo:"));
		va = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos votos v�lidos:"));
		
		// Opera��o
		pbr = br / tel;
		pnu = nu / tel;
		pva = va / tel;
				
		// Exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Porcentagem dos votos brancos: " + (pbr * 100) + "\n" +
											"Porcentagem dos votos nulos: " + (pnu * 100) + "\n" + 
											"Porcentagem dos votos v�lidos: " + (pva * 100));

	}

}
