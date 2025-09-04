
public class Principal {
	
	public static void main (String []args) {
		
		Carrol c1 = new Carrol();
		c1.marca = "Fiat";
		c1.modelo = "pulse";
		c1.ano = 2026;
		c1.ligar(false);
		
		Moto m1 = new Moto(); // criar objeto em java sempre new o nome do parametro e paretese
		m1.marca = "Kawasaki";
		m1.modelo = "Nao sei";
		m1.ano = 2019;
		m1.temBau(true);
	}
	
}
