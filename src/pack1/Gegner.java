package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Gegner {
	Timer time;
	public static int temp = 150;

	public Gegner() {

		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Var.verloren == false && Var.pause == false){
					
					for(int i = 0; i < Var.gegnerY.length; i++){
						Var.gegnerY[i] += Var.gegnerSpeed;
						
						if(Var.gegnerY[i] >= Gui.screenheight){
							Var.gegnerY[i] = -1250;
							Var.r[i] = (int)(Math.random()*3)+1;
						}

					}
					
				}

				
				
			}
		}, 0, 6);
		
	}
	
	public static void reset(){
		
		for(int i = 0; i< Var.gegnerY.length; i++){
			Var.gegnerY[i] = -temp;
			temp += 150;
		}
		temp = 0;
	}

}
