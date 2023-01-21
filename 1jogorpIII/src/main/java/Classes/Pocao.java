package Classes;

public abstract class Pocao {
	private String nome;
	private int quantidade;

	public Pocao(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public Pocao() {

	}

	public void utilizar(Personagem p) {
		System.out.println("Utilizou a poção: " + nome);
	

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
