/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sic.hust.multiple.choise.dao.DBConnection;
import sic.hust.multiple.choise.model.Exam;

/**
 * @author Mr Loi Ho
 */
public class ExamServiceImpl implements IExamService {

    DBConnection dao = new DBConnection();

    @Override
    public List<Exam> findAllExams() {
        List<Exam> exams = new ArrayList<Exam>();
        try {
            exams = dao.findAllExams();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return exams;
    }

    @Override
    public Exam findExamById(int id) {
        Exam exam = new Exam();
        try {
            exam = dao.findExamById(id);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return exam;
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
