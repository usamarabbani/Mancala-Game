import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Model1 extends JFrame
{
	static View  panel1=new View(Model.mas);
    public void fMF(int[] i){
		int mas[] = new int [14];
		
		//
		if(Model.col==1)
			panel1.setBackground( Color.BLUE );
		if(Model.col==2)
			panel1.setBackground( Color.YELLOW );
		if(Model.col==0)
			panel1.setBackground( Color.WHITE );
	
				JButton bw = new JButton("White");
				bw.setSize(100, 30);
				bw.setLocation(200, 600);
				add(bw);
				Controller1 bLw = new Controller1(300); // create an instance of the event handler
				bw.addActionListener(bLw);
				
		JButton bl = new JButton("Blue");
		bl.setSize(100, 30);
		bl.setLocation(200, 650);
		add(bl);
		Controller1 bL1 = new Controller1(100); // create an instance of the event handler
		bl.addActionListener(bL1);
		
		JButton bl2 = new JButton("Yellow");
		bl2.setSize(100, 30);
		bl2.setLocation(200, 550);
		add(bl2);
		Controller1 bL2 = new Controller1(200); // create an instance of the event handler
		bl2.addActionListener(bL2);
		
		
		
		JButton b1 = new JButton("3");
		b1.setSize(100, 30);
		b1.setLocation(400, 650);
		add(b1);
		Controller1 bA1 = new Controller1(3); // create an instance of the event handler
		b1.addActionListener(bA1);
		JButton b2 = new JButton("4");
		b2.setSize(100, 30);
		b2.setLocation(700, 650);
		add(b2);
		Controller1 bA2 = new Controller1(4); // create an instance of the event handler
		b2.addActionListener(bA2);
		if(Model.who!=0){
			b1.setVisible(false);
			b2.setVisible(true);
			b1.setText("-");
			repaint();
		}
		
		
	//	button for cancel the move
		JButton button = new JButton("Ñancel ");
		button.setSize(100, 30);
		button.setLocation(1100, 650);
		add(button);
		Controller buttonAction = new Controller(20); // create an instance of the event handler
		button.addActionListener(buttonAction);
		
		//buttons for moves:
		JButton button1 = new JButton("B6");
		button1.setSize(130, 30);
		button1.setLocation(220,200);
		add(button1);
		Controller buttonAction1 = new Controller(12); // ñcreate an instance of the event handler
		button1.addActionListener(buttonAction1);
		JButton button2 = new JButton("B5");
		button2.setSize(130, 30);
		button2.setLocation(420,200);
		add(button2);
		Controller buttonAction2 = new Controller(11); // create an instance of the event handler
		button2.addActionListener(buttonAction2);
		JButton button3 = new JButton("B4");
		button3.setSize(130, 30);
		button3.setLocation(620,200);
		add(button3);
		Controller buttonAction3 = new Controller(10); // create an instance of the event handler
		button3.addActionListener(buttonAction3);
		JButton button4 = new JButton("B3");
		button4.setSize(130, 30);
		button4.setLocation(820,200);
		add(button4);
		Controller buttonAction4 = new Controller(9); // create an instance of the event handler
		button4.addActionListener(buttonAction4);
		JButton button5 = new JButton("B2");
		button5.setSize(130, 30);
		button5.setLocation(1020,200);
		add(button5);
		Controller buttonAction5 = new Controller(8); // create an instance of the event handler
		button5.addActionListener(buttonAction5);
		JButton button6 = new JButton("B1");
		button6.setSize(130, 30);
		button6.setLocation(1220,200);
		add(button6);
		Controller buttonAction6 = new Controller(7); // create an instance of the event handler
		button6.addActionListener(buttonAction6);
		
		JButton button11 = new JButton("A1");
		button11.setSize(130, 30);
		button11.setLocation(220,310);
		add(button11);
		Controller buttonAction11 = new Controller(0); // create an instance of the event handler
		button11.addActionListener(buttonAction11);
		JButton button21 = new JButton("A2");
		button21.setSize(130, 30);
		button21.setLocation(420,310);
		add(button21);
		Controller buttonAction21 = new Controller(1); // create an instance of the event handler
		button21.addActionListener(buttonAction21);
		JButton button31 = new JButton("A3");
		button31.setSize(130, 30);
		button31.setLocation(620,310);
		add(button31);
		Controller buttonAction31 = new Controller(2); // create an instance of the event handler
		button31.addActionListener(buttonAction31);
		JButton button41 = new JButton("A4");
		button41.setSize(130, 30);
		button41.setLocation(820,310);
		add(button41);
		Controller buttonAction41 = new Controller(3); // create an instance of the event handler
		button41.addActionListener(buttonAction41);
		JButton button51 = new JButton("A5");
		button51.setSize(130, 30);
		button51.setLocation(1020,310);
		add(button51);
		Controller buttonAction51 = new Controller(4); // create an instance of the event handler
		button51.addActionListener(buttonAction51);
		JButton button61 = new JButton("A6");
		button61.setSize(130, 30);
		button61.setLocation(1220,310);
		add(button61);
		Controller buttonAction61 = new Controller(5); // create an instance of the event handler
		button61.addActionListener(buttonAction61);

		//information about the game after the move
		repaint();
		add(panel1);
			mas=i;
			
	setSize(FRAME_WIDTH, FRAME_HEIGHT);//size

	}
	
public Model1(int[] i)
{
	
	fMF(i);
	

}



public static final int FRAME_WIDTH = 1700; //winth
public static final int FRAME_HEIGHT = 800;//height
}