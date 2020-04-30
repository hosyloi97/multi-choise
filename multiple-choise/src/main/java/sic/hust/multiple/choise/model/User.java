/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Mr Loi Ho
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int idUser;
    private String nameUser;
    private String passwordUser;
    private String email;

    public User(String nameUser, String passwordUser) {
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
    }

    
}
