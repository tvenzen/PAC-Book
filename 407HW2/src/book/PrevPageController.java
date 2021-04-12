package book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PrevPageController extends MainController {
	private PrevPage ppage;
	private PrevPageAbstract ppagea;
	private boolean send = false;
	
	//Combines the Presentation and Abstract components to one object 
	public PrevPageController(PrevPage ppage, PrevPageAbstract ppagea) {
		super(mView, mAbst);
		this.ppage = ppage;
		this.ppagea = ppagea;
		
		this.ppage.prevPageListener(new PrevListener());
		
	}
	
	//Returns the PrevPage object
	public PrevPage getPP(){
		return ppage;
	}
	//Returns the PrevPageAbstract object
	public PrevPageAbstract getPPAbst(){
		return ppagea;
	}
	
	//Used to change the send boolean to either true or false.
	public void setMsg(boolean status){
		this.send = status;
	}
	
	//Used to send a message to the main controller to perform an ActionEvent if "send" is true.
	public void sendMsg(){
		super.getPPMsg(send);
	}

	//Sets ActionListener to PrevPage. When clicked, sets sendMsg to True, and calls the sendMsg function for mainController.
	class PrevListener implements ActionListener{
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
