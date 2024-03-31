/**
 * 
 */
package view;

import model.Livro;
import model.Produto;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class Loja {
	public static void main(String[] args) {
		Produto p = new Produto();
		p.setNome("Smartphone");
		p.setPreco(1500);

		System.out.println(p.ehCaro());

		Livro l = new Livro();
		l.setNome("Sistemas Operacionais Modernos");
		l.setPreco(300);
		l.setAutor("A. Tanenbaum");
		l.setQtdPaginas(650);

		System.out.println(l.ehCaro());
		System.out.println(l.ehGrande());

	}
}