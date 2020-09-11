// vou declarar as variáveis e fazer a leitura

public class EmpregadoTeste {
	public static void main (String args[]) {
	
	Empregado c1,c2,c3;
	
	c1 = new Empregado(); // reservando a memória
	c2 = new Empregado();
	c3 = new Empregado();
	
	c1.nome = "Josequina";
	c1.cargo ="Neurologista";
	c1.salario =45000;
	
	c2.nome="Andrea";
	c2.cargo="fisioterapeuta";
	c2.salario=10830;
	
	c3.nome="Juliana";
	c3.cargo="Farmaceutica";
	c3.salario=15780;
	
	c1.exibirAnuncio();
	c2.exibirAnuncio();
	c3.exibirAnuncio();
	
	
	}
}
