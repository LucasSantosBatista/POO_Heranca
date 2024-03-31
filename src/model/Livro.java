/**
* 
*/
package model;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class Livro extends Produto {
	private String nome;
	private double preco;
	private String autor;
	private int qtdPaginas;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public boolean ehCaro() {
		return (preco > 100);
	}

	public boolean ehGrande() {
		return (qtdPaginas > 200);
	}
}
