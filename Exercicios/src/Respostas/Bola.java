package Respostas;

public class Bola {
	// Resposta 01
	private String cor;
	private float circunferencia;
	private String material;
	
	public String getCor() {
		return cor;
	}
	
	public float getCircunferencia() {
		return circunferencia;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setCircunferencia(float circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void trocaCor(String cor) {
		this.cor = cor;
	}
	
	public String mostraCor() {
		return this.cor;
	}
	
	@Override
	public String toString() {
		return "Bola: \n"
				+ "cor: "+this.cor+"\n "
				+ "circunferencia: "+this.circunferencia+"\n"
				+ "material: "+this.material;
	}
}
