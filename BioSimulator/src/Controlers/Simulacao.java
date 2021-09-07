package Controlers;

import Models.Animais;

public class Simulacao {
	
	public static void Simular(int tempo) {
		int listlenght = 0;
		while(tempo !=0) {
		for(Animais i : ListControl.animais) {
			Animais j = ListControl.animais.get(listlenght);
			j.mover();
			listlenght++;
		}
		try {
		Thread.sleep(1000);
		} catch (InterruptedException ex) {
			System.out.println("Houve um erro");
		} finally {}
		tempo--;
		listlenght = 0;
		}
		
		ListControl.animais.clear();
		System.out.println("Todos os animais da simulação foram excluidos!");
		System.out.println("Faça sua escolha novamente");
	}

}
