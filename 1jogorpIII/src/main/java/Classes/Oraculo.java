package Classes;

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

public class Oraculo {
	public static void main(String [] args) {
		String t1 = "consult ('Oraculo.pl')";
		Query q1 = new Query(t1);
		System.out.println(t1 + "" + (q1.hasSolution() ? "Consulta ao oráculo iniciada!" : "Houve algum erro!"));
		String t2 = "habilidades(bolaDeFogo,fogo)";
		Query q2 = new Query(t2);
		System.out.println(t2 + " is " + (q2.hasMoreSolutions() ? "xesque" : "não xesque"));
		while(q2.hasMoreSolutions()) {
			Map <String, Term> s4 = q2.nextSolution();
			System.out.println("X = " + s4.get("X") + ", Y = " + s4.get("fogo"));
        }
      
	}
	
}
