import java.util.Scanner;

public class MainClass {
	static Scanner read = new Scanner(System.in);

	public static void main(String [] args) {
		int menu = 0;
		int anos ;
		
		while(menu == 0) {
			System.out.println("Para avaliar seu n�vel por favor insira quantos anos de estudo");
			anos = read.nextInt();
			if (anos <= 1) {
				System.out.println("Seu nivel � iniciante");
			}else if (anos <= 3) {
				System.out.println("Seu nivel � intermedi�rio");
			}else if (anos <= 6) {
				System.out.println("Seu nivel � avan�ado");
			}else {
				System.out.println("Voc� � um mestre jedi");
			}
			
			System.out.println("Caso queira continuar digite 0 , caso n�o qualquer outra coisa");
			menu = read.nextInt();
		}
	}
}
