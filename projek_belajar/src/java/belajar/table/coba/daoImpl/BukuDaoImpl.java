/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.daoImpl;

import belajar.table.coba.dao.BukuDao;
import belajar.table.coba.model.ClassBuku;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author user
 */
public class BukuDaoImpl extends HibernateUtil implements BukuDao{

    @Override
    public List<ClassBuku> getBuku()throws Exception {
         List<ClassBuku> listData = null;
        try {
            String sql = "select model from ClassBuku model";
            Query qw = createQuery(sql);
            listData = qw.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }

    @Override
    public void saveData(ClassBuku mdl) {
        try {
            getSession().save(mdl);
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }

    @Override
    public List<ClassBuku> getDataUpdate(String Id) {
        List<ClassBuku> listData = null;
        try {
            String sql = "select model from ClassBuku model where id=:param1";
            Query qw = createQuery(sql).setParameter("param1", Id);
            listData = qw.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }

    @Override
    public void updateData(ClassBuku mdl) {
        try {
            getSession().saveOrUpdate(mdl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getDeleteBuku(String id)  {
        ClassBuku mdl = new ClassBuku();
        mdl.setId(id);
        getSession().delete(mdl);
    }
    
    
}
