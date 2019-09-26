package qyt.manageArticle.pojo;

public class Reply {
    private Integer dId;

    private String dName;

    private String dDate;

    private String dContent;

    private String dForName;

    private String dForWords;

    private String dForReply;

    private String dForArticleId;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate == null ? null : dDate.trim();
    }

    public String getdContent() {
        return dContent;
    }

    public void setdContent(String dContent) {
        this.dContent = dContent == null ? null : dContent.trim();
    }

    public String getdForName() {
        return dForName;
    }

    public void setdForName(String dForName) {
        this.dForName = dForName == null ? null : dForName.trim();
    }

    public String getdForWords() {
        return dForWords;
    }

    public void setdForWords(String dForWords) {
        this.dForWords = dForWords == null ? null : dForWords.trim();
    }

    public String getdForReply() {
        return dForReply;
    }

    public void setdForReply(String dForReply) {
        this.dForReply = dForReply == null ? null : dForReply.trim();
    }

    public String getdForArticleId() {
        return dForArticleId;
    }

    public void setdForArticleId(String dForArticleId) {
        this.dForArticleId = dForArticleId == null ? null : dForArticleId.trim();
    }

	@Override
	public String toString() {
		return "Reply [dId=" + dId + ", dName=" + dName + ", dDate=" + dDate + ", dContent=" + dContent + ", dForName="
				+ dForName + ", dForWords=" + dForWords + ", dForReply=" + dForReply + ", dForArticleId="
				+ dForArticleId + "]";
	}
    
    
}