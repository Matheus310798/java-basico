package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números, ler outro numero e escrever suas multiplicações
 * 
 * @author Matheus Tomaz da Silva
 * @since 11/02/2021
 */
public class Exercicio92 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando um vetor String
		double A[];
		double M[];
		int X;

		// inicializar e definir o tamanho do vetor
		A = new double[10];
		M = new double[10];

		// recebendo do usuario os númeroes e armazenando em um vetor
		for (int i = 0; i < A.length; i++) {
			A[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
		}

		// recebendo o número na variável X
		X = Integer.parseInt(JOptionPane.showInputDialog("Informe o número multiplicador"));

		// realizando o cálculo na variàvel M
		for (int i = 0; i < M.length; i++) {
			M[i] = A[i] * X;
		}

		// exibindo o vetor M
		for (int i = 0; i < M.length; i++) {
			System.out.println("Resultado da multiplicação: " + A[i] + " x " + X + " = " + M[i] + "\n");
		}
	}
}
