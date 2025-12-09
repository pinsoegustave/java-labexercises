import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Font;

public class Game extends JComponent implements KeyListener, MouseListener
{
	//instance variables
	private int width;
	private int height;
 
	//Default Constructor
	public Game()
	{
		//initializing instance variables
		width = 1000;
		height = 500;
		 
		//Setting up the GUI
		JFrame gui = new JFrame(); //This makes the frame (window)
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Makes sure program can close
		gui.setTitle("My First Game"); //This is the title of the game
		gui.setPreferredSize(new Dimension(width + 15, height + 38)); //Frame size
		gui.setResizable(false); //Stop the frame from being resized
		gui.getContentPane().add(this); //This allows content to be added to the frame

		gui.pack(); //Packs everything together on the frame
		gui.setLocationRelativeTo(null); //Tells the frame to open in the center of the screen
		gui.setVisible(true); //Makes the frame visible
		gui.addKeyListener(this); // Allows for keyboard input
		gui.addMouseListener(this); // Allows for mouse input
	}
	
	// This is where all variables will be updated before redrawing.
	public void tick()
	{
		
	}
	
	// This will draw the screen
	public void render(Graphics g)
	{
		
	}
	
	// This is run automatically when a repaint() method is called in the loop below.
	public void paintComponent(Graphics g)
	{
		// Render all objects
		render(g);
	}
	
	public void loop()
	{
		// Tick all objects
		tick();
		
		//Trigger the repainting of the screen.
		repaint();
	}

	// When implementing KeyListener and MouseListener,
	// these methods are required.
	// They get triggered automatically when a keyboard or mouse event occurs
	public void keyPressed(KeyEvent e) 
	{
	} 
	public void keyTyped(KeyEvent e) 
	{
	}
	public void keyReleased(KeyEvent e) 
	{
	}
	public void mousePressed(MouseEvent e)
	{
	}
	public void mouseReleased(MouseEvent e)
	{
	}
	public void mouseClicked(MouseEvent e)
	{
	}
	public void mouseEntered(MouseEvent e)
	{
	}
	public void mouseExited(MouseEvent e)
	{
	}

	public void start()
	{
		int fps = 60;
		Thread gameThread = new Thread()
		{
			public void run()
			{
				while(true)
				{
					loop();
					try{
						Thread.sleep(1000 / fps);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		};
		gameThread.start();
	}
}