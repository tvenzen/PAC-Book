package book;

import java.awt.event.ActionListener;
import javax.swing.*;

public class PrevPage extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrevPage(){
		this.setText("Previous");
	}
	
	void prevPageListener(ActionListener prevTrigger){
		this.addActionListener(prevTrigger);
	}

}
