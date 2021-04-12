package book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstPagecontroller extends MainController {

	private FirstPage fpage = new FirstPage();
	private FirstPageAbstract fpagea = new FirstPageAbstract();
	private boolean send = false;
	
	//Combines the Presentation and Abstract components to one object 
	public FirstPagecontroller(FirstPage fpage, FirstPageAbstract fpagea) {
		super(mView, mAbst);
		this.fpage = fpage;
		this.fpagea = fpagea;
		
		this.fpage.firstPageListener(new FirstListener());
		
	}
	
	//Returns the FirstPage object
	public FirstPage getFP(){
		return fpage;
	}
	
	//Returns the FirstPageAbstract object
	public FirstPageAbstract getFPAbst(){
		return fpagea;
	}
	
	//Used to change the send boolean to either true or false.
	public void setMsg(boolean status){
		this.send = status;
	}
	
	//Used to send a message to the main controller to perform an ActionEvent if "send" is true.
	public void sendMsg(){
		super.getFPMsg(send);
	}

	//Sets ActionListener to FirstPage. When clicked, sets sendMsg to True, and calls the sendMsg function for mainController.
	class FirstListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			//try{
				setMsg(true);
				sendMsg();
				//setMsg(false);
			//}
		//	catch(Exception t){
			//	System.err.println("An Error Occured");;
			}
			
		}
		
	}
//}
