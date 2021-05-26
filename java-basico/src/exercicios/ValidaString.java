package exercicios;

/**
 * @author mtomazs
 *
 */
public class ValidaString {

	// método para verificar String vazia
		public static boolean isStringVazio(String args) {
			// COMANDO TRIM = Tira os espacos da variavel String
			if (args.trim().isEmpty()) {
				return true;
			} else {
				return false;
			}
		}
		
		// método para verificar String vazia
		public static boolean isStringPequeno(String args) {
			// COMANDO TRIM = Tira os espacos da variavel String
			if (args.length() < 2) {
				return true;
			} else {
				return false;
			}
		}
}
