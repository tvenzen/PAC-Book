package book;

import java.awt.event.ActionListener;

import javax.swing.*;

public class FirstPage extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Set the FirstPage button with the visual text "First"
	public FirstPage(){
		this.setText("First");
	}
	
	//Used to add an ActionListener to the button
	void firstPageListener(ActionListener firstTrigger){
		this.addActionListener(firstTrigger);
	}

}
