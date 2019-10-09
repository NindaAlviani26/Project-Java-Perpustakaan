/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.servisImpl;

import belajar.table.coba.dao.LogInDao;
import belajar.table.coba.dto.LogInDto;
import belajar.table.coba.model.ClassLogIn;
import belajar.table.coba.servis.LogInInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author user
 */
public class LogInInterfaceImpl implements LogInInterface{
    @Autowired
    LogInDao   daoLogin;
    @Override
    public LogInDto getUsername(String username, String password) {
    List<ClassLogIn> model = daoLogin.getData(username,password);
       LogInDto dataDto = new LogInDto();
       if (model!=null) {
            for (ClassLogIn mdl:model){
                if (mdl.getUsername()!=null) {
                    dataDto.setUsername(mdl.getUsername());
                }if (mdl.getPassword()!=null) {
                    dataDto.setPassword(mdl.getPassword());
                }
            }
        }
        return dataDto;     
    }
    
}
