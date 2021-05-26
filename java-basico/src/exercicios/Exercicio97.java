package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler valores de um vetor, depois ler outro número e se tiver no vetor, escrever um novo sem ele.
 * @author mtomazs
 * @since 15/02/2021
 */
public class Exercicio97 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declarando as variáveis e o vetor
		int vet1 [];
		int vet2[];
		
		int n, pos=-100;
		boolean aux = false;
		
		// iniciando as variáveis e definindo seus tamanhos
		vet1 = new int[20];
		vet2 = new int[19];
		
		// solicitando os dados para o usuário
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe os números: "));	
			}
		
		// solicitando outro número para verificar se já existe no vetor
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número para verificação: "));
		
		// verificando se a variavel "n" possui no vet1
		for (int i = 0; i < vet1.length; i++) {
			if (vet1[i] == n) {
				aux = true;
				pos = i;
			}
		}
		
		// retirando o número e criando um novo vetor
		if (aux) {
			for (int i = 0; i < vet2.length; i++) {
				if (i >= pos) {
					vet2[i] = vet1 [i + 1];
				} else {
					vet2[i] = vet1[i];
				}
			}
		}
		
		// exibindo para o usuário
		if (aux) {
			System.out.println("Vetor Final: " + "\n");
			for (int i = 0; i < vet2.length; i++) {
				System.out.println(vet2[i]); 
			}
		} else {
			System.out.println("Vetor Final: " + "\n");
			for (int i = 0; i < vet1.length; i++) {
				System.out.println(vet1[i]);
			}
		}
		
		}
	}