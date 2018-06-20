import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


class Controller extends JFrame implements ActionListener {//processing of player's move
   private int x,go,t;
   public Controller(int x){
   this.x = x;
   go=0;
   
	   }
	   @Override 
	   public void actionPerformed(ActionEvent event)
	   {
		   if(x!=20){
		   if(x>=0 && x<6 && Model.mas[x]!=0)
			   go =1;
		   else if(x!=20 && Model.mas[x]!=0)
			   go = 2;
		   else if(Model.mas[x]==0){
			   go =-1;
			  
		   }
		
		   
		   if(Model.who == go){
			   for (int p =0;p<14;p++)
			   Model.masr[p] = Model.mas[p];//remember the last move (move before)
	////////////////////////////////////
			  int mx =  Model.mas[x];
			  Model.mas[x]=0;
	   for(int i = 1;i<=mx;i++){
		  
			   
			   
	   if((x+i)<14){
	   if((x+i)!=((3-go)*7-1)){
		    Model.mas[x+i]++;
		    t=x+i;
	   }
	   else
		   mx++;
	   
	   }
	   else{
		   
		   if((x+i-14)<14){
			   if((x+i-14)!=((3-go)*7-1)){
				    Model.mas[x+i-14]++;
				    t=x+i-14;    
			   }
			   else
				   mx++;
		   }
			   }
		   }
		  
		  Model.frame.fMF(Model.mas);
		 
		 
		  if( Model.mas[t]==1){//If the last stone you drop is in an empty pit on your side
			  if(go==1 &&(t>=0 && t<6)){
				  Model.mas[6]+=Model.mas[t]+Model.mas[12-t];  
				  Model.mas[t]=0;
				  Model.mas[12-t]=0;
			  }
			  if(go==2 &&(t>=7 && t<13)){
				  Model.mas[13]+=Model.mas[t]+Model.mas[12-t];  
				  Model.mas[t]=0;
				  Model.mas[12-t]=0;
			  }
			  
			  
		  }
		  
		  
	   if(Model.who ==1  && t!=6 && x!=20 && mx!=0)//change of move
		   Model.who = 2;
	   else if(Model.who ==2  && t!=13 && x!=20 && mx!=0)//change of move
		Model.who=1;  
		
		   }
		  
		////end of the game
			   if(Model.mas[0]==0 && Model.mas[1]==0 && Model.mas[2]==0 && Model.mas[3]==0 && Model.mas[4]==0 && Model.mas[5]==0){
				   Model. who = 3;
				   Model.frame.fMF(Model.mas);
			   }
			   ////end of the game
			   if(Model.mas[7]==0 && Model.mas[8]==0 && Model.mas[9]==0 && Model.mas[10]==0 && Model.mas[11]==0 && Model.mas[12]==0){
				   Model. who = 3;
				   Model.frame.fMF(Model.mas);
			   }
			   
			  
			   
	   }   
		   else if((Model.k1<3 && Model.who==2) || (Model.k2<3 && Model.who==1)){
			   for (int p =0;p<14;p++)
				   Model.mas[p] = Model.masr[p];
			   if(Model.who ==1 ){
				   Model.who = 2;
			   Model.k2++;
			   }
			   else {
				Model.who=1;
				Model.k1++;
			   }
			   
			   
		   Model.frame.fMF(Model.mas);   
		   }
		   
	   }
	   
	}

