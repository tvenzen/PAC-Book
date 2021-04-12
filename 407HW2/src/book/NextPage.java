package book;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NextPage extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Set the FirstPage button with the visual text "Next"
	public NextPage(){
		this.setText("Next");
	}
	
	////Used to add an ActionListener to the button
	void nextPageListener(ActionListener nextTrigger){
		this.addActionListener(nextTrigger);
	}

}
