package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe 
 * @author mtomazs
 *
 */
public class TestaUsuario {

	public void receberDados() {
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de Usuário", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Nome válido", "Cadastro de Usuário", 1);;
		}
		
		if (Valida.isStringValida(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, "Nome válido", "Cadastro de Usuário", 1);;
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de Usuário", 0);
		}
		
		if (Valida.isNumber(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, "Idade Válida", "Cadastro de Usuário", 1);;
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalido, "Cadastro de Usuário", 0);
		}
	}
	
	
	public static void main(String[] args) {
		new TestaUsuario().receberDados();
	}
	
	} // fim da classe

