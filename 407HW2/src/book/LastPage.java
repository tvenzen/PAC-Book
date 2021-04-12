package book;

import java.awt.event.ActionListener;
import javax.swing.*;

public class LastPage extends JButton {
	private static final long serialVersionUID = 1L;

	//Set the FirstPage button with the visual text "Last"
	public LastPage(){
		this.setText("Last");
	}
	
	//Used to add an ActionListener to the button
	void lastPageListener(ActionListener lastTrigger){
		this.addActionListener(lastTrigger);
	}
}
