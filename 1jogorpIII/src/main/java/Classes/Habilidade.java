package Classes;

public class Habilidade {
	private String nome;
	private int tempoDeRecargaTotal;
	private int tempoDeRecargaAtual;
	private int danoAdicional;
	
	private Personagem utilizador;
	
	
	public Habilidade(String nome, int tempoDeRecarga, Personagem utilizador, int danoAdicional) {
		this.nome = nome;
		this.tempoDeRecargaTotal = tempoDeRecarga;
		this.tempoDeRecargaAtual = this.tempoDeRecargaTotal;
		this.utilizador = utilizador;
		this.danoAdicional = danoAdicional;
	}

	public void causarDano(Personagem inimigo) { // utilizar o calculo de haskell aqui
		
		int dano = (utilizador.getAtaque() - inimigo.getDefesa()) + danoAdicional ;
		inimigo.setVida(inimigo.getVida() - dano ); 
		
		System.out.println(utilizador.getNome()+" utilizou "+ this.nome + " causando " + dano + " de dano");
	}
	
	/*private int verificarVantagem(Personagem inimigo) { // usar a verificação feita em haskell
		if(utilizador.getElemento() == Elemento.FOGO && inimigo.getElemento() == Elemento.AR) {
			return 1;
		}else if(utilizador.getElemento() == Elemento.FOGO && inimigo.getElemento() == Elemento.AGUA) {
			return -1;
		}else {
			return 0;
		}
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getTempoDeRecargaTotal() {
		return tempoDeRecargaTotal;
	}

	public void setTempoDeRecargaTotal(int tempoDeRecargaTotal) {
		this.tempoDeRecargaTotal = tempoDeRecargaTotal;
	}

	public int getTempoDeRecargaAtual() {
		return tempoDeRecargaAtual;
	}

	public void setTempoDeRecargaAtual(int tempoDeRecargaAtual) {
		this.tempoDeRecargaAtual = tempoDeRecargaAtual;
	}

	public int getDanoAdicional() {
		return danoAdicional;
	}

	public void setDanoAdicional(int danoAdicional) {
		this.danoAdicional = danoAdicional;
	}

	public Personagem getUtilizador() {
		return utilizador;
	}

	public void setUtilizador(Personagem utilizador) {
		this.utilizador = utilizador;
	}
	
	
}
