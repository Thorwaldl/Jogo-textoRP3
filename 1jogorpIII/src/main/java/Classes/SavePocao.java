package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 

public class SavePocao {

	 public static void salvar(Inventário i) throws IOException {
		 
	        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("SavePoção"));
	        
	        buffWrite.append(i.getPoçãoAtaque() + "\n");
	        buffWrite.append(i.getPoçãoDefesa() + "\n");
	        buffWrite.append(i.getPoçãoVida() + "\n");
	        buffWrite.append(i.getPoçãoVelocidade() + "\n");

	        buffWrite.close();
	        
	        
	    }
	
	public void carregar(Inventário i) throws IOException {
    BufferedReader buffRead = new BufferedReader(new FileReader("SavePoção"));
    String linha = "";
    
    
    i.setPoçãoAtaque(Integer.parseInt(buffRead.readLine()));
    i.setPoçãoDefesa(Integer.parseInt(buffRead.readLine()));
    i.setPoçãoVida(Integer.parseInt(buffRead.readLine()));
    i.setPoçãoVelocidade(Integer.parseInt(buffRead.readLine()));


	}
}
