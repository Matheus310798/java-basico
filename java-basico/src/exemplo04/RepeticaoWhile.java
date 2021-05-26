package exemplo04;

/**
 * Programa para demonstrar la�os de repeti��o While
 * @author Matheus Tomaz
 * @since 10/02/2021
 */
public class RepeticaoWhile {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Declarando as vari�veis
		int indice;
		
		// inicializando a vari�vel
		indice = 0;
		
		// efetuando o la�o de repeti��o para exibir o cubo de um n�mero
		while (indice < 10) { // inicio do la�o de repeti��o
			
			System.out.println(indice + " ao cubo �: " + ((indice * indice) * indice) );
			indice++;
		} // fim do la�o de repeti��o
		
		
	}

}
