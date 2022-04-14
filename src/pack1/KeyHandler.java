package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {

		if (Var.verloren == false) {
			if (Var.pause == false) {

				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (Var.playerPos > 1) {
						Var.playerPos--;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (Var.playerPos < 3) {
						Var.playerPos++;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					Var.gegnerSpeed = 3;
					Var.scorecount = 1.5;
				}

			}
		}
		
		if(Var.verloren){
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
				Var.verloren = false;
				Gegner.reset();
				Var.leben = 3;
				Var.score = 0;
				Var.gegnerSpeed = 2;
			}
		}
		
		if(Var.verloren == false){
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
				if(Var.pause == false){
					Var.pause = true;
				}else if(Var.pause){
					Var.pause = false;
				}
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(Var.verloren == false){
			if(e.getKeyCode() == KeyEvent.VK_UP){
				Var.gegnerSpeed = 2;
				Var.scorecount = 1;
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
