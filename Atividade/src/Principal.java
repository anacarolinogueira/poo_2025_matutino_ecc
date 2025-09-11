
public class Principal {
	
	public static void main(String[] args) {
		
		FuncionarioiCLT clt = new FuncionarioiCLT();
		clt.nome = "Molina";
		clt.cpf = "313212132";
		clt.salarioBase = 5000;
		
		System.out.println(clt.calcularSalario());
		
		FuncionarioComissionado comissionado = new FuncionarioComissionado();
		comissionado.nome = "Jose";
		comissionado.cpf = "5456456";
		comissionado.salarioBase = 3000;
		comissionado.comissao = 600;
		
		System.out.println(comissionado.calcularSalario());
		
		FuncionarioPJ pj = new FuncionarioPJ();
		pj.nome = "Maria";
		pj.cpf = "4564654";
		pj.salarioBase = 15000;
		
		System.out.println(pj.calcularSalario());
		
	}

}
