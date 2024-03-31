/**
 * 
 */
package view;

import model.Eletronico;
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

		System.out.println(p.toString());
		System.out.println(p.ehCaro());

		Livro l = new Livro();
		l.setNome("Sistemas Operacionais Modernos");
		l.setPreco(300);
		l.setAutor("A. Tanenbaum");
		l.setQtdPaginas(650);

		System.out.println(l.toString());
		System.out.println(l.ehCaro());
		System.out.println(l.ehGrande());

		Eletronico tv = new Eletronico();
		tv.setNome("TV 55. pol");
		tv.setPreco(1200);
		tv.setVoltagem(127);
		double valorComDesconto = tv.valorComDesconto(12);

		System.out.println(tv.toString());
		System.out.println(tv.ehCaro());
		System.out.println(valorComDesconto);

		Produto radio = new Eletronico();
		radio.setNome("Rádio Stereo");
		radio.setPreco(899);

		System.out.println(radio.toString());
		System.out.println(radio.ehCaro());

	}
}