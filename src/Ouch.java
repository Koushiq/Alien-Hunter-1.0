import java.awt.Graphics;

public class Ouch
{
	private int x;
	private int y;
	
	public Ouch(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void render(Graphics graphics)
	{
		//graphics.setColor(Color.white);
		graphics.drawImage(LoadImages.ouch,x, y, 80, 57,null);
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
