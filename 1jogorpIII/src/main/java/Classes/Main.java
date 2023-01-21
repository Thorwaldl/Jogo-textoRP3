package Classes;

public class Main {

	public static void main(String[] args) {
		Jogador j = new Jogador("Jogador", Elemento.FOGO,10,2,1,0,1,1);
		Inimigo inimigo = new Inimigo("Inimigo", Elemento.FOGO,10,2,1,0,1,1);
		
		Batalha b = new Batalha(j,inimigo);
		
		b.lutar();
	}

}
