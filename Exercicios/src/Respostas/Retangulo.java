package Respostas;

public class Retangulo {
	//Resposta03
	private float base;
	private float altura;
	
	public float getBase() {
		return this.base;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setBase(float base) {
		this.base = base;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void mudaBase(Float base) {
		this.base = base;
	}
	
	public void mudaAltura(Float altura) {
		this.altura = altura;
	}
	
	public float mostraBase() {
		return this.base;
	}
	
	public float mostraAltura() {
		return this.altura;
	}
	
	public float calculaArea (float base, float altura) {
		float area = base * altura;
		return area;
	}
	
	public float calculaPerimetro(float base, float altura) {
		float perimetro = 2*(base+altura);
		return perimetro;
	}
}
