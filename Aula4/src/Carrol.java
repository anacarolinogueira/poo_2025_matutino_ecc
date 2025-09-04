
public class Carrol extends Automovel {
	public boolean temArcondicionado;
	
	public void ligar() { // metodo com a mesma assinatura public void mesmsa assinatura ligar()
		super.ligar();//ele vai executar a do automovel e vai continuar a executar
		System.out.println("Carro ligado!");
	}
}
