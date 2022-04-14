package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Score {
	
	Timer time;

	public Score() {
		
		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {

			if(Var.verloren == false && Var.pause == false){
				Var.score += Var.scorecount;
			}
				
			}
		}, 0, 20);
		
	}

}
