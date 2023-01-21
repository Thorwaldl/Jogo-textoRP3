package Classes;

import java.util.ArrayList;

public class Localizacao {
	private String nome;
	private int coordenada;
	private ArrayList<Inimigo> inimigos = new ArrayList<Inimigo>();
	private Localizacao anterior;
	private ArrayList<Localizacao> proximosCaminhos = new ArrayList<Localizacao>();
	
	
	public Localizacao(String nome, int coordenada, Localizacao anterior) {
		super();
		this.nome = nome;
		this.coordenada = coordenada;
		this.anterior = anterior;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCoordenada() {
		return coordenada;
	}
	public void setCoordenada(int coordenada) {
		this.coordenada = coordenada;
	}
	public ArrayList<Inimigo> getInimigos() {
		return inimigos;
	}
	public void setInimigos(ArrayList<Inimigo> inimigos) {
		this.inimigos = inimigos;
	}
	public Localizacao getAnterior() {
		return anterior;
	}
	public void setAnterior(Localizacao anterior) {
		this.anterior = anterior;
	}
	public ArrayList<Localizacao> getProximosCaminhos() {
		return proximosCaminhos;
	}
	public void setProximosCaminhos(ArrayList<Localizacao> proximosCaminhos) {
		this.proximosCaminhos = proximosCaminhos;
	}

	
}
