public class Calculadora{

	public int carga;
	public static final double INFINITO = 999999999;
	public static final double MENOS_INFINITO = -999999999;





	public void recarregar(int valorDaRecarga){
		this.carga += valorDaRecarga;
		if(this.carga > 5) this.carga = 5;
	}

	public double sub(double a, double b){
		return this.soma(a,-b);
	}	

	public double soma(double a, double b){
		if(this.carga > 0){
			this.carga--;
			return a+b;
		} else {
			return INFINITO;
		}
	}

	public double mult(double a, double b){
		if(this.carga > 0){
			this.carga--;
			return a*b;
		} else {
			return INFINITO;
		}
	}

	public double div(double a, double b){
		if(this.carga > 0){
			this.carga--;
			if(b==0) return MENOS_INFINITO;
			else return a/b;
		} else {
			return INFINITO;
		}
	}

}