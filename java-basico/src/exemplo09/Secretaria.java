package exemplo09;

/**
 * Classe para armazenar os atributos e m�todos do objeto secretaria e herdar de
 * funcion�rio
 * 
 * @author mtomazs
 * @since 23/02/2021
 */
public class Secretaria extends Funcionario {

	// atributos de secret�ria
	private int ramal;

	// m�todo para acessar o atributo
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	// m�todo para exibir os dados
	public void mostrarDados() {
		super.mostarDados();
		System.out.println("Ramal: " + ramal);
	}
	
	
}
