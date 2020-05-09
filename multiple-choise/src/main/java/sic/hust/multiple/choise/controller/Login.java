/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sic.hust.multiple.choise.service.impl.PersonServiceImp;

/**
 *
 * @author Mr Loi Ho
 */
@WebServlet(name = "login", urlPatterns = "/login")
public class Login extends HttpServlet {

    PersonServiceImp service = new PersonServiceImp();
     
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("inpName");
        String password = req.getParameter("inpPass");

        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        session.setAttribute("pass", password); 
        System.out.println("name: "+ name +"\n pass:" + password);
        System.out.println(service.checkRoleAdmin(name, password)+"   "+service.checkRoleUser(name, password));
        if (service.checkRoleAdmin(name, password)) {
            resp.sendRedirect("HomeAdmin.jsp");
        } else 
        if (service.checkRoleUser(name, password)){
            resp.sendRedirect("HomeUser.jsp");
        }else {
            resp.sendRedirect("Login.jsp");
        }
    }

}

