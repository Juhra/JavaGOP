package juhra.gop.main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class loadImageFrom {
	
	/* This class handles image loading, can use it for spritesheets. */

	public static BufferedImage LoadImageFrom(Class<?> classfile, String path) {
		URL url = classfile.getResource(path);
		BufferedImage img = null;
		
		try{
			img = ImageIO.read(url);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return img;
	}

}
