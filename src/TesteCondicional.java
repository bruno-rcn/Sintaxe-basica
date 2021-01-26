
public class TesteCondicional {

	public static void main(String[] args) {
		
		int idade = 15;
		int quantidadePessoa = 1;
		
		if (idade >= 18 || quantidadePessoa >= 2) {
			System.out.println("Você tem mais de 18 anos ou está acompanhado. Seja bem vindo!");
		} 
		else {
			System.out.println("Voê tem menos de 18 anos. Não pode entrar!");
		}
	}

}
