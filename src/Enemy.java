import java.awt.Graphics;


public class Enemy
{
	private int x;
	private int y;
	public Enemy(int x,int y)
	{
	    this.x=x;
	    this.y=y;
                
	}
	public void tick()
	{       
	    y+=3;
	}
        
	public void render(Graphics graphics)
	{
            //System.out.println("x = "+this.x);
            if(this.x%2==0)
            {
	        graphics.drawImage(LoadImages.enemy,x, y, 70, 50,null);
            }
            else
            {
                graphics.drawImage(LoadImages.enemy2,x, y, 80,60,null);
            }
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
