package qyt.manageArticle.pojo;

public class Article {
    private Integer bId;

    private String bAuthor;

    private String bSummary;

    private String bDate;

    private Integer bVerify;

    private Integer bPublish;

    private Integer bStatus;

    private String bContent;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor == null ? null : bAuthor.trim();
    }

    public String getbSummary() {
        return bSummary;
    }

    public void setbSummary(String bSummary) {
        this.bSummary = bSummary == null ? null : bSummary.trim();
    }

    public String getbDate() {
        return bDate;
    }

    public void setbDate(String bDate) {
        this.bDate = bDate == null ? null : bDate.trim();
    }

    public Integer getbVerify() {
        return bVerify;
    }

    public void setbVerify(Integer bVerify) {
        this.bVerify = bVerify;
    }

    public Integer getbPublish() {
        return bPublish;
    }

    public void setbPublish(Integer bPublish) {
        this.bPublish = bPublish;
    }

    public Integer getbStatus() {
        return bStatus;
    }

    public void setbStatus(Integer bStatus) {
        this.bStatus = bStatus;
    }

    public String getbContent() {
        return bContent;
    }

    public void setbContent(String bContent) {
        this.bContent = bContent == null ? null : bContent.trim();
    }

	@Override
	public String toString() {
		return "Article [bId=" + bId + ", bAuthor=" + bAuthor + ", bSummary=" + bSummary + ", bDate=" + bDate
				+ ", bVerify=" + bVerify + ", bPublish=" + bPublish + ", bStatus=" + bStatus + ", bContent=" + bContent
				+ "]";
	}
    
    
    
    
}