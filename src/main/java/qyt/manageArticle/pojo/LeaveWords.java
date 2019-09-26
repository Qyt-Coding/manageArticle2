package qyt.manageArticle.pojo;

public class LeaveWords {
    private Integer cId;

    private String cName;

    private String cDate;

    private String cContent;

    private String cForName;

    private String cForArticleId;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate == null ? null : cDate.trim();
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

    public String getcForName() {
        return cForName;
    }

    public void setcForName(String cForName) {
        this.cForName = cForName == null ? null : cForName.trim();
    }

    public String getcForArticleId() {
        return cForArticleId;
    }

    public void setcForArticleId(String cForArticleId) {
        this.cForArticleId = cForArticleId == null ? null : cForArticleId.trim();
    }

	@Override
	public String toString() {
		return "LeaveWords [cId=" + cId + ", cName=" + cName + ", cDate=" + cDate + ", cContent=" + cContent
				+ ", cForName=" + cForName + ", cForArticleId=" + cForArticleId + "]";
	}
}