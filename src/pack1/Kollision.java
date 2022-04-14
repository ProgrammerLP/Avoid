package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Kollision {

	Timer time;
	private int temp = 0;

	public Kollision() {

		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.verloren == false && Var.pause == false) {

					for (int i = 0; i < Var.gegnerY.length; i++) {

						if (Var.gegnerY[i] >= Var.y && Var.gegnerY[i] <= Var.y + Var.playerSize
								&& Var.r[i] == Var.playerPos) {

							if (Var.leben > 1) {
								Var.leben--;
								Var.gegnerY[i] = -1250 - (Gui.screenheight - Var.gegnerY[i]);
								System.out.println("Leben verloren");
								Var.drawKollision = true;
							} else {
								Var.leben--;
								Var.verloren = true;
								System.out.println("Verloren");
								Var.drawKollision = true;
							}

						}

					}

				}

				if (Var.drawKollision && temp < 20) {
					temp++;

				} else if (Var.drawKollision && temp >= 20) {
					temp = 0;
					Var.drawKollision = false;
				}

			}
		}, 0, 8);

	}

}
