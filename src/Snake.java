import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;


public class Snake extends JFrame{
	public Snake(){
		add(new Board());
		setResizable(false);
		pack();
		
		setTitle("Snake");
		setLocation(new Point(0,0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame f = new Snake();
				f.setVisible(true);
			}
		});
	}
}
