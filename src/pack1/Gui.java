package pack1;

import javax.swing.JFrame;

public class Gui {
	
	static JFrame jf;
	static Draw draw;
	static int screenwidth = 500, screenheight = 700; 

	public Gui() {
		
		jf = new JFrame();
		jf.setSize(screenwidth,screenheight);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.addKeyListener(new KeyHandler());
		
		draw = new Draw();
		draw.setBounds(0,0,screenwidth,screenheight);
		draw.setVisible(true);
		jf.add(draw);
		
		jf.setVisible(true);
		
	}

}
