package book;

public class PrevPageAbstract {
	private int pageNum = 0;
	
	public int getPageNum(){
		return pageNum;
	}
	
	public void setPageNum(int i){
		this.pageNum = i;
	}
	
	public void toPrevPage(){
		this.pageNum -=  1;
	}
}
