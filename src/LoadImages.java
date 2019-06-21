import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadImages
{
	public static BufferedImage image[]= new BufferedImage[3];
	public static BufferedImage player,enemy,enemy2,bangBang,ouch,boss,healthfull,healthhalf,healthquater,healthempty,boom;
	public static void init()
	{
		
		image[0]=imageLoader("/pics.jpg");
		image[1]=imageLoader("/pics2.jpg");
		image[2]=imageLoader("/pics3.jpg");
		player = imageLoader("/players.png");
		enemy=imageLoader("/ufos.png");
		bangBang=imageLoader("/bangbang.png");
		ouch=imageLoader("/ouch.png");
		boss=imageLoader("/boss.png");
                healthfull=imageLoader("/healthfull.png");
                healthhalf=imageLoader("/healthhalf.png");
                healthquater=imageLoader("/healthquater.png");
                healthempty=imageLoader("/healthempty.png");
                enemy2=imageLoader("/enemy2.png");
                boom=imageLoader("/boom.png");
	}
	
	public static BufferedImage imageLoader(String path)
	{
		try 
		{
			return ImageIO.read(LoadImages.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
}
