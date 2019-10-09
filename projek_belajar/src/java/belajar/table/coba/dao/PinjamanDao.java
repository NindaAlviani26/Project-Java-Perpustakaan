/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.dao;

import belajar.table.coba.model.ClassPinjaman;
import java.util.List;

/**
 *
 * @author user
 */
public interface PinjamanDao {

    public List<ClassPinjaman> getDataAnggota();

    public void saveData(ClassPinjaman mdl);

    public List<ClassPinjaman> getDataPinjaman(String id_pinjaman);

    public void UpdateData(ClassPinjaman mdl);
    
}
