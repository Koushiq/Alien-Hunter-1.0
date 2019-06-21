import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener
{
	private int x;
	private int y;
	private boolean left,right,up,down,fire;
	private long tempTime;
	private long delay;
	public static int health;
	public static int count;
        private Display display;
	public Player(int x,int y) 
	{
		this.x=x;
		this.y=y;
	}
	public void init()
	{
		//if(GameManager.flag==0)
               // {
		 Display.jframe.addKeyListener(this);
                    
		//}
		tempTime= System.nanoTime();
		delay = 100;
		health=3;
		count=0;
	}
	public void tick()
	{
		if(!(health<=0)) 
		{
		   if(left)
	   	   {
			  // System.out.println("lx"+x);
			  if(x>=-11)
			  {
			    	x-=3;
				   if(x<-11)
				   {
				    	x=-11;
				   }
			  }
		}
		if(right)
		{
			//System.out.println("rx"+x);
			if(x<=392)
			{
			   x+=3;
			   if(x>=392)
			   {
				   x=392;
			   }
			}
		}
		if(up)
		{
			//System.out.println("uy"+y);
			if(y>=97)
			{
				y-=3;
				if(y<97)
				{
					y=97;
				}
			}
			
		}
		if(down)
		{
			//System.out.println("dy"+y);
			if(y<=445+50)
			{
				y+=3;
				if(y>445+50)
				{
					y=445+50;
				}
			}
		}
		if(fire)
		{
			long breaks = (System.nanoTime()-tempTime)/1000000;
			if(breaks>delay)
			{
				GameManager.bullet.add(new Bullet(x+22,y));
				tempTime= System.nanoTime();
				this.count++;
			}
			
		}
	}
	}
	public void render(Graphics graphics)
	{
		if(!(health<=0))
		{ 
			graphics.drawImage(LoadImages.player,x,y,80,80,null);
		}
	}
	public void keyPressed(KeyEvent e)
	{
		int source = e.getKeyCode();
		if(source == KeyEvent.VK_LEFT)
		{
			left = true; 
		}
		if(source==KeyEvent.VK_RIGHT)
		{
			right=true;
		}
		if(source==KeyEvent.VK_UP)
		{
			up=true;
		}
		if(source==KeyEvent.VK_DOWN)
		{
			down=true;
		}
		if(source==KeyEvent.VK_Z)
		{
			fire=true;
		}
		
	}
	public void keyReleased(KeyEvent e)
	{
		int source = e.getKeyCode();
		if(source == KeyEvent.VK_LEFT)
		{
			left = false; 
		}
		if(source==KeyEvent.VK_RIGHT)
		{
			right=false;
		}
		if(source==KeyEvent.VK_UP)
		{
			up=false;
		}
		if(source==KeyEvent.VK_DOWN)
		{
			down=false;
		}
		if(source==KeyEvent.VK_Z)
		{
			fire=false;
			
		}
		
	}
	public void keyTyped(KeyEvent e)
	{
		
	}
	public int getX()
	{
		//System.out.println(this.x);
		return this.x;
	}
	public int getY()
	{
		
		return this.y;
	}
	
	public void setHealth(int health)
	{
		this.health=health;
	}
	public static int getCount()
	{
		return count;
	}
        public Display getDisplay()
        {
            return this.display;
        }
}
