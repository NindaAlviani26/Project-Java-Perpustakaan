/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.dao;

import belajar.table.coba.model.ClassBuku;
import java.util.List;

/**
 *
 * @author user
 */
public interface BukuDao {

    public List<ClassBuku> getBuku()throws Exception;

    public void saveData(ClassBuku mdl);

    public List<ClassBuku> getDataUpdate(String Id);

    public void updateData(ClassBuku mdl);

    public void getDeleteBuku(String id);
    
}
