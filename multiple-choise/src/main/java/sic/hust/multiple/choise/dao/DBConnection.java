package sic.hust.multiple.choise.dao;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sic.hust.multiple.choise.model.Admin;
import sic.hust.multiple.choise.model.Exam;
import sic.hust.multiple.choise.model.Question;
import sic.hust.multiple.choise.model.Topic;

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
        while (rs.next()) {
            check = true;
        }
        rs.close();
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

    public List<User> findAllUser() throws SQLException {
        connect();
        Statement state = null;
        List<User> users = new ArrayList<User>();
        state = conn.createStatement();
        String sql = "select * from account_user";
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setNameUser(rs.getString("name"));
            user.setPasswordUser(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            users.add(user);
        }
        rs.close();
        state.close();
        disconnect();
        return users;
    }

    public User findUserByid(int id) throws SQLException {
        connect();
        User user = new User();
        String sql = "select * from account_user where id=?";
        PreparedStatement state = conn.prepareStatement(sql);
        state.setInt(1, id);
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            user.setId(rs.getInt("id"));
            user.setNameUser(rs.getString("name"));
            user.setPasswordUser(rs.getString("password"));
            user.setEmail(rs.getString("email"));
        }
        rs.close();
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
        while (rs.next()) {
            check = true;
        }
        rs.close();
        state.close();
        disconnect();
        return check;
    }

    public List<Admin> findAllAdmin() throws SQLException {
        connect();
        Statement state = null;
        List<Admin> admins = new ArrayList<Admin>();
        String sql = "select * from account_admin";
        state = conn.createStatement();
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            Admin admin = new Admin();
            admin.setId(rs.getInt("id"));
            admin.setNameAdmin(rs.getString("name"));
            admin.setPasswordAdmin(rs.getString("password"));
            admins.add(admin);
        }
        rs.close();
        state.close();
        disconnect();
        return admins;
    }

    public Admin findAdminById(int id) throws SQLException {
        boolean check = false;
        connect();
        Admin admin = new Admin();
        String sql = "select * from account_admin where id=?";
        PreparedStatement state = conn.prepareStatement(sql);
        state.setInt(1, id);
        ResultSet rs = state.executeQuery(sql);
        if (rs.next()) {
            check = true;
            admin.setId(rs.getInt("id"));
            admin.setNameAdmin(rs.getString("name"));
            admin.setPasswordAdmin(rs.getString("password"));
        }
        state.close();
        disconnect();
        return admin;
    }

    //    --------------------------------------DAO for Exam---------------------------------------------------->
    public List<Exam> findAllExam() throws SQLException {
        boolean check = false;
        connect();
        Statement state = null;
        List<Exam> exams = new ArrayList<Exam>();
        String sql = "select * from exam";
        state = conn.createStatement();
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            check = true;
            Exam exam = new Exam();
            exam.setId(rs.getInt("id"));
            exam.setName(rs.getString("nameExam"));
            exam.setQuantityQues(rs.getInt("quantityQuestion"));
            exam.setIdQues(rs.getString("idQues"));
            exams.add(exam);
        }
        state.close();
        disconnect();
        return exams;
    }

    public Exam findExamById(int id) throws SQLException {
        String sql = "select * from exam where id=?";
        connect();
        Exam exam = new Exam();
        PreparedStatement state = conn.prepareStatement(sql);
        state.setInt(1, id);
        ResultSet rs = state.executeQuery();
        if (rs.next()) {
            exam.setId(rs.getInt("id"));
            exam.setName(rs.getString("nameExam"));
            exam.setQuantityQues(rs.getInt("quantityQuestion"));
            exam.setIdQues(rs.getString("idQues"));
        }
        rs.close();
        state.close();
        disconnect();
        return exam;
    }

    //    --------------------------------------DAO for Question---------------------------------------------------->
    public List<Question> findAllQuestions() throws SQLException {
        connect();
        Statement state = null;
        List<Question> questions = new ArrayList<Question>();
        String sql = "select * from question";
        state = conn.createStatement();
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            Question question = new Question();
            question.setId(rs.getInt("id"));
            question.setTitle(rs.getString("title"));
            question.setTopicId(rs.getInt("topicId"));
            question.setOptionA(rs.getString("optionA"));
            question.setOptionB(rs.getString("optionB"));
            question.setOptionC(rs.getString("optionC"));
            question.setOptionD(rs.getString("optionD"));
            question.setAnswer(rs.getString("answer"));
            questions.add(question);
        }
        rs.close();
        state.close();
        disconnect();
        return questions;
    }

    public Question findQuestionById(int id) throws SQLException {
        String sql = "select * from question where id=?";
        connect();
        Question question = new Question();
        PreparedStatement state = conn.prepareStatement(sql);
        state.setInt(1, id);
        ResultSet rs = state.executeQuery();
        if (rs.next()) {
            question.setId(rs.getInt("id"));
            question.setTitle(rs.getString("title"));
            question.setTopicId(rs.getInt("topicId"));
            question.setOptionA(rs.getString("optionA"));
            question.setOptionB(rs.getString("optionB"));
            question.setOptionC(rs.getString("optionC"));
            question.setOptionD(rs.getString("optionD"));
            question.setAnswer(rs.getString("answer"));
        }
        rs.close();
        state.close();
        disconnect();
        return question;
    }

    public boolean addNewQuestion(Question question) throws SQLException {
        boolean check = false;
        String sql = "insert into question(title, optionA,optionB,optionC,optionD,answer,topicId) VALUES(?,?,?,?,?,?,?)";
        connect();

        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, question.getTitle());
        state.setInt(7, question.getTopicId());
        state.setString(2, question.getOptionA());
        state.setString(3, question.getOptionB());
        state.setString(4, question.getOptionC());
        state.setString(5, question.getOptionD());
        state.setString(6, question.getAnswer());

        check = state.executeUpdate() > 0;
        state.close();
        disconnect();
        return check;
    }

    //    --------------------------------------DAO for Topic---------------------------------------------------->
    public List<Topic> findAllTopics() throws SQLException {
        connect();
        Statement state = null;
        List<Topic> topics = new ArrayList<Topic>();
        String sql = "select * from topic";
        state = conn.createStatement();
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            Topic topic = new Topic();
            topic.setId(rs.getInt("id"));
            topic.setName(rs.getString("name"));
            topics.add(topic);
        }
        rs.close();
        state.close();
        disconnect();
        return topics;
    }

    public Topic findTopicById(int id) throws SQLException {
        String sql = "select * from topic where id=?";
        connect();
        Topic topic = new Topic();
        PreparedStatement state = conn.prepareStatement(sql);
        state.setInt(1, id);
        ResultSet rs = state.executeQuery();
        if (rs.next()) {
            topic.setId(rs.getInt("id"));
            topic.setName(rs.getString("name"));
        }
        rs.close();
        state.close();
        disconnect();
        return topic;
    }

//    public static void main(String[] args) throws SQLException {
//        DBConnection dao = new DBConnection();
//        System.out.println(dao.findAllTopics());
////        Question question = new Question("title", 1, "optionA", "optionB", "optionC", "optionD", "A");
////        dao.addNewQuestion(question);
//    }
}
