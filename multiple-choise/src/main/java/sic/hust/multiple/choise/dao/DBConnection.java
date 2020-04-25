package sic.hust.multiple.choise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sic.hust.multiple.choise.model.User;

public class DBConnection {

    static Connection conn = null;

    public static void connect() throws SQLException {
        if (conn == null || conn.isClosed()) {
            try {
                System.out.println("\n<===========================================================Connecting database============================================================>");
                Class.forName(DBInfo.JDBC_DRIVER);
            } catch (ClassNotFoundException e) {
                System.out.println(e.toString());
            }

            conn = DriverManager.getConnection(DBInfo.DB_URL, DBInfo.USER, DBInfo.PASSWORD);
        }
    }

    public static void disconnect() throws SQLException {
        if (conn != null || !conn.isClosed()) {
            conn.close();
        }
    }

    public boolean checkUserExist(String uname, String pass) throws SQLException {
        boolean check = false;
        String sql = "select * from account_user where name=? and password=?";
        connect();

        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, uname);
        state.setString(2, pass);
        ResultSet rs = state.executeQuery();
        if (rs.next()) {
            check = true;
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("password"));
        }

        state.close();
        disconnect();
        return check;
    }
    
    public boolean checkAdminExist(String uname, String pass) throws SQLException {
        boolean check = false;
        String sql = "select * from account_admin where name=? and password=?";
        connect();

        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, uname);
        state.setString(2, pass);
        ResultSet rs = state.executeQuery();
        if (rs.next()) {
            check = true;
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("password"));
        }

        state.close();
        disconnect();
        return check;
    }
    
    public boolean addNewUser(User user) throws SQLException{
        boolean check = false;
        String sql = "insert into account_user(name, `password`) VALUES(?,?)";
        connect();
        
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, user.getNameUser());
        state.setString(2, user.getPasswordUser());
        
        check = state.executeUpdate() > 0;
        
        state.close();
        disconnect();
        return check;
    }

//    public static void main(String[] args) throws SQLException {
//        DBConnection dao = new DBConnection();
//        User user = new User("user2", "1234");
//        System.out.println(dao.checkUserExist("mrloiho", "1234"));
//        System.out.println(dao.checkAdminExist("admin1", "1234"));
//        System.out.println(dao.addNewUser(user));
//    }

   
}
