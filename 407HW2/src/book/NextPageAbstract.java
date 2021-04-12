package book;

public class NextPageAbstract {
	private int pageNum = 0;
	
	//Returns pageNum
	public int getPageNum(){
		return pageNum;
	}
	
	//Allows for the changing of pageNum
	public void setPageNum(int i){
		this.pageNum = i;
	}
	
	//increments pageNum
	public void toNextPage(){
		this.pageNum +=  1;
	}
}
