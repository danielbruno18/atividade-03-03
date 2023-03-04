package daniel;

import java.util.Scanner;

public class InserirDadosPeloTeclado {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nome;
	
	System.out.println("Digite aqui o nome em seguida ENTER: ");
	nome= scanner.next();
	
	System.out.println("voce digitou: " + nome);
	
	
	//Entrada de numero
	int numero;
	System.out.println("Digite aqui o numero em seguida ENTER: ");
	numero= scanner.nextInt();
	System.out.println("você digitou:  " + numero);
	
	scanner.close();
	//Entrada de numero
		int numero2;
		System.out.println("Digite aqui o numero em seguida ENTER: ");
		numero= scanner.nextInt();
		System.out.println("você digitou:  " + numero);
		
		scanner.close();
	
	
}

}
