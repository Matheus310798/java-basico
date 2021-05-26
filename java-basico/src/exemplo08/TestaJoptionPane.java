package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização do componente JOptionPane acessando
 * atributos estáticos
 * 
 * @author mtomazs
 * @since 23/02/2021
 */
public class TestaJoptionPane {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// utilizando o JOptionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 0); // 0 - código do ícone de erro

		// utilizando o JOptionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - código do ícone de informação

		// utilizando o JOptionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 2); // 2 - código do ícone de advertência

		// utilizando o JOptionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 3); // 3 - código do ícone de interrogração
	}

}
