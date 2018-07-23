package Respostas;

public class Pessoa {
	//Resposta 04
	private String nome;
	private int idade;
	private float peso;
	private float altura;
		
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return this.peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return this.altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void envenlhecer(int idade) {
		this.idade = idade;
		for(int i = 1; i<100; i++) {
			this.idade++;
		}
	}
	public void engordar() {
		
	}
	public void emagrecer() {
		
	}
	public void crescer(float altura) {
		for(int i = 1; i<100; i++) {
			if(this.idade < 21) {
				this.altura += 0.5;
				this.idade++;
			}
		}		
	}
}
