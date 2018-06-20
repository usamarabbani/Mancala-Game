import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class Controller1 extends JFrame implements ActionListener{

	 private int x;
	   public Controller1(int x){
	   this.x = x;
	  
	   
		   }
	   public void actionPerformed(ActionEvent event){
		   if(Model.who==0 && x<90){//start number of stones for each holes 
		   for (int p =0;p<14;p++){
			   Model.mas[p] = x;
			   Model.masr[p]=x;
		   };
		
		   Model.mas[6] = 0;
		   Model.masr[6] =0;
		   Model.mas[13] = 0;
		   Model.masr[13] =0;
		   Model.who=1;
		   Model.frame.fMF(Model.mas);
	   }
		   if(x==100){//choose background color
			   Model.col=1;
		   }
		   if(x==200){
			   Model.col=2;
		   }
		   if(x==300){
			   Model.col=0;
		   }
		   
	   }
}
