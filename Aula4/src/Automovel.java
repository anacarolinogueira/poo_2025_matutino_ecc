
public class Automovel {
	
	public String marca;
	public String modelo;
	public int ano;
	
	public void ligar() {// metodo com a mesma assinatura public void mesmsa assinatura ligar()
	System.out.println("Automovel ligado!");
	
	}
	
	public void ligar(boolean usouAfogador) { 
		if(usouAfogador) {
			System.out.println("Automovel ligado");
		} else {
			System.out.println("Automovel afogado?");
		}
	}
}

