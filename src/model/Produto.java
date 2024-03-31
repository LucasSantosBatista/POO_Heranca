/**
 * 
 */
package model;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class Produto {
	private String nome;
	private double preco;

	public Produto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean ehCaro() {
		return (preco > 100);
	}
}
