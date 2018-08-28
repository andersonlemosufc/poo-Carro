public class Carro{
	
	public String marca; 
	
	public int ano;
	public double velocidade;
	public static int qtdDeCarros = 3;

	public void acelerar(){
		this.velocidade += 10;
	}
	public void parar(){
		this.velocidade = 0;
	}
	public void frear(){
		this.velocidade -= 10;
	}
	
	public static int f(){
		return 12;
	}
}

/**
tem: marca, ano, velocidade
faz: acelera, para, frear
*/
