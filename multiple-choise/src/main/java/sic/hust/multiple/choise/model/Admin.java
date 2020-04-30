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
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private int idAdmin;
    private String nameAdmin;
    private String passwordAdmin;
}
