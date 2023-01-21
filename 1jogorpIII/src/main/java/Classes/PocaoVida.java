package Classes;

public class PocaoVida extends Pocao {

	public PocaoVida() {
		super();
	}

	public PocaoVida(String nome, int quantidade) {
		super(nome, quantidade);
	}

	public void utilizar(Personagem p) {
		super.utilizar(p);
		p.setVida(p.getVida() + 30);
		System.out.println("Aumentou " + p.getVida() + " de vida!");
	}

}
