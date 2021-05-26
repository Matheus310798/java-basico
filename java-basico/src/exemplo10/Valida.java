
package exemplo10;

/**
 * Classe respons�vel por armazenar os m�todos de valida��o de dados
 * 
 * @author mtomazs
 *
 */
public class Valida {

	// m�todo para verificar String vazia
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = Tira os espacos da variavel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}

	// m�todo para verificar String V�lida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}
	
	// m�todo para verificar se � n�mero
	public static boolean isNumber(String args) {
		try {
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
