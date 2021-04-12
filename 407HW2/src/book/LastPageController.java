package book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LastPageController extends MainController {
	private LastPage lpage;
	private LastPageAbstract lpagea;
	private boolean send = false;
	
	//Combines the Presentation and Abstract components to one object 
	public LastPageController(LastPage lpage, LastPageAbstract lpagea) {
		super(mView, mAbst);
		this.lpage = lpage;
		this.lpagea = lpagea;
		this.lpage.lastPageListener(new LastListener());
		
	}
	
	//Returns the LastPage object
	public LastPage getLP(){
		return lpage;
	}
	
	//Returns the LastPageAbstract object
	public LastPageAbstract getLPAbst(){
		return lpagea;
	}
	
	//Used to change the send boolean to either true or false.
	public void setMsg(boolean status){
		this.send = status;
	}
	
	//Used to send a message to the main controller to perform an ActionEvent if "send" is true.
	public void sendMsg(){
		super.getLPMsg(send);
	}

	//Sets ActionListener to LastPage. When clicked, sets sendMsg to True, and calls the sendMsg function for mainController.
	class LastListener implements ActionListener{
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
