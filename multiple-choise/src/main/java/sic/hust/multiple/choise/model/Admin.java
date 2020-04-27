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
@Data
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

}
