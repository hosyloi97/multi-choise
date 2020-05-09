/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sic.hust.multiple.choise.dao.DBConnection;
import sic.hust.multiple.choise.service.impl.PersonServiceImp;

/**
 *
 * @author Mr Loi Ho
 */
@WebServlet("/home")
public class Home extends HttpServlet{

    PersonServiceImp service = new PersonServiceImp();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("inpName");
        String password = req.getParameter("inpPass");
        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        session.setAttribute("pass", password);
        if (service.checkRoleAdmin(name, password)){
            resp.sendRedirect("AdminLogout.jsp");
        }else
        if (service.checkRoleUser(name, password)){
            resp.sendRedirect("UserLogout.jsp");
        } else{
            resp.sendRedirect("Login.jsp");
        }
        
        
    }
    
    
}
