// vou declarar os atributos e os médotos

public class Empregado {

	// atributos
	String nome;
	String cargo;
	double salario;

	void exibirAnuncio() {
		System.out.println("nome: " + nome);
		System.out.println("cargo: " + cargo);
		System.out.println("salario: R$ " + salario);
		System.out.println("Imposto: "+calcularImposto());
		System.out.println("---------------------------");

	}

	// metodo

	void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}

	double calcularImposto() {
		double imposto;

		if (salario <= 2000) {
			imposto = 0;
		}

		else if (salario > 2000 && salario <= 4500) {
			imposto = salario - salario * 0.1; // 10% de imposto
		}
		else {
			imposto = 1200; // -1200
		}

		return imposto;

	}

}
