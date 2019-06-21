import java.awt.Graphics;

public class Explosion
{
	private int x;
	private int y;
	
	public Explosion(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void render(Graphics graphics)
	{
		//graphics.setColor(Color.white);
		graphics.drawImage(LoadImages.bangBang,x, y, 80, 57,null);
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
