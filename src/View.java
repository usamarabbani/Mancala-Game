import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JPanel;
import javax.swing.JTextField;

class View extends JPanel
{
	int mass[];
	View(int[] mass){
	this.mass = mass;
		
		
	}
	

	

public void paintComponent(Graphics g)
{
super.paintComponent (g);


g.drawRect(1210, 40, 150, 150);//Draw a rectangle
g.drawRect(210, 40, 150, 150);//Draw a rectangle
g.drawRect(410, 40, 150, 150);//Draw a rectangle
g.drawRect(610, 40, 150, 150);//Draw a rectangle
g.drawRect(810, 40, 150, 150);//Draw a rectangle
g.drawRect(1010, 40, 150, 150);//Draw a rectangle

g.drawRect(1210, 350, 150, 150);//Draw a rectangle
g.drawRect(210, 350, 150, 150);//Draw a rectangle
g.drawRect(410, 350, 150, 150);//Draw a rectangle
g.drawRect(610, 350, 150, 150);//Draw a rectangle
g.drawRect(810, 350, 150, 150);//Draw a rectangle
g.drawRect(1010, 350, 150, 150);//Draw a rectangle
g.drawRect(10, 90, 180, 350);//Draw a rectangle
g.drawRect(1380, 90, 180, 350);//Draw a rectangle





for(int j = 7;j<13;j++){//drawing the stones in hole (for player 2) 

for(int i = 0;i<mass[j];i++){
	int r = 4;
	int z=i/r;
	g.fillOval(1530-(220+30*i+200*(j-7)-30*r*z),60+30*z, 30, 30);//Draw a circle
	
}




}

for(int j = 0;j<6;j++){//drawing the stones in hole (for player 1) 

for(int i = 0;i<mass[j];i++){
	int r = 4;
	int z=i/r;
	g.fillOval(220+30*i+200*j-30*r*z,60+30*z+300, 30, 30);//Draw a circle
							}
					 }

for(int i = 0;i<mass[6];i++){//drawing the stones in hole (for Mancala(player1)) 
	int r = 4;
	int z=i/r;
	
	g.setColor(Color.RED);
	g.fillOval(1400+30*i-30*r*z,100+30*z, 30, 30);//Draw a circle
	
	
}

for(int i = 0;i<mass[13];i++){//drawing the stones in hole (for Mancala(player2)) 
	int r = 4;
	int z=i/r;
		g.setColor(Color.GREEN);
	g.fillOval(20+30*i-30*r*z,100+30*z, 30, 30);//Draw a circle
	
	
}
Font Font30TimesRomanBold   = new Font("TimesRoman", Font.BOLD, 30);//font style
if(Model.who == 3){//end of the game
	
	Model.mas[6]+=Model.mas[0]+Model.mas[1]+Model.mas[2]+Model.mas[3]+Model.mas[4]+Model.mas[5];
	Model.mas[13]+=Model.mas[7]+Model.mas[8]+Model.mas[9]+Model.mas[10]+Model.mas[11]+Model.mas[12];
	
	g.setColor(Color.BLACK);
	g.setFont(Font30TimesRomanBold);
	if(Model.mas[6]>Model.mas[13])
	g.drawString("Player_1 wins!!! ("+Model.mas[6]+":"+Model.mas[13]+")", 600, 280);
	else
	g.drawString("Player_2 wins!!! ("+Model.mas[13]+":"+Model.mas[6]+")", 600, 280);
	Model.who=4;
	
}
g.setFont(Font30TimesRomanBold);
g.drawString("Select style: ",20,620);
if(Model.who == 2){//who make move in the game
	g.setColor(Color.BLACK);
	g.setFont(Font30TimesRomanBold);
	g.drawString("Move of the Player_2", 600, 580);

}
if(Model.who == 1){//who make move in the game
	g.setColor(Color.BLACK);
	g.setFont(Font30TimesRomanBold);
	g.drawString("Move of the Player_1", 600, 580);
	
}
if(Model.who == 0){//start game
	g.setColor(Color.BLACK);
	g.setFont(Font30TimesRomanBold);
	g.drawString("3 or 4 stones ?", 600, 580);
	
}


}

}