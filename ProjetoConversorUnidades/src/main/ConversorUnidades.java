package main;
import java.util.Scanner;

public class ConversorUnidades {
	
	public static void main(String[] args) {
		
		//TEXTO DE EXPOSIÇÃO DO PROGRAMA
		Scanner scan = new Scanner(System.in);
		System.out.println("*** Conversor de unidades ***\n");
		System.out.println("1- Celsius para Fahrenheit \n2- Fahrenheit para Celsius \n3- Quilômetros para milhas \n4- Horas para minutos\n");
		System.out.print("O que deseja converter? Tipo da conversão: ");
		int conversao = scan.nextInt();
		
		//VARIAVEIS
		double calc;
		boolean condicao = true;
		
		//LOOP PRINCIPAL
		while(condicao != false) {
			
			//SWITCH COM 4 OPÇÕES DE CONVERSÃO
			switch(conversao) {
			case(1)://DE CELSIUS PARA FAHRENHEIT
				System.out.print("Digite a temperatura em Celsius: ");
				double tempC = scan.nextDouble();
				calc = (tempC * 9/5) + 32;
				System.out.printf("%.2f graus Celsius em Fahrenheit é: %.2f%n",tempC,calc);
				break;
			case(2)://FAHRENHEIT PARA CELSIUS
				System.out.print("Digite a temperatura em Fahrenheit: ");
				double tempF = scan.nextDouble();
				calc = (tempF - 32)/1.8;
				System.out.printf("%.2f graus Fahrenheit em Celsius é: %.2f%n",tempF,calc);
				break;
			case(3)://QUILOMETROS PARA MILHAS
				System.out.print("Digite a distância em quilômetros: ");
				double distQ = scan.nextDouble();
				calc = distQ/1.6093;
				System.out.printf("%.2f quilômetros em milhas é: %.2f%n",distQ,calc);
				break;
			case(4)://HORAS PARA MINUTOS
				System.out.print("Digite o valor em horas: ");
				float horas = scan.nextFloat();
				calc = horas*60;
				System.out.printf("%.2f horas em minutos é: %.2f%n",horas,calc);
				break;
			}
			
			//CONDIÇÃO QUE VERIFICA SE O NUMERO DIGITADO ESTA ENTRE 1 E 4
			if(conversao < 1 || conversao > 4) {
				System.out.println("Opção inválida\n");
			}
			
			//BLOCO QUE PERGUNTA AO USUARIO SE QUER FAZER OUTRA CONVERSÃO OU NÃO
			System.out.print("Deseja fazer outra conversao? 1- SIM/ 2- NAO: ");
			int deci = scan.nextInt();
			System.out.println("");
				if(deci == 1) {//FAZ UMA NOVA CONVERSÃO
					System.out.println("1- Celsius para Fahrenheit \n2- Fahrenheit para Celsius \n3- Quilômetros para milhas \n4- Horas para minutos\n");
					System.out.print("O que deseja converter? Tipo da conversão: ");
					conversao = scan.nextInt();
				}else {//SAI DO LOOP WHILE FINALIZANDO O PROGRAMA
					condicao = false;
					System.out.println("Fim do conversão");
				}
		}
		scan.close();
	}
}
