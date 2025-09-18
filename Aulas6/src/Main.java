
public class Main {
	public static void main(String[] args) {
		Aluno1 a1 = new Aluno1();
		a1.setNome("José da Silva");
		a1.setRa("123455678");


		Endereco e1 = new Endereco(); // criando um objeto
		e1.setCep("73100570");
		e1.setLogradouro("Quadra 4");
		e1.setNumero(4);

		a1.setEndereco(e1); // o endereço do a1 e o e1
		System.out.println(a1.getNome());
		System.out.println(a1.getEndereco().getCep());
	}
}
