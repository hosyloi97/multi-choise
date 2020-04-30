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
import sic.hust.multiple.choise.model.Exam;
import sic.hust.multiple.choise.model.User;
import sic.hust.multiple.choise.service.IExamService;

/**
 * @author Mr Loi Ho
 */
public class ExamServiceImpl implements IExamService {

    DBConnection dao = new DBConnection();

    @Override
    public List<Exam> findAllExams() {
        List<Exam> exams = new ArrayList<Exam>();
        try {
            exams = dao.findAllExam();
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

    public static void main(String[] args) {
       ExamServiceImpl service = new ExamServiceImpl();
        System.out.println(service.findExamById(1));
    }

}
