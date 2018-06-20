import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Model
{ static int col=0;//this variable consist information about window's style
	 static int k1=0,k2=0;//number of canceled move for each player
    static int who = 0;//decide whose move is availible right now 
	static int[] mas = {3,3,3,3,3,3,0,3,3,3,3,3,3,0};//consist information about the current state of the game 
	static int[] masr = {3,3,3,3,3,3,0,3,3,3,3,3,3,0};//consist information about the state of the game wich was in move before 
	
	static Model1 frame = new Model1(mas);

}
