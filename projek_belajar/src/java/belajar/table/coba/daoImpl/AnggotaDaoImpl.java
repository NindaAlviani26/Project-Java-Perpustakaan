/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.daoImpl;

import belajar.table.coba.dao.AnggotaDao;
import belajar.table.coba.model.ClassAnggota;
import java.util.List;
import org.hibernate.Query;


/**
 *
 * @author user
 */
public class AnggotaDaoImpl extends HibernateUtil implements AnggotaDao{

    @Override
    public List<ClassAnggota> getDataAnggota() throws Exception{
        List<ClassAnggota> listData = null;
        String Sql = "select model from ClassAnggota model" ;
        Query qr = createQuery(Sql);
        listData = qr.list();
        return listData;
    }

    @Override
    public void saveData(ClassAnggota mdl) {
        try {
            getSession().save(mdl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ClassAnggota> getDataById(String id) {
        List<ClassAnggota> listData = null;
        try {
            String sql = "select model from ClassAnggota model where no=:param1";
            Query qw = createQuery(sql).setParameter("param1", id);
            listData = qw.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }

    @Override
    public void updateData(ClassAnggota mdl) {
        try {
            getSession().saveOrUpdate(mdl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAnggota(String id) {
        try {
            ClassAnggota mdl = new ClassAnggota();
            mdl.setNo(id);
            getSession().delete(mdl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
