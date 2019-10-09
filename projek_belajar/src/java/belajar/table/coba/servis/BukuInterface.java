/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.servis;

import belajar.table.coba.dto.BukuDto;
import java.util.List;

/**
 *
 * @author user
 */
public interface BukuInterface {

    public List<BukuDto> get()throws Exception;

    public void simpanDataBuku(BukuDto dto);

    public BukuDto getUpdate(String Id);

    public void getUpdateData(BukuDto dto);

    public void getDelete(String id);

}
