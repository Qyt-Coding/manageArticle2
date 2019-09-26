package qyt.manageArticle.newPojo;

public class LeaveArticleNew {
	Integer bId;
	String cContent ;
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getcContent() {
		return cContent;
	}
	public void setcContent(String cContent) {
		this.cContent = cContent;
	}
	@Override
	public String toString() {
		return "LeaveArticleNew [bId=" + bId + ", cContent=" + cContent + "]";
	}
	
}
