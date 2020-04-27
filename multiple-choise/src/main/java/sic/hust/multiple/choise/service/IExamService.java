/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.service;

import sic.hust.multiple.choise.model.Exam;

/**
 *
 * @author Mr Loi Ho
 */
public interface IExamService {

    public List<Exam> findAllExams();

    public Exam findExamById(int id);
}
