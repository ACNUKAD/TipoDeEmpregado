
public class UebMotors {
	public static void main (String args[]) {
		
		// aqui eu declaro as variáveis
		Carro c1, c2, c3;
		
		c1 = new Carro();   //reserva memória -> chamam de "INSTANCIAÇÃO"
		c2 = new Carro();
		c3 = new Carro();
		
		c1.marca = "Fiote";
		c1.modelo = "147 turbo";
		c1.combustivel = "gasolina";
		c1.ano = 1982;
		c1.finalplaca =1;
		c1.cor="azul";
		c1.preco = 82350;
		
		c2.marca ="vw";
		c2.modelo="fusca";
		c2.combustivel="alcool";
		c2.finalplaca =2;
		c2.ano=1980;
		c2.cor = "bege";
		c2.preco = 93725;
		
		c3.marca="ford";
		c3.modelo="chia";
		c3.combustivel ="gasolina";
		c3.ano =1985;
		c3.finalplaca=4;
		c3.cor="bordo";
		c3.preco=45012;
		
		c1.exibirAnuncio();
		c2.exibirAnuncio();
		c2.exibirAnuncio();
		
		
		
	}

}
