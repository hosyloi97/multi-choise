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
public class User {
    private int idUser;
    private String nameUser;
    private String passwordUser;
    private String email;

    public User() {
    }

    public User(String nameUser, String passwordUser, String email) {
//        this.idUser = idUser;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.email = email;
    }

    public User(String nameUser, String passwordUser) {
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
    
    
}
