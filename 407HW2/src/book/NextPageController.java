package book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NextPageController extends MainController {
	private NextPage npage;
	private NextPageAbstract npagea;
	private boolean send = false;
	
	//Combines the Presentation and Abstract components to one object 
	public NextPageController(NextPage npage, NextPageAbstract npagea) {
		super(mView, mAbst);
		this.npage = npage;
		this.npagea = npagea;
		
		this.npage.nextPageListener(new NextListener());
		
	}
	
	//Returns the NextPage object
	public NextPage getNP(){
		return npage;
	}
	
	//Returns the NextPageAbstract object
	public NextPageAbstract getNPAbst(){
		return npagea;
	}
	
	//Used to change the send boolean to either true or false.
	public void setMsg(boolean status){
		this.send = status;
	}
	
	//Used to send a message to the main controller to perform an ActionEvent if "send" is true.
	public void sendMsg(){
		super.getNPMsg(send);
	}

	//Sets ActionListener to NextPage. When clicked, sets sendMsg to True, and calls the sendMsg function for mainController.
	class NextListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			try{
				setMsg(true);
				sendMsg();
				setMsg(false);
			}
			catch(Exception t){
				System.err.println("An Error Occured");;
			}
			
		}
		
	}
}


