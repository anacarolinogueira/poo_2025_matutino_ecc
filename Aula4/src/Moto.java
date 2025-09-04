
public class Moto extends Automovel {
	public boolean temBau;
	
	public void temBau(boolean bau) {
		if (bau) {
			System.out.println("Tem bau");
		} else {
			System.out.println("Nao tem bau");
		}
	}
}
