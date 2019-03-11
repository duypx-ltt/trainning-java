package beans;

public class UserBean {
    private int userID;
    private String mailAdd;
    private String pass;
    private java.sql.Date creatAt;
    private java.sql.Date updateAt;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getMailAdd() {
        return mailAdd;
    }

    public void setMailAdd(String mailAdd) {
        this.mailAdd = mailAdd;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public java.sql.Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(java.sql.Date creatAt) {
        this.creatAt = creatAt;
    }

    public java.sql.Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(java.sql.Date updateAt) {
        this.updateAt = updateAt;
    }

}
