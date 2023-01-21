package Classes;

import java.util.ArrayList;

public abstract class Personagem {
	private String nome;
	private Elemento elemento;
	private int vida;
	private int ataque;
	private int defesa;
	private int experiencia;
	private int nivel;
	private int velocidade;
	Inventário inventario;
	private ArrayList<Habilidade> habilidades = new ArrayList<Habilidade>();


	public Personagem() {
		
	}
	

	public Personagem(String nome, Elemento elemento, int vida, int ataque, int defesa, int experiencia, int nivel,
			int velocidade, Inventário inventario) {
		this.nome = nome;
		this.elemento = elemento;
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
		this.experiencia = experiencia;
		this.nivel = nivel;
		this.velocidade = velocidade;
		this.inventario = inventario;
		this.definirHabilidade(elemento);
		this.definirHabilidade(elemento);
	}


	public void atacar(Personagem inimigo) {
		int dano = this.getAtaque() - inimigo.getDefesa();
		inimigo.setVida(inimigo.getVida() - dano);
		
		System.out.println(this.getNome()+" atacou " + " causando " + dano + " de dano");
	}
	
	private void definirHabilidade(Elemento elemento) {
		if(elemento == Elemento.FOGO) {
			this.habilidades.add(new Habilidade("Bola de Fogo", 3, this,3)); 
			this.habilidades.add(new Habilidade("Amaterasu", 6, this,5)); 
		}else if(elemento == Elemento.AGUA) {
			this.habilidades.add(new Habilidade("Bolha de Agua", 3, this,3)); 
			this.habilidades.add(new Habilidade("Tsunami", 6, this,5)); 
		}else if(elemento == Elemento.AR) {
			this.habilidades.add(new Habilidade("Tornado", 3, this,3)); 
			this.habilidades.add(new Habilidade("Furacão cortante", 6, this,5)); 
		}else {
			this.habilidades.add(new Habilidade("Terremoto", 3, this,3)); 
			this.habilidades.add(new Habilidade("Arremeço de Pedregulho", 6, this,5)); 
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}


	public ArrayList<Habilidade> getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(ArrayList<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}
	
	public Inventário getInventario() {
		return inventario;
	}


	public void setInventario(Inventário inventario) {
		this.inventario = inventario;
	}

}
