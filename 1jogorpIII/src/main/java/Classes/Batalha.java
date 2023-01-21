package Classes;

public class Batalha {
	private Personagem personagem;
	private Personagem inimigo;
	
	public Batalha(Personagem personagem, Personagem inimigo) {
		super();
		this.personagem = personagem;
		this.inimigo = inimigo;
	}
	
	public void lutar() {
		while(personagem.getVida() > 0 || inimigo.getVida() > 0 ) {
			this.mostrarStatus();
			personagem.getHabilidades().get(1).causarDano(inimigo);
			if(inimigo.getVida() <= 0) {
				System.out.println("voce venceu");
				break;
			}
			inimigo.atacar(personagem);
			if(personagem.getVida() <= 0) {
				System.out.println("voce perdeu");
				break;
			}
			
		}
		System.out.println(personagem.getNome() + " - " + personagem.getVida() );
		System.out.println(inimigo.getNome() + " - " + inimigo.getVida() );
	}
	
	private void mostrarStatus() {
		System.out.println(personagem.getNome()+" - vida: "+personagem.getVida());
		System.out.println(inimigo.getNome() + " - vida: "+inimigo.getVida() );
		
	}
}
