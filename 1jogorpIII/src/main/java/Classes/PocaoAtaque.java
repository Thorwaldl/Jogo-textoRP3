package Classes;

public class PocaoAtaque extends Pocao {
	public PocaoAtaque() {
		super();
	}

	public PocaoAtaque(String nome, int quantidade) {
		super(nome, quantidade);
	}

	public void utilizar(Personagem p) {
		super.utilizar(p);
		p.setAtaque(p.getAtaque() + 30);
		System.out.println("Aumentou " + p.getAtaque() + " de ataque!");
	}

}
