import java.awt.Graphics;
import java.util.ArrayList;

public class Boss
{
	private int x,y;
	private boolean left=true;
	private boolean right=true;
	public static int bossLife;
        public  static ArrayList <EnemyFire> bomb;
	public Boss(int x,int y)
	{
		this.x=x;
		this.y=y;
		bossLife=20;
                bomb = new ArrayList< EnemyFire> ();
               
	}
	public void tick()
	{
		if(y<130)
		{
			y++;
		}
		else if(x<=170 && right==true)
		{
			x++;
                        if(x==95 || x==105 || x==125 || x==135 || x == 155 || x == 167)
                        {
                            bomb.add(new EnemyFire(x+130,y+81));
                        }
			if(x>170)
			{
				right=false;
				left=true;
			}
		}
		else if(x>=0 && left==true)
		{
			x--;
                        if(x==95-90 || x==105-90 || x==125-90 || x==135-90 || x == 155-90 || x == 167-90)
                        {
                            bomb.add(new EnemyFire(x+130,y+81));
                        }
			if(x<0)
			{
				right=true;
				left=false;
			}
		}

	}
	public void render(Graphics graphics)
	{
		graphics.drawImage(LoadImages.boss,x,y,280,80,null);
	}
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
        
}
