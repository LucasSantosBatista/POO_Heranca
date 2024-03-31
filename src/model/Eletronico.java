/**
 * 
 */
package model;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class Eletronico extends Produto {
	private int voltagem;

	public Eletronico() {
		super();
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	@Override
	public boolean ehCaro() {
		return (getPreco() > 2000);
	}

}
