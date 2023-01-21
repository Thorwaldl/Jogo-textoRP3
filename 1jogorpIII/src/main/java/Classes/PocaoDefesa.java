package Classes;

public class PocaoDefesa extends Pocao {
	public PocaoDefesa() {
		super();
	}

	public PocaoDefesa(String nome, int quantidade) {
		super(nome, quantidade);
	}

	public void utilizar(Personagem p) {
		super.utilizar(p);
		p.setDefesa(p.getDefesa() + 30);
		System.out.println("Aumentou " + p.getDefesa() + " de defesa!");
	}

}
