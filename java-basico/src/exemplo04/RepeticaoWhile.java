package exemplo04;

/**
 * Programa para demonstrar laços de repetição While
 * @author Matheus Tomaz
 * @since 10/02/2021
 */
public class RepeticaoWhile {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Declarando as variáveis
		int indice;
		
		// inicializando a variável
		indice = 0;
		
		// efetuando o laço de repetição para exibir o cubo de um número
		while (indice < 10) { // inicio do laço de repetição
			
			System.out.println(indice + " ao cubo é: " + ((indice * indice) * indice) );
			indice++;
		} // fim do laço de repetição
		
		
	}

}
