/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sic.hust.multiple.choise.model.User;
import sic.hust.multiple.choise.service.impl.PersonServiceImp;

/**
 *
 * @author Mr Loi Ho
 */
@WebServlet(name = "signup", urlPatterns = "/signup")
public class Signup extends HttpServlet {

    PersonServiceImp service = new PersonServiceImp();
    User user = new User();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("inpName");
        String password = req.getParameter("inpPass");
        String email = req.getParameter("inpEmail");
//        System.out.println("name: " + name + "\n pass:" + password + "\n email" + email);
        user.setNameUser(name);
        user.setPasswordUser(password);
        user.setEmail(email);
        System.out.println(user);
        boolean result = service.addNewAccount(user);
        if (result) {
            System.out.println("Signup successfull with " + user);
            resp.sendRedirect("Login.jsp");

        } else {
            System.out.println("Signup fail!!");
            resp.sendRedirect("Login.jsp");

        }
    }

}
