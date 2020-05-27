/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.service;

import java.util.List;
import sic.hust.multiple.choise.model.Admin;
import sic.hust.multiple.choise.model.User;

/**
 *
 * @author Mr Loi Ho
 */
public interface IPersonService {

    public boolean checkRoleUser(String uname, String pass);

    public boolean checkRoleAdmin(String uname, String pass);

    public boolean addNewAccount(User user);

    public List<User> findAllUser();

    public User findUserById(int id);

    public List<Admin> findAllAdmin();

    public Admin findAdminById(int id);

}
