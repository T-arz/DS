package Models;
import java.lang.Math;

public class Animais {
	public float[] pos = {0.0f , 0.0f};
	public final String nome;
	public float movspeed = 0;
	
	Animais(String nome , float x, float y) {
		this.nome = nome;
		this.pos[0] = x;
		this.pos[1] = y;
		
		
	}
	public void mover(){
			double j = Math.random();
			double k = Math.random();
			if(j < 0.5) {
				if(k < 0.5) {
					pos[0] = pos[0] + movspeed;
				}else {
					pos[0] = pos[0] - movspeed;
				}
			}else if(j>0.5) {
				if(k < 0.5) {
					pos[1] = pos[1] + movspeed;
				}else {
					pos[1] = pos[1] - movspeed;
				}
			}
		System.out.println(nome + " Se moveu até :" + pos[0] + " , "+ pos[1]);
	}
	

}

