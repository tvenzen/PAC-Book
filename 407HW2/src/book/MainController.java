package book;

public class MainController {
	protected static MainView mView = new MainView();
	protected static MainAbstract mAbst = new MainAbstract();
	
	//public MainController(){
		
	//}
	
	public MainController(MainView mView, MainAbstract mAbst){
		this.mView = mView;
		this.mAbst = mAbst;

	}
	
	//When called from FirstPage, sets the pageNum in the mainAbstract with the retrieved number from FirstPageAbstract
	public void getFPMsg(boolean status){
		if (status){
			mAbst.setPage(mView.getFPAbst().getPageNum());
			update();
			mView.getFPcontroller().setMsg(false);
		}
	}
	
	//When called from LastPage, sets the pageNum in the mainAbstract with the retrieved number from LastPageAbstract
	public void getLPMsg(boolean status){
		if (status){
			mAbst.setPage(mView.getLPAbst().getPageNum());
			update();
			mView.getLPcontroller().setMsg(false);
			}
	}
	//When called from NextPage, sets the pageNum in the NextPageAbstract with the retrieved number from MainAbstract, calls toNextPage to 
	//increment pageNum in NextPageAbstract by one, then uses that number to set MainAbstract with the new number
	public void getNPMsg(boolean status){
		if (status){
			mView.getNPAbst().setPageNum(mAbst.getPage());
			mView.getNPAbst().toNextPage();
			mAbst.setPage(mView.getNPAbst().getPageNum());
			update();
			mView.getNPcontroller().setMsg(false);
			}
	}
	
	//When called from PrevPage, sets the pageNum in the PrevPageAbstract with the retrieved number from MainAbstract, calls toNextPage to 
	//decrement pageNum in PrevPageAbstract by one, then uses that number to set MainAbstract with the new number
	public void getPPMsg(boolean status){
		if (status){
			mView.getPPAbst().setPageNum(mAbst.getPage());
			mView.getPPAbst().toPrevPage();
			mAbst.setPage(mView.getPPAbst().getPageNum());
			update();
			mView.getPPcontroller().setMsg(false);
			}
	}
	
	//Returns the MainView object
	public MainView getMainView(){
		return mView;
	}
	
	//Causes the JTextField in MainView to change strings depending on the getPage value returned from MainAbstract
	//On the first page, the "First" and "Previous" page buttons are hidden, the same thing occurs on the last page for "Last" and 
	//"Next" buttons.
	public void update(){
		switch (mAbst.getPage()){
		case 1:
			mView.setText("Page1");
			mView.getFirstPage().setVisible(false);
			mView.getPrevPage().setVisible(false);
			mView.getNextPage().setVisible(true);
			mView.getLastPage().setVisible(true);
			break;
		case 2:
			mView.setText("Page2");
			mView.getFirstPage().setVisible(true);
			mView.getPrevPage().setVisible(true);
			mView.getNextPage().setVisible(true);
			mView.getLastPage().setVisible(true);
			break;
		case 3:
			mView.setText("Page3");
			mView.getFirstPage().setVisible(true);
			mView.getPrevPage().setVisible(true);
			mView.getNextPage().setVisible(true);
			mView.getLastPage().setVisible(true);
			break;
		case 4:
			mView.setText("Page4");
			mView.getFirstPage().setVisible(true);
			mView.getPrevPage().setVisible(true);
			mView.getNextPage().setVisible(true);
			mView.getLastPage().setVisible(true);
			break;
		case 5:
			mView.setText("Page5");
			mView.getFirstPage().setVisible(true);
			mView.getPrevPage().setVisible(true);
			mView.getNextPage().setVisible(true);
			mView.getLastPage().setVisible(true);
			break;
		case 6:
			mView.setText("Page6");
			mView.getFirstPage().setVisible(true);
			mView.getPrevPage().setVisible(true);
			mView.getNextPage().setVisible(true);
			mView.getLastPage().setVisible(true);
			break;
		case 7:
			mView.setText("Page7");
			mView.getFirstPage().setVisible(true);
			mView.getPrevPage().setVisible(true);
			mView.getNextPage().setVisible(true);
			mView.getLastPage().setVisible(true);
			break;
		case 8:
			mView.setText("Page8");
			mView.getFirstPage().setVisible(true);
			mView.getPrevPage().setVisible(true);
			mView.getNextPage().setVisible(true);
			mView.getLastPage().setVisible(true);
			break;
		case 9:
			mView.setText("Page9");
			mView.getFirstPage().setVisible(true);
			mView.getPrevPage().setVisible(true);
			mView.getNextPage().setVisible(false);
			mView.getLastPage().setVisible(false);
			break;
			
		}
	}

}
