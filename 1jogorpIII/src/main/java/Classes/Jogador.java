package Classes;

public class Jogador extends Personagem {
	
	private int experienciaTotal;
	private int pontoParaDistribuir;
	
	
	public Jogador() {
		super();

	}
	public Jogador(String nome, Elemento elemento, int vida, int ataque, int defesa, int experiencia, int nivel,
			int velocidade) {
		super(nome, elemento, vida, ataque, defesa, experiencia, nivel, velocidade, inventario);
		this.experienciaTotal = 0;
		this.pontoParaDistribuir = 0;

	}
	public int getExperienciaTotal() {
		return experienciaTotal;
	}
	public void setExperienciaTotal(int experienciaTotal) {
		this.experienciaTotal = experienciaTotal;
	}
	public int getPontoParaDistribuir() {
		return pontoParaDistribuir;
	}
	public void setPontoParaDistribuir(int pontoParaDistribuir) {
		this.pontoParaDistribuir = pontoParaDistribuir;
	}
}

