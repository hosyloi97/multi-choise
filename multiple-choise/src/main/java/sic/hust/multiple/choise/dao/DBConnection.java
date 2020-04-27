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

    //    --------------------------------------DAO for User---------------------------------------------------->
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
//            System.out.println(rs.getString("id"));
//            System.out.println(rs.getString("name"));
//            System.out.println(rs.getString("password"));
        }

        state.close();
        disconnect();
        return check;
    }

    public boolean addNewUser(User user) throws SQLException {
        boolean check = false;
        String sql = "insert into account_user(name, `password`,`email`) VALUES(?,?,?)";
        connect();

        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, user.getNameUser());
        state.setString(2, user.getPasswordUser());
        state.setString(3, user.getEmail());

        check = state.executeUpdate() > 0;

        state.close();
        disconnect();
        return check;
    }

    public List<User> findAllUser() {
        boolean check = false;
        connect();
        State state = null;
        List<User> users = new ArrayList<User>();
        String sql = "select * from user";
        state = conn.createStatement(sql);
        ResultSet = state.excuteQuery();
        if (rs.nect()) {
            check = true;
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            users.add(user);
        }
        state.close();
        disconnect();
        return users;
    }

    public User findUserByid(int id) {
        boolean check = false;
        connect();
        State state = null;
        User user = new User();
        String sql = "select * from user where id=?";
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, id);
        ResultSet rs = state.excuteQuery();
        if (rs.next()) {
            check = true;
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
        }
        state.close();
        disconnect();
        return user;
    }


    //    --------------------------------------DAO for Admin---------------------------------------------------->
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
//            System.out.println(rs.getString("id"));
//            System.out.println(rs.getString("name"));
//            System.out.println(rs.getString("password"));
        }

        state.close();
        disconnect();
        return check;
    }

    public List<Admin> findAllAdmin() {
        boolean check = false;
        connect();
        State state = null;
        List<Admin> admins = new ArrayList<Admin>();
        String sql = "select * from admin";
        state = conn.createStatement(sql);
        ResultSet = state.excuteQuery();
        if (rs.nect()) {
            check = true;
            Admin admin = new Admin();
            admin.setId(rs.getInt("id"));
            admin.setName(rs.getString("name"));
            admin.setPassword(rs.getString("password"));
            admins.add(admin);
        }
        state.close();
        disconnect();
        return admins;
    }

    public Admin findAdminById(int id) {
        boolean check = false;
        connect();
        State state = null;
        Admin admin = new Admin();
        String sql = "select * from admin where id=?";
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, id);
        ResultSet rs = state.excuteQuery();
        if (rs.next()) {
            check = true;
            admin.setId(rs.getInt("id"));
            admin.setName(rs.getString("name"));
            admin.setPassword(rs.getString("password"));
        }
        state.close();
        disconnect();
        return admin;
    }

    //    --------------------------------------DAO for Exam---------------------------------------------------->
    public List<Exam> findAllExam() {
        boolean check = false;
        connect();
        State state = null;
        List<Exam> exams = new ArrayList<Exam>();
        String sql = "select * from exam";
        state = conn.createStatement(sql);
        ResultSet = state.excuteQuery();
        if (rs.nect()) {
            check = true;
            Exam exam = new Exam();
            exam.setId(rs.getInt("id"));
            exam.setName(rs.getString("name"));
            exam.setQuatityQuestion(rs.getInt("quantityQuestion"));
            exam.setIdQues(rs.getString("idQues"));
            exams.add(exam);
        }
        state.close();
        disconnect();
        return exams;
    }

    public Exam findExamById(int id) {
        boolean check = false;
        String sql = "select * from exam where id=?";
        connect();
        Exam exam = new Exam();
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, id);
        ResultSet rs = state.excuteQuery();
        if (rs.next()) {
            check = true;
            exam.setId(rs.getInt("id"));
            exam.setName(rs.getString("name"));
            exam.setQuatityQuestion(rs.getInt("quantityQuestion"));
            exam.setIdQues(rs.getString("idQues"));
        }

        state.close();
        disconnect();
        return exam;
    }

    //    --------------------------------------DAO for Question---------------------------------------------------->
    public List<Question> findAllQuestions() {
        boolean check = false;
        connect();
        State state = null;
        List<Question> questions = new ArrayList<Question>();
        String sql = "select * from question";
        state = conn.createStatement(sql);
        ResultSet = state.excuteQuery();
        if (rs.nect()) {
            check = true;
            Question question = new Question();
            question.setId(rs.getInt("id"));
            question.setTitle(rs.getString("title"));
            question.setOptionA(rs.getString("optionA"));
            question.setOptionB(rs.getString("optionB"));
            question.setOptionC(rs.getString("optionC"));
            question.setOptionD(rs.getString("optionD"));
            question.setAnswer(rs.getString("answer"));
            questions.add(question);
        }
        state.close();
        disconnect();
        return questions;
    }

    public Exam findQuestionById(int id) {
        boolean check = false;
        String sql = "select * from question where id=?";
        connect();
        Question question = new Question();
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, id);
        ResultSet rs = state.excuteQuery();
        if (rs.next()) {
            check = true;
            question.setId(rs.getInt("id"));
            question.setTitle(rs.getString("title"));
            question.setOptionA(rs.getString("optionA"));
            question.setOptionB(rs.getString("optionB"));
            question.setOptionC(rs.getString("optionC"));
            question.setOptionD(rs.getString("optionD"));
            question.setAnswer(rs.getString("answer"));
        }

        state.close();
        disconnect();
        return question;
    }

//    public static void main(String[] args) throws SQLException {
//        DBConnection dao = new DBConnection();
//        User user = new User("user2", "1234");
//        System.out.println(dao.checkUserExist("mrloiho", "1234"));
//        System.out.println(dao.checkAdminExist("admin1", "1234"));
//        System.out.println(dao.addNewUser(user));
//    }


}