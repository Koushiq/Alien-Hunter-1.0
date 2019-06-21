
import java.awt.Graphics;


public class Health
{
    private int x;
    private int y;
    public Health(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void render(Graphics graphics)
    {
        if(GameManager.health==3)
        {
           graphics.drawImage(LoadImages.healthfull,x,y,80,17,null);
        }
        else if(GameManager.health==2)
        {
            graphics.drawImage(LoadImages.healthhalf,x,y,80,17,null);
        }
        else if(GameManager.health==1)
        {
            graphics.drawImage(LoadImages.healthquater,x,y,80,17,null);
        }
        else
        {
            graphics.drawImage(LoadImages.healthempty,x,y,80,17,null);
        }
    }
}
