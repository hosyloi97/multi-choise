/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.controller;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sic.hust.multiple.choise.model.User;
import sic.hust.multiple.choise.service.PersonServiceImp;

/**
 *
 * @author Mr Loi Ho
 */
@WebServlet("/signup")
public class Signup extends HttpServlet {

    PersonServiceImp service = new PersonServiceImp();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("inpName");
        String password = req.getParameter("inpPass");
        String email = req.getParameter("inpEmail");
        
        User user= new User(name, password, email);
        String result = (service.addNewAccount(user)) ? "success" :"false";
        log(result);
//        PrintWriter out = new PrintWriter();
    }
}
