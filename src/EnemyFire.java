
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Koushiq
 */
public class EnemyFire
{
    private int x,y;
    private final int speed;
    public EnemyFire(int x,int y)
    {
        this.x=x;
        this.y=y;
        speed =6;
    }
    public void tick()
    {
        y+=speed;
    }
    public void render(Graphics graphics)
    {
        graphics.setColor(Color.blue);
        graphics.fillRect(x, y, 5, 5);
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
