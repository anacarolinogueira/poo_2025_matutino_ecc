
public class Principal {
	
	public static void main (String []args) {
		
		Carrol c1 = new Carrol();
		c1.setMarca("Fiat");
		c1.setModelo("pulse");
		c1.setAno(2026);
		
		Carrol c2 = new Carrol();
		c2.setMarca("Fiat");
		c2.setModelo("pulse");
		c2.setAno(2026);
		
		System.out.println(c1.getClass());
		System.out.println(c2.getClass());
	}
	
}

