package juhra.gop.main;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	/* This class handles spreadsheets, nothing fancy. */
	
	private BufferedImage spriteSheet;

	public SpriteSheet() {
		
	}

	public void setSpriteSheet(BufferedImage spriteSheet) {
		this.spriteSheet = spriteSheet;
	}
	
	public BufferedImage getTile(int xTile, int yTile, int width, int height){
		BufferedImage sprite = spriteSheet.getSubimage(xTile, yTile, width, height);
		return sprite;
	}
	
}
