package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CommonDao {
    private String driverType;
    private String server;
    private String db;
    private String uid;
    private String pwd;
    private Connection con;

    public CommonDao() {
        driverType = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        server = "DESKTOP-H6IIG53";
        db = "quannh";
        uid = "sa";
        pwd = "quanhen121";
    }

    // get object Statement
    private Statement getStatement() throws Exception {
        Class.forName(driverType);
        con = DriverManager.getConnection("jdbc:sqlserver://" + server + ":1433;databasename=" + db, uid, pwd);
        Statement st = con.createStatement();
        return st;
    }

    // for disconection to database
    protected void closeConnection() throws SQLException {
        con.close();
    }

    protected void execNonQuery(String strQuery) throws Exception {
        Statement st = getStatement();
        st.executeUpdate(strQuery);
        closeConnection();
    }

    protected ResultSet execSelect(String strSelect) throws Exception {
        Statement st = getStatement();
        ResultSet rs = st.executeQuery(strSelect);
        return rs;
    }
}
