/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.daoImpl;

import belajar.table.coba.dao.PinjamanDao;
import belajar.table.coba.model.ClassPinjaman;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author user
 */
public class PinjamanDaoImpl extends HibernateUtil implements PinjamanDao{

    @Override
    public List<ClassPinjaman> getDataAnggota() {
      List<ClassPinjaman> listData = null;
        try {
            String sql = "select model from ClassPinjaman model";
            Query qw = createQuery(sql);
            listData = qw.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
      
    }

    @Override
    public void saveData(ClassPinjaman mdl) {
        try {
            getSession().save(mdl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ClassPinjaman> getDataPinjaman(String id_pinjaman) {
        List<ClassPinjaman> listData = null;
        try {
            String sql = "select model from ClassPinjaman model where id_pinjaman=:param1";
            Query qw = createQuery(sql).setParameter("param1", id_pinjaman);
            listData = qw.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
        
    }

    @Override
    public void UpdateData(ClassPinjaman mdl) {
        try {
            getSession().saveOrUpdate(mdl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
