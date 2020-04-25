/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.service;

import java.sql.SQLException;
import sic.hust.multiple.choise.dao.DBConnection;
import sic.hust.multiple.choise.model.User;

/**
 *
 * @author Mr Loi Ho
 */
public class PersonServiceImp implements IPersonService {

    DBConnection dao = new DBConnection();

    @Override
    public boolean checkRoleUser(String uname, String pass) {
        boolean check = false;
        try {
            check = dao.checkUserExist(uname, pass);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return check;
    }

    @Override
    public boolean checkRoleAdmin(String uname, String pass) {
        boolean check = false;
        try {
            check = dao.checkAdminExist(uname, pass);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return check;
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
