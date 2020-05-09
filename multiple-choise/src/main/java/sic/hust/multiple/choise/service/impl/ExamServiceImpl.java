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
import sic.hust.multiple.choise.model.Question;
import sic.hust.multiple.choise.service.IExamService;

/**
 * @author Mr Loi Ho
 */
public class ExamServiceImpl implements IExamService {

    DBConnection dao = new DBConnection();
    QuestionServiceImpl service = new QuestionServiceImpl();

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
            exam.setListQuestions(getListQuestion(exam.getIdQues()));
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return exam;
    }
    
    
    private List<Integer> convertStringToListInt(String listQues){
        List<Integer> indexQues = new ArrayList<Integer>();
        while (!listQues.isEmpty()){
            if (listQues.contains(";")){
                String s = listQues.substring(0, listQues.indexOf(";"));
                listQues = listQues.substring(listQues.indexOf(";")+1,listQues.length());
                indexQues.add(Integer.parseInt(s));
            }else{
                indexQues.add(Integer.parseInt(listQues));
                listQues = "";
            }
        }
        return indexQues;
    }
    public List<Question> getListQuestion(String listQues){
        List<Question> questions = new ArrayList<Question>();
        List<Integer> indexes = convertStringToListInt(listQues);
        for (Integer index : indexes) {
            Question question = service.findQuestionByid(index);
            questions.add(question);
        }
        return questions;
    }

//    public static void main(String[] args) {
//       ExamServiceImpl servic = new ExamServiceImpl();
////       String listQues = "1,2,3,4";
////       List<Integer> ints = servic.convertStringToListInt(listQues);
////        System.out.println(ints);
////        System.out.println(servic.getListQuestion(listQues));
//            System.out.println(servic.findExamById(1));
//            Exam exam = servic.findExamById(1);
////            System.out.println(exam.getIdQues());
////           System.out.println(servic.getListQuestion(exam.getIdQues()));
//    }

}
