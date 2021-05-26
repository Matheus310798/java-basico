package exemplo05;

/**
 * Programa para demonstrar a utiliza��o de vetor do tipo inteiro
 * @author mtomazs
 * @since 11/02/2021
 */
public class VetorInteiro {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando o vetor
		int vetor[];

		// iniciando o vetor e informando a quantidade de posi��es (tamanho)
		vetor = new int[3];
		
		// adicionando o valor 10 na 1� posi��o do vetor no seu �ndice 0
		vetor [0] = 10;
		
		// adicionando o valor 5 na 2� posi��o do vetor no �ndice 1
		vetor[1] = 5;
		
		// adicionando o valor 5 na 3� posi��o do vetor no �ndice 2
		vetor[2] = 25;
		
		// exibindo o valor da 1� posi��o do vetor
		System.out.println(vetor[0]);
		
		// exibindo o valor da 2� posi��o do vetor
		System.out.println(vetor[1]);
		
		// exibindo o valor da 3� posi��o do vetor
		System.out.println(vetor[2]);
	}

}
