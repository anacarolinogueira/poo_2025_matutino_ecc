
import java.util.ArrayList;

public class Principal {
	public static void main(String[]args) {
		ArrayList<String> disciplinas = new ArrayList<String>(); //c control espaco 
		disciplinas.add("Calculo II");
		disciplinas.add("Algebra Linear");
		disciplinas.add("Circuitos eletricos");
		disciplinas.add("Calculo III");
		
		System.out.println(disciplinas);
		
		System.out.println(disciplinas.get(2));// pega o item da posiçao 2 e mostra 
		
		disciplinas.set(3, "Calculo IV"); // pega o item da posiçao 3 e troca por Calculo IV
		System.out.println(disciplinas);
		
		for(int i = 0; i<disciplinas.size(); i++) { // .size se adapta ao tamanho do elemento
			System.out.println(disciplinas.get(i));
			
		}
	}
}
