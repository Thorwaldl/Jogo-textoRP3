package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 

public class SavePocao {

	 public static void salvar(Invent�rio i) throws IOException {
		 
	        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("SavePo��o"));
	        
	        buffWrite.append(i.getPo��oAtaque() + "\n");
	        buffWrite.append(i.getPo��oDefesa() + "\n");
	        buffWrite.append(i.getPo��oVida() + "\n");
	        buffWrite.append(i.getPo��oVelocidade() + "\n");

	        buffWrite.close();
	        
	        
	    }
	
	public void carregar(Invent�rio i) throws IOException {
    BufferedReader buffRead = new BufferedReader(new FileReader("SavePo��o"));
    String linha = "";
    
    
    i.setPo��oAtaque(Integer.parseInt(buffRead.readLine()));
    i.setPo��oDefesa(Integer.parseInt(buffRead.readLine()));
    i.setPo��oVida(Integer.parseInt(buffRead.readLine()));
    i.setPo��oVelocidade(Integer.parseInt(buffRead.readLine()));


	}
}
