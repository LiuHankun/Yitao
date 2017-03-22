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

	boolean play;//help to judge the functon of button

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


public JComponent getB()
{
	return b;
}
public JComponent getC()
{
	return c;
}

public void actionPerformed(ActionEvent e)//judge the function of button 
{
  if (e.getSource()==buttonStart)
  {
	  play=true;
  }
  if (e.getSource()==buttonStop)
  {
	  play=false;
  }
}
	
	public boolean inside()
{
	return play;
}
	
	public static void main(String[] args)
	{
		JFrame a = new JFrame(); //new instance
		Racer r= new Racer();
		Suibian s=new Suibian();
		
		
		a.setTitle("Racer");
		a.setSize(r.SCREEN_WIDTH,r.SCREEN_HEIGHT);
		a.setVisible(true);//can see the game clearly 
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close when click X,then back to the commond prompt
		
		
		a.setLayout(new BorderLayout());
		a.add(s.getB(),BorderLayout.NORTH);
		a.add(r.getPanel(),BorderLayout.CENTER);
		a.add(s.getC(),BorderLayout.SOUTH);//these three stapes are helpful for setting button
	
		
		
		
		
		
		r.start();//game starts
		while(r.isPlaying())
		{
			
			r.update();//move if the game starts
		    
		}   
		
			
		
		

		
	}
}