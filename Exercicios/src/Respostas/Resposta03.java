package Respostas;

public class Resposta03 {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		float base = 5;
		float altura = 2;
		
		retangulo.setBase(base);
		retangulo.setAltura(altura);
		
		float area = retangulo.calculaArea(base, altura);
		float perimetro = retangulo.calculaPerimetro(base, altura);
				
		System.out.println("Base: "+retangulo.getBase());
		System.out.println("Altura: "+retangulo.getAltura());
		if(base == altura) {
			System.out.println("�rea: "+area+", Valores de um quadrado");
			System.out.println("Per�metro: "+perimetro+", Valores de um quadrado");
		}else {
			System.out.println("�rea: "+area);
			System.out.println("Per�metro: "+perimetro);
		}
	}
}
