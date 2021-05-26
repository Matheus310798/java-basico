package exemplo04;

/**
 * Programa para demonstrar a utiliza��o do comando de repeti��o Do While
 * @author mtomazs
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Decalarando vari�veis
		int i;
		
		// iniciando a vari�vel
		i = 0;
		
		do {
			System.out.println(i + " ao cubo �: " + ((i * i) * i) );
			i++;
		} while (i < 10);
	}
}