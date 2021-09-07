package views;

import java.util.Scanner;
import Controlers.Simulacao;
import Controlers.ListControl;
import Models.Anfibio;
import Models.Animais;
import Models.Passaro;
import Models.Peixe;

public class Console {
	
	static Scanner read;
	static int ongoing = 0;
	
	Console(){
		
	}
	
	public static void PlayConsole() {
		System.out.println("Ol� bem vindo a BioSim , uma simula��o de animais");
		while (ongoing == 0) {
		int escolhaA , time;
		int especie;
		float x , y;
		String nome;
		Animais animal;
		
		read = new Scanner(System.in);
		
		System.out.println("Escolha uma das a��es");
		System.out.println("1-Criar um Animal   2-Simular   3- Sair");
		escolhaA = read.nextInt();
		switch (escolhaA) {
		
		case 1:
			System.out.println("Voc� escolheu criar um animal! Escolha sua esp�cie.");
			System.out.println("1-Peixe  2-Anfibio  3-Passaro");
			especie = read.nextInt();
			System.out.println("Escolha seu nome!");
			nome = read.next();
			System.out.println("Escolha a posi��o X dele");
			x = read.nextInt();
			System.out.println("Escolha a posi��o Y dele");
			y = read.nextInt();
			System.out.println("Pronto animal criado!");
			if(especie == 1) {
				animal = new Peixe(nome , x , y);
			} else if(especie == 2) {
				animal = new Anfibio(nome , x , y);
			} else {
				animal = new Passaro(nome , x ,y);
			}
			ListControl.animais.add(animal);
			break;
		case 2:
			System.out.println("Determine quanto tempo em segundos ter� a simula��o");
			time = read.nextInt();
			Simulacao.Simular(time);
			break;
		case 3:
			ongoing = 1;
			break;
		}
	}
	}

}
