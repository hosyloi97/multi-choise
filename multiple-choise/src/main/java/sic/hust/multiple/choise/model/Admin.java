/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.model;

/**
 *
 * @author Mr Loi Ho
 */
public class Admin {
    private int idAdmin;
    private String nameAdmin;
    private String passwordAdmin;

    public Admin() {
    }

    public Admin(int idAdmin, String nameAdmin, String passwordAdmin) {
        this.idAdmin = idAdmin;
        this.nameAdmin = nameAdmin;
        this.passwordAdmin = passwordAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNameAdmin() {
        return nameAdmin;
    }

    public void setNameAdmin(String nameAdmin) {
        this.nameAdmin = nameAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }
    
}
