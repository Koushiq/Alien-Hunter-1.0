import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Bullet
{
	private int x;
	private int y;
	private final int speed;
	public Color arrColor[]= {Color.red,Color.green,Color.blue};
	public int index=0;
	
	public Bullet(int x,int y)
	{
		this.x=x;
		this.y=y;
		speed =9;
	}
	public void tick()
	{
		y-=speed;
	}
	public void render(Graphics graphics)
	{
		    if(Player.getCount()<=30)
		    {
		       graphics.setColor(Color.MAGENTA);   	  
		    }
		    else
		    {
		    	graphics.setColor(arrColor[index]);
		    	index++;
		    	index=index%3;
		    }
                    
		    graphics.fillRect(x, y, 5, 10);
                    
	}
	public int getY()
	{
		return this.y;
	}
	public int getX()
	{
		return this.x;
	}
	
}
