package exemplo03;

/**
 * Programa para demonstrar o decremento
 * @author mtomazs
 * @since 10/02/2021
 */
public class ExemploDecremento {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		int numero;
		
		// atribuindo valores
		numero = 1;
		
		System.out.println(numero); // exibindo valor 1
		
		numero = numero - 1; // deceremento
		
		System.out.println(numero); // exibindo valor 0
		
		numero = 10;
		
		System.out.println(numero); // exibindo valor 10
		
		System.out.println(--numero); // exibindo valor 9
		
		numero--;
		numero--;
		
		System.out.println(numero); // exibindo valor 7 
	}

}
