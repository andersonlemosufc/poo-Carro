import java.util.Scanner;

public class Principal{

	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){

		String help = "\t============= help =====================\n"+
					  "\tsoma _a _b: soma a e b\n"+
					  "\tsub _a _b: subtrai a e b\n"+
					  "\tmult _a _b: multiplica a e b\n"+
					  "\tdiv _a _b: divide a por b\n"+
					  "\tshow: mostra a quantidade de bateria\n"+
					  "\trecarga _n: aumenta a bateria em n unidade\n"+
					  "\tsair: sai do programa\n"+
					  "\t========================================\n";
		Calculadora calc = new Calculadora();
		calc.carga = 2;
		while(true){
			System.out.print("Digite um comando"+
						"(help para ver os comandos): ");
			String comando = sc.nextLine();
			if(comando.equals("help")){
				System.out.println(help);
			} else if(comando.equals("sair")){
				System.out.println("\tAté a próxima :)");
				break;
			} else {
				String c[] = comando.split(" ");

				// comando = "soma 5 235"
				// c = ["soma", "5", "235"];

				double a, b, resposta;
				switch(c[0]){
					case "soma":
						a = Double.parseDouble(c[1]);
						b = Double.parseDouble(c[2]);
						resposta = calc.soma(a,b);
						if(resposta == Calculadora.INFINITO){
							System.out.println("\tErro: sem bateria");
						} else {
							System.out.println("\t"+a+" + "+b+" = "+resposta);
						}
						break;
					case "sub":
						a = Double.parseDouble(c[1]);
						b = Double.parseDouble(c[2]);
						resposta = calc.sub(a,b);
						if(resposta == Calculadora.INFINITO){
							System.out.println("\tErro: sem bateria");
						} else {
							System.out.println("\t"+a+" - "+b+" = "+resposta);
						}
						break;
					case "mult":
						a = Double.parseDouble(c[1]);
						b = Double.parseDouble(c[2]);
						resposta = calc.mult(a,b);
						
						if(resposta == Calculadora.INFINITO){
							System.out.println("\tErro: sem bateria");
						} else {
							System.out.println("\t"+a+" x "+b+" = "+resposta);
						}
						break;
					case "div":
						a = Double.parseDouble(c[1]);
						b = Double.parseDouble(c[2]);
						resposta = calc.div(a,b);
						if(resposta == Calculadora.INFINITO){
							System.out.println("\tErro: sem bateria");
						} else if(resposta == Calculadora.MENOS_INFINITO) {
							System.out.println("\tImpossível dividir por zero!");
						} else {
							System.out.println("\t"+a+" / "+b+" = "+resposta);
						}
						break;
					case "show":
						System.out.println("\t"+calc.carga);
						break;
					case "recarga":
						int valorDaRecarga = Integer.parseInt(c[1]);
						calc.recarregar(valorDaRecarga);
						System.out.println("\tRecarga efetuada com sucesso.");
						break;
					default:
						//System.out.println("Sorry, try again :(");
						System.out.println("\tComando inválido.");
				}
			}
		}

	}
	
}
