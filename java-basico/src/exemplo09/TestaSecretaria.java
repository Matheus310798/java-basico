package exemplo09;

/**
 * Classe para instanciar o objeto Secretaria e exibir os seus dadps
 * @author mtomazs
 * @since 23/02/2021
 */
public class TestaSecretaria {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// instacniando o objeto do tipo Secretaria
		Secretaria maria = new Secretaria();
		maria.setNome("Maria de Paula");
		maria.setCpf("325.325.325-35");
		maria.setSalario(950.00);
		maria.setRamal(123);
		
		maria.mostrarDados();

	}

}
