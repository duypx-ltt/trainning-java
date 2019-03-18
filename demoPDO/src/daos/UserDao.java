package daos;

import java.sql.ResultSet;

import beans.UserBean;

public class UserDao extends CommonDao {
    public void insert(UserBean obj) throws Exception {
        String strQuery = "insert into tblUser values ('" + obj.getMailAdd() + "','" + obj.getPass() + "','"
                + obj.getCreatAt() + "','" + obj.getUpdateAt() + "')";
        execNonQuery(strQuery);
    }

    public boolean checkPass(UserBean obj) throws Exception {
        String strSelect = "select * from tblUser where mail_address ='" + obj.getMailAdd() + "' and pass='"
                + obj.getPass() + "'";
        ResultSet rs = execSelect(strSelect);
        boolean isAccountValid = true;
        if (rs.next()) {
            isAccountValid = true;
        } else {
            isAccountValid = false;
        }
        return isAccountValid;
    }

    public boolean checkEmail(UserBean obj) throws Exception {
        String strSelect = "select * from tblUser where mail_address ='" + obj.getMailAdd() + "'";
        ResultSet rs = execSelect(strSelect);
        boolean isAccountValid = true;
        if (rs.next()) {
            isAccountValid = true;
        } else {
            isAccountValid = false;
        }
        return isAccountValid;
    }

}
