package Classes;

public class PocaoVelocidade extends Pocao {
	public PocaoVelocidade() {
		super();
	}

	public PocaoVelocidade(String nome, int quantidade) {
		super(nome, quantidade);
	}

	public void utilizar(Personagem p) {
		super.utilizar(p);
		p.setVelocidade(p.getVelocidade() + 5);
		System.out.println("Aumentou " + p.getVelocidade() + " de velocidade!");
	}

}
