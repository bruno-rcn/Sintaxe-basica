
public class TestaVariavel {

	public static void main(String[] args) {
		
		// Tipo inteiro 
		
		int idade = 10;
		System.out.println(idade);
		
		idade += 20;
		System.out.println("a idade após a soma é: " + idade);
		
		
		// Tipo flutuante
		double salario = 1250.70;
		System.out.println("o valor do meu salario é: " + salario);
		
		double divisao = 5 / 2; // numero int por numero int o resultado é int
		System.out.println(divisao);
		
		double outraDivisao = 5.0 / 2;
		System.out.println(outraDivisao);
		
		// Conversao
		double valor1 = 120.70;
		int valor2 = (int) valor1;
		System.out.println("valor 1: " + valor1);
		System.out.println("valor 2: " + valor2);
	}
}
