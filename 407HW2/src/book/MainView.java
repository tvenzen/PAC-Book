package book;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WINDOW_WIDTH = 420;
	private final int WINDOW_LENGTH = 300;
	private FirstPage fpage = new FirstPage();
	private FirstPageAbstract fpagea = new FirstPageAbstract();
	private FirstPagecontroller fpController = new FirstPagecontroller(fpage, fpagea);
	private LastPage lpage = new LastPage();
	private LastPageAbstract lpagea = new LastPageAbstract();
	private LastPageController lpController = new LastPageController(lpage, lpagea);
	private NextPage npage = new NextPage();
	private NextPageAbstract npagea = new NextPageAbstract();
	private NextPageController npController = new NextPageController(npage, npagea);
	private PrevPage ppage = new PrevPage();
	private PrevPageAbstract ppagea = new PrevPageAbstract();
	private PrevPageController ppController = new PrevPageController(ppage, ppagea);
	private JTextField pageText = new JTextField(10);
	
	MainView(){
		//Constructs window
		this.setTitle("Book Reader");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WINDOW_WIDTH, WINDOW_LENGTH);;
		this.setLayout(new BorderLayout());
		
		//adds buttons to the each region of the borderlayout
		add(fpController.getFP(), BorderLayout.NORTH);
		add(lpController.getLP(), BorderLayout.SOUTH);
		add(npController.getNP(), BorderLayout.EAST);
		add(ppController.getPP(), BorderLayout.WEST);
		add(pageText, BorderLayout.CENTER);

	}
	
	//Use to set designated text string in pageText text field.
	public void setText(String s){
		pageText.setText(s);
	}
	
	//Returns the FirstPage objext
	public FirstPage getFirstPage(){
		return fpController.getFP();
	}
	
	//Returns the FirstPageAbstract object
	public FirstPageAbstract getFPAbst(){
		return fpController.getFPAbst();
	}
	
	//Returns the FirstPageController object
	public FirstPagecontroller getFPcontroller(){
		return fpController;
	}
	
	//Returns the LastPage object
	public LastPage getLastPage(){
		return lpController.getLP();
	}
	
	//Returns the LastPageAbstract object
	public LastPageAbstract getLPAbst(){
		return lpController.getLPAbst();
	}
	
	//Returns the LastPageController object
	public LastPageController getLPcontroller(){
		return lpController;
	}
	
	//Returns the NextPage object
	public NextPage getNextPage(){
		return npController.getNP();
	}
	
	//Returns the NextPageAbstract object
	public NextPageAbstract getNPAbst(){
		return npController.getNPAbst();
	}
	
	//Returns the NextPageController object
	public NextPageController getNPcontroller(){
		return npController;
	}
	
	//Returns the PrevPage object
	public PrevPage getPrevPage(){
		return ppController.getPP();
	}
	
	//Returns the PrevPageAbstract object
	public PrevPageAbstract getPPAbst(){
		return ppController.getPPAbst();
	}
	
	//Returns the PrevPageController object
	public PrevPageController getPPcontroller(){
		return ppController;
	}
	
}


