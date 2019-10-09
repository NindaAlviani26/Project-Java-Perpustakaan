/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.dao;

import belajar.table.coba.model.ClassLogIn;
import java.util.List;

/**
 *
 * @author user
 */
public interface LogInDao {

    public List<ClassLogIn> getData(String username, String password);
    
}
