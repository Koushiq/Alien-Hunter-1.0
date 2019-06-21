import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;

public class GameManager implements KeyListener
{
	public static int flag;
	private Player player;
        public static ArrayList <Bullet> bullet;
	private ArrayList <Enemy> enemies;
	public  ArrayList <Explosion> explosion;
	private Ouch ouch;
	private long tempTime;
	private long delay;
	public static int health;
	public static long score;
	public long delta;
	private boolean bossIsAlive;
	private Boss boss;
        private Health healthImg;
        private long killCount;
        private int maxLevel;
	public GameManager()
	{}
	public void init()
	{
                maxLevel=0;
                killCount=0;
                GameSetup.ImageIndex=0;
                Display.jframe.addKeyListener(this);
                healthImg= new Health(0,99);
		boss = new Boss(90, 90);
		bossIsAlive=false;
		flag=0;
		score=0;
		player = new Player((GameSetup.gameWidth+60)/2 - 50,GameSetup.gameHeight+90);
		player.init();
		bullet = new ArrayList<Bullet>();
		enemies = new ArrayList <Enemy>();
               
		explosion = new ArrayList<Explosion>();
		tempTime = System.nanoTime();
		delay = 1000 ;
		health=player.health;
		delta= System.nanoTime();
	}
	public void tick() 
	{
            //game over if kills over 150
             if(killCount>=70)
                    {
                        health=0;
                        if(health<=0)
				{
				    enemies.removeAll(enemies);
				    bullet.removeAll(bullet);
				    explosion.removeAll(explosion);
			            player.setHealth(0);
                                    // update score if grater than prev score
                                    String username = Main.menu.getUserName();
                                    maxLevel=GameSetup.ImageIndex + 1;
                                    Main.db.checkScore(score,username,killCount,maxLevel);
                                    bossIsAlive=false;
                                    Boss.bossLife=-1;
                                    			           
				}
                    }
		// Spawning boss is a certain score is made 
		if(score>=60 && Boss.bossLife>=0)
		{
			bossIsAlive=true;
			boss.tick();
		}
		player.tick();    // bullet object created if fire is pressed !
		for(int i=0;i<bullet.size();i++)     // bullets are ticked if created 
		{
			bullet.get(i).tick();
			if(bullet.get(i).getY()<=105)
			{
				bullet.remove(i);
				--i;
			}
		}
		long breaks = (System.nanoTime()-tempTime ) / 1000000;
		if(breaks>delay)
		{
			for(int i=0;i<1;i++)
			{
				   Random rand = new Random();
				   int randX = rand.nextInt(392);
				   if(randX<-11)
				   {
					   randX=11;
				   }
				   if(randX>392)
				   {
					   randX=392;
				   }
				   if(health>0 && bossIsAlive==false)
				   {
                                           //if(randX%2==0){
					   enemies.add(new Enemy(randX,90));
                                           //}
                                           //else
                                          // {
                                           //   enemies2.add(new Enemy2(randX,90));
                                           //}
				   }
				   
			}
			tempTime= System.nanoTime();
		}
		
		for(int i=0;i<enemies.size();i++)
		{
			enemies.get(i).tick();
			if(enemies.get(i).getY()>=550)
			{	
				enemies.remove(i);
				--i;
			}
		}
                if(bossIsAlive==true)
                {
                    for(int i=0;i<Boss.bomb.size();i++)
                    {
                        Boss.bomb.get(i).tick();
                    }
                }
                
	}
	public void render(Graphics graphics)
	{
		player.render(graphics);
		for(int i=0;i<bullet.size();i++)
		{
			bullet.get(i).render(graphics);
			
				//System.out.println("Bullet Deleted!");
		}
		for(int i=0;i<enemies.size();i++)
		{
			enemies.get(i).render(graphics);
		}
               
		 
		for(int i=0;i<explosion.size();i++)
		{
			explosion.get(i).render(graphics);
		}
		 
		//
		for(int i=0;i<enemies.size();i++)
		{
			int ex=enemies.get(i).getX();
			int ey=enemies.get(i).getY();
			int px= player.getX();
			int py= player.getY();
			if(px<ex+30 && px+30 >ex && py < ey + 30 && py+30 > ey)
			{
				enemies.remove(i);
				--health;
				--i;
				ouch = new Ouch(px,py);
				for(int k=0;k<200;k++) 
				{
				     ouch.render(graphics);
				}
				if(health<=0)
				{
				    enemies.removeAll(enemies);
				    bullet.removeAll(bullet);
				    explosion.removeAll(explosion);
			            player.setHealth(0); // update score if grater than prev score
                                    String username = Main.menu.getUserName();
                                    maxLevel=GameSetup.ImageIndex + 1;
                                    Main.db.checkScore(score,username,killCount,maxLevel);
			            
				}
			}
                        
			for(int j=0;j<bullet.size();j++)
			{
				 int bx=bullet.get(j).getX();
				 int by=bullet.get(j).getY();
				 try
				 {
				    if(ex <(bx + 5) && (ex + 65)> bx && ey<(by +5) && (ey +50 )> by )
				    {
					    enemies.remove(i);
					     --i;
                                             killCount++;
					    bullet.remove(j);
					    --j;
					    score+=5;
					    explosion.add(new Explosion(ex,ey+5));
					   
					 //  explosion=null;
					    //System.out.println(score);
					 //System.out.println("ex= "+ex+ " bx+5= "+ (bx+5) +" ex+25= "+(ex+25)+" bx= "+bx+" ey= "+ey+" by+5= "+by+5+" ey+25= "+(ey+25)+" by= "+by);
				    }
				 }
				 catch(RuntimeException e)
				 {}
			}
						
		}
		
		long breaks = (System.nanoTime()-delta ) / 1000000;
		if(breaks>delay-500)
		{
			explosion.removeAll(explosion);
			delta=System.nanoTime();
		}
		
		if(score>=10 && bossIsAlive==true)
		{
			boss.render(graphics);
			for(int i=0;i<bullet.size();i++)
			{
				int bx=bullet.get(i).getX();
				int by=bullet.get(i).getY();
				int bsx=boss.getX();
				int bsy=boss.getY();
				//if(ex <(bx + 5) && (ex + 65)> bx && ey<(by +5) && (ey +50 )> by )
				if(bsx <(bx + 5) && (bsx + 265)> bx && bsy<(by +5) && (bsy +80 )> by && bsy>=129)
				{
					Boss.bossLife--;
					bullet.remove(i);
					System.out.println("hit");
					if(Boss.bossLife<=0)
					{
                                            for(int j=1;j<=50;j++)
                                            {
                                                graphics.drawImage(LoadImages.boom,bsx,bsy, 80, 81, null);
                                            }
						this.bossIsAlive=false;
					}
				}
			}
		}
                 healthImg.render(graphics);
                 displayScore(graphics);
                 if(health<=0)
                 {
                     displayQuitOption(graphics);
                 }
                 
                 
                 
                 if(bossIsAlive==true)
                {
                    for(int i=0;i<Boss.bomb.size();i++)
                    {
                        Boss.bomb.get(i).render(graphics);
                        int px=player.getX();
                        int py=player.getY();
                        int ex=Boss.bomb.get(i).getX();
                        int ey=Boss.bomb.get(i).getY();
                        // game over if player dies at the hands of boss 
                        if(px<ex+5 && px+50 >ex && py < ey + 5 && py+50 > ey)
                        {
                            Boss.bomb.remove(i);
                            i--;
                            health--;
                            if(health<=0)
				{
				    enemies.removeAll(enemies);
				    bullet.removeAll(bullet);
				    explosion.removeAll(explosion);
			            player.setHealth(0); // update score if grater than prev score
                                    String username = Main.menu.getUserName();
                                    maxLevel=GameSetup.ImageIndex + 1;
                                    Main.db.checkScore(score,username,killCount,maxLevel);
                                    bossIsAlive=false;
                                    Boss.bossLife=-1;
                                    
			            
				}
                        }
                    }
                    //game over if kill equal or over 150
                   
                    
                    
                    
                    
                }
                 
                 
                 
        }
         public void keyPressed(KeyEvent e)
         {
               int source = e.getKeyCode();
               if(source==KeyEvent.VK_ENTER && this.health<=0)
               {
                   init();
               }
               if(source==KeyEvent.VK_Q && this.health<=0)
               {
                     Display.jframe.dispose();
                     System.exit(0);
               }
               if(source==KeyEvent.VK_F && this.health==1 && score>=30)
               {
                   health=3;
                   score-=30;
               }
         }
        @Override
         public void keyReleased(KeyEvent e)
         {
                     
         }
        @Override
         public void keyTyped(KeyEvent e)
         {
                     
         }
         public void displayScore(Graphics graphics)
         {
             graphics.setColor(Color.RED);
             graphics.setFont(new Font("calibri",Font.BOLD,30));
             graphics.drawString("Score = "+score, 2, 25);
             graphics.setColor(Color.GREEN);
             graphics.setFont(new Font("calibri",Font.BOLD,30));
             graphics.drawString("Kills = "+killCount, 2, 75);
             if(killCount>=70)
             {
                  graphics.setColor(Color.RED);
                  graphics.setFont(new Font("calibri",Font.BOLD,30));
                  graphics.drawString("Winner Winner Chicken Dinner!", 40, 560/2);
             }
              if(health==1){
                  graphics.setFont(new Font("calibri",Font.BOLD,15));
             graphics.drawString("Press F to Refil health for 30 points",150,40);
             }
         }
         public void displayQuitOption(Graphics graphics)
         {
             graphics.setColor(Color.blue);
             graphics.setFont(new Font("calibri",Font.BOLD,30));
             graphics.drawString("Game Over!", 305, 25);
             graphics.setFont(new Font("calibri",Font.BOLD,18));
             graphics.drawString("Press Enter to Restart",295,45);
             graphics.drawString("Or Q to Exit", 370 , 65);
            
	}
}
