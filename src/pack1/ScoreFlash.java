package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class ScoreFlash {
	
	Timer time;
	static boolean blink = false;

	public ScoreFlash() {
		
		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(!blink){
					blink = true;
				}else if(blink){
					blink = false;
				}
				
			}
		}, 0, 400);
		
	}

}
