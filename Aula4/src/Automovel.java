
public class Automovel {
	
	private String marca;
	private String modelo;
	private int ano; // proyeger os atributos encapsulamento quais coceitos estao aplicados na classe
	
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

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

