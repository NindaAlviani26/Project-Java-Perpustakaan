/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.dao;

import belajar.table.coba.model.ClassAnggota;
import belajar.table.coba.model.ClassBuku;
import java.util.List;

/**
 *
 * @author user
 */
public interface AnggotaDao {

    public List<ClassAnggota> getDataAnggota()throws Exception;

    public void saveData(ClassAnggota mdl);

    public List<ClassAnggota> getDataById(String id);

    public void updateData(ClassAnggota mdl);

    public void deleteAnggota(String id);

}
