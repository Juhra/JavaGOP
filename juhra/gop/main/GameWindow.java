package juhra.gop.main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	/* This class handles the game window. Includes the height and width options and full screen mode */

	boolean fse = false;
	int fsm = 0;
	GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[1];
	
	public GameWindow(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	private void setfullscreen(){
		switch(fsm){
		case 0:
			System.out.println("No fullscreen");
			setUndecorated(false);
			break;
		case 1:
			setUndecorated(true);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case 2:
			setUndecorated(true);
			device.setFullScreenWindow(this);
			break;
		}
	}
		public void setFullscreen(int fsnm){
			fse = true;
			if(fsm <=2){
				this.fsm = fsnm;
				setfullscreen();
			}else{
				System.err.println("Error "+fsnm+" is not supported!");
		}
	}
}
