package listani;

import java.util.Scanner;
import java.util.ArrayList;

class MainClass{
  
  	static Scanner read = new Scanner(System.in);
  	static ArrayList<Animal> animais = new ArrayList();

  	public static void main(String[] args) {
    
		Animal animal;
		int menu = 0;
		
		while(menu == 0){
		animal = new Animal();
		
		System.out.println("Insira a esp�cie do animal:");
		animal.especie = read.next();
		System.out.println("Insira a ra�a do animal:");
		animal.ra�a = read.next();
		System.out.println("Insira o peso do animal:");
		animal.peso = read.nextFloat();
		System.out.println("Insira a cor do aniaml:");
		animal.cor = read.next();


		animais.add(animal);

		System.out.println("Deseja continuar? 0 para sim , qualquer outro para n�o.");
		menu = read.nextInt();
		}

		System.out.println("Esp�cie\tRa�a\tPeso\tCor");
		for(int i = 0; i < animais.size(); i++){
		System.out.println(animais.get(i).especie +"\t"+ animais.get(i).ra�a +"\t"+ animais.get(i).peso  +"\t"+ animais.get(i).cor);
		}
	}
}