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
import sic.hust.multiple.choise.model.Admin;
import sic.hust.multiple.choise.model.User;
import sic.hust.multiple.choise.service.IPersonService;

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

    @Override
    public List<User> findAllUser() {
        List<User> users = new ArrayList<User>();
        try {
            users = dao.findAllUser();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return users;
    }

    @Override
    public User findUserById(int id) {
        User user = new User();
        try {
            user = dao.findUserByid(id);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return user;
    }

    @Override
    public List<Admin> findAllAdmin() {
        List<Admin> admins = new ArrayList<Admin>();
        try {
            admins = dao.findAllAdmin();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return admins;
    }

    @Override
    public Admin findAdminById(int id) {
        Admin admin = new Admin();
        try {
            admin = dao.findAdminById(id);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return admin;
    }

}
