package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeitorBeta1 {

	public String lerArquivo(String string) throws IOException {
		String texto,tudo = "";		
		FileReader fr = new FileReader(string);
		BufferedReader ler = new BufferedReader(fr);
		texto = ler.readLine();
		
		while(texto!=null) {
			tudo=tudo+texto;
			texto = ler.readLine();
		}
		
		/*String caracter[] = tudo.split(" ");
		for (int i = 0; i < caracter.length; i++) {
			System.out.println(caracter[i]);
		}*/
		ler.close();
		return tudo;

	}
	
	
	
	
}
