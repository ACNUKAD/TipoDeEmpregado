// vou declarar as variáveis e fazer a leitura

public class EmpregadoTeste {
	public static void main(String args[]) {

		Empregado c1, c2, c3;

		c1 = new Empregado(); // reservando a memória
		c2 = new Empregado();
		c3 = new Empregado();

		c1.nome = "Josequina";
		c1.cargo = "Neurologista";
		c1.salario = 45000;

		c2.nome = "Andrea";
		c2.cargo = "fisioterapeuta";
		c2.salario = 10830;

		c3.nome = "Juliana";
		c3.cargo = "Farmaceutica";
		c3.salario = 15780;
		
		System.out.println("Antes do aumento...");
		c1.exibirAnuncio();
		c2.exibirAnuncio();
		c3.exibirAnuncio();
		System.out.println("                ");
		
		System.out.println("...Depois do aumento...");
		System.out.println("-------------------------");
		c1.aumentarSalario(10.0);
		c2.aumentarSalario(5.0);
		c3.aumentarSalario(15.0);
		c1.exibirAnuncio();
		c2.exibirAnuncio();
		c3.exibirAnuncio();
		

		

	}
}
