/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.daoImpl;

import belajar.table.coba.dao.LogInDao;
import belajar.table.coba.model.ClassLogIn;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author user
 */
public class LogInDaoImpl extends HibernateUtil implements LogInDao{

    @Override
    public List<ClassLogIn> getData(String username, String password) {
        List<ClassLogIn> listData = null;
        String sql = "select model from ClassLogIn model where username=:param and password=:param2 ";
        Query query = createQuery(sql).setParameter("param", username).setParameter("param2", password);
        listData = query.list();
        return listData;
    
    }
    
}
