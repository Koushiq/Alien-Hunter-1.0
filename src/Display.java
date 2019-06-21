import java.awt.Canvas;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public  class Display implements ActionListener
{
	private String title;
	private int width;
	private int height;
	public static  JFrame jframe;
	private  Canvas canvas;
	
	public Display(String title,int width, int height)
	{
		this.title=title;
		this.width=width;
		this.height=height;
		//button=new JButton("Back");
		createDisplay();
	}
        public JFrame getJFrame()
        {
            return this.jframe;
        }
	public void createDisplay()
	{
	
		jframe =  new JFrame(title);
		//button.setLayout(null);
		//button.setBounds(700, 0, 100, 40);
		//button.setBackground(Color.white);
		//button.setForeground(Color.black);
		
		jframe.setSize(width,height);
		jframe.setVisible(true);
		jframe.setLocationRelativeTo(null);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setBackground(Color.black);
               
		canvas.setFocusable(false);
                
		jframe.add(canvas);
		jframe.pack();
		
	}
	public Canvas getCanvas()
	{
		return this.canvas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
