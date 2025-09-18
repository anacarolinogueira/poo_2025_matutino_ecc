
public class Principal {
	public static void main (String[]args) {
		Livro l1 = new Livro();;
		l1.setTitulo("Bub");
		l1.setAutor("Robert");
		l1.setAnoPublicacao(2015);
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("Amtom");
		b1.setLivro(l1);
		
		System.out.println(b1.getNome());
		System.out.println(b1.getLivro().getTitulo());
		System.out.println(b1.getLivro().getAutor());
		System.out.println(b1.getLivro().getAnoPublicacao());
		System.out.println(b1.getLivro());
	}
}
