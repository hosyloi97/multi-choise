/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.service;

import java.sql.SQLException;

import sic.hust.multiple.choise.dao.DBConnection;
import sic.hust.multiple.choise.model.Question;

/**
 * @author Mr Loi Ho
 */
public class QuestionServiceImpl implements IQuestionService {

    DBConnection dao = new DBConnection();

    @Override
    public List<Question> findAllQuestions() {
        List<Quesion> questions = new ArrayList<Question>();
        try {
            questions = dao.findAllQuestions();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return questions;
    }

    @Override
    public Question fingQuestionById(int id) {
        Question question = new Question();
        try {
            exam = dao.findQuestionById(id);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return question;
    }

//    public static void main(String[] args) {
//        PersonServiceImp service = new PersonServiceImp();
//        System.out.println(service.checkRoleAdmin("admin1","1234"));
//        System.out.println(service.checkRoleUser("mrloiho","1234"));
//    }

    @Override
    public boolean addNewAccount(User user) {
        boolean check = false;
        try {
            check = dao.addNewUser(user);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return check;
    }

}
