package book;

public class bookHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructs the main controller for the program
		MainView mView = new MainView();
		MainAbstract mAbst = new MainAbstract();
		MainController mController = new MainController(mView, mAbst);
		
		mView.setVisible(true);

	}

}
