package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber os dados, efetuar a operação e exibir os resultados da eleição
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio18 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double tel, br, nu, va, pbr, pnu, pva;
		
		// Recebendo os dados do usuário
		tel = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos eleitores:"));
		br = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos votaram em branco:"));
		nu = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos votaram nulo:"));
		va = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos votos válidos:"));
		
		// Operação
		pbr = br / tel;
		pnu = nu / tel;
		pva = va / tel;
				
		// Exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Porcentagem dos votos brancos: " + (pbr * 100) + "\n" +
											"Porcentagem dos votos nulos: " + (pnu * 100) + "\n" + 
											"Porcentagem dos votos válidos: " + (pva * 100));

	}

}
