///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package sic.hust.multiple.choise.controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import sic.hust.multiple.choise.model.Exam;
//import sic.hust.multiple.choise.service.impl.ExamServiceImpl;
//
///**
// *
// * @author Mr Loi Ho
// */
//@WebServlet(name = "loadData", urlPatterns = {"/loadData"})
//public class loadData extends HttpServlet {
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        ExamServiceImpl service = new ExamServiceImpl();
//        List<Exam> exams = service.findAllExams();
//        request.setAttribute("quantity", exams.size());
//        int i = 1;
//        for (Exam exam : exams) {
//            request.setAttribute("exam"+ i, exam.getName());
//            i++;
//        }
//        request.getRequestDispatcher("HomeGuest.jsp").forward(request, response);
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
