package exemplos;

public class Exemplo1 {
	
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		
		//tipos primitivos de numeros inteiros
		int numero1 = 30; // int cabe em um long ---- padrao do java
		long numero2 = 10L; // long n�o cabe em um int
		
		//tipos primitivos de numeros decimais
		float numero3 = 33.5f;
		double numero4 = 51.2; // padrao do java
		
		// tipo primitivo de caractere
		char letra = 'b'; // caractere simples
		
		// tipo primitivo logico
		boolean ehMaior = true; 
		
		// Classe que representa as strings
		String nome = "Weskley"; // cadeia de caracteres
		
		int soma = numero1 + (int) numero2;
		
		if(numero1 < 3) {
			System.out.println("parab�ns"); //syso + Ctrl Espa�o + Enter
		}else if(numero1 < 7 && numero2 > 15) {
			//todo
		}else {
			//todo
		}
		
		switch(nome) {
			case "jose":
				System.out.println("jose");
				break;
			case "pedro":
				System.out.println("pedro");
				break;
			default:
				System.out.println("outro nome");
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		while (numero1 >= 20) {
			System.out.println(numero1);
			numero1--;
		}
		
		System.out.println(soma);
		
	}
}
