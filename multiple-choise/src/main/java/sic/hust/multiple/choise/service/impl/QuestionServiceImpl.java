/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sic.hust.multiple.choise.dao.DBConnection;
import sic.hust.multiple.choise.model.Question;
import sic.hust.multiple.choise.service.IQuestionService;

/**
 * @author Mr Loi Ho
 */
public class QuestionServiceImpl implements IQuestionService {

    DBConnection dao = new DBConnection();

    @Override
    public List<Question> findAllQuestion() {
        List<Question> questions = new ArrayList<Question>();
        try {
            questions = dao.findAllQuestions();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return questions;
    }

    @Override
    public Question findQuestionByid(int id) {
        Question question = new Question();
        try {
            question = dao.findQuestionById(id);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return question;
    }

//    public static void main(String[] args) {
//        QuestionServiceImpl service = new QuestionServiceImpl();
//        System.out.println(service.findQuestionByid(20));
//    }

}
