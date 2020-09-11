
// Aqui vou declarar a estrutura do tipo CARRO

public class Carro {
	
	//atributos
	String marca;
	String modelo;
	int ano;
	int finalplaca;
	String cor;
	String combustivel;
	float preco;
	
	//metodos exibir anuncio
	
	void exibirAnuncio(){
		System.out.println("OFERTA IMPERDIVEL");
		System.out.println(marca+"/"+modelo);
		System.out.println("Ano: "+ano+"Final da placa: "+finalplaca);
		System.out.println(cor);
		System.out.println(preco);
		System.out.println("------------------------");

	//2º metodo calcular o IPVA
	// 3% do valor do carro
	
	float calcularIPVA(){
		float ipva;
		
		ipva = preco *0.03f;
		return ipva;
		
	}
		
	
		
		
		
		
		
	}
	
}
