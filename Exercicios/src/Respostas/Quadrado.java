package Respostas;

public class Quadrado {	
	//Resposta 02	
	private float lado;
	
	public float getLado() {
		return lado;
	}
	
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public void mudaLado(Float lado) {
		this.lado = lado;
	}
	
	public Float mostraLado() {
		return this.lado;
	}
	
	public Float calculaArea(Float lado) {
		Float area = lado * lado;
		return area;
	}
}
