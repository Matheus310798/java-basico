
package exemplo10;

/**
 * Classe responsável por armazenar os métodos de validação de dados
 * 
 * @author mtomazs
 *
 */
public class Valida {

	// método para verificar String vazia
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = Tira os espacos da variavel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}

	// método para verificar String Válida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}
	
	// método para verificar se é número
	public static boolean isNumber(String args) {
		try {
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
