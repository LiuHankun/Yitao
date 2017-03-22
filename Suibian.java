import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Suibian implements ActionListener
{
	JPanel b=new JPanel();
	JPanel c=new JPanel();
		
	JLabel d=new JLabel("Score");
	JButton buttonStart=new JButton("Play");
	JButton buttonStop=new JButton("Stop");

	

public  Suibian()
{
	b.add(d); //panel b add label
	
	GridLayout layout = new GridLayout(1,2);  // new gridlayout 
	c.setLayout(layout);  // add it to layout of c
	c.add(buttonStart);
	c.add(buttonStop);
    buttonStart.addActionListener(this);
	buttonStop.addActionListener(this);
	
	
}


public void actionPerformed(ActionEvent e)
{

  
}



public JComponent getB()
{
	return b;
}
public JComponent getC()
{
	return c;
}


	
	public static void main(String[] args)
	{
		JFrame a = new JFrame(); //new instance
		Racer r= new Racer();
		Suibian s=new Suibian();
		
		
		a.setTitle("Racer");
		a.setSize(r.SCREEN_WIDTH,r.SCREEN_HEIGHT);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close when click X
		
		
		a.setLayout(new BorderLayout());
		a.add(s.getB(),BorderLayout.NORTH);
		a.add(r.getPanel(),BorderLayout.CENTER);
		a.add(s.getC(),BorderLayout.SOUTH);
		
		
		
		
		
		
		
		r.start();
		while(r.isPlaying()){
			
			r.update();
		    
		}
			
		
		

		
	}
}