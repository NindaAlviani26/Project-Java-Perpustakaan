/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.servis;

import belajar.table.coba.dto.LogInDto;

/**
 *
 * @author user
 */
public interface LogInInterface {

    public LogInDto getUsername(String username, String password);
    
}
