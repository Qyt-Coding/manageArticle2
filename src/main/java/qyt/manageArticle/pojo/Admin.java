package qyt.manageArticle.pojo;

public class Admin {
    private Integer aId;

    private String aName;

    private String aPassword;

    private String aPhone;

    private String aCheckcode;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword == null ? null : aPassword.trim();
    }

    public String getaPhone() {
        return aPhone;
    }

    public void setaPhone(String aPhone) {
        this.aPhone = aPhone == null ? null : aPhone.trim();
    }

    public String getaCheckcode() {
        return aCheckcode;
    }

    public void setaCheckcode(String aCheckcode) {
        this.aCheckcode = aCheckcode == null ? null : aCheckcode.trim();
    }

	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", aName=" + aName + ", aPassword=" + aPassword + ", aPhone=" + aPhone
				+ ", aCheckcode=" + aCheckcode + "]";
	}
    
    
    
}