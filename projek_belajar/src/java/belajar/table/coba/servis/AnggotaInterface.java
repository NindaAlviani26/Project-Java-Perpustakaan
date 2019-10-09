/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.servis;

import belajar.table.coba.dto.AnggotaDto;
import belajar.table.coba.dto.BukuDto;
import java.util.List;

/**
 *
 * @author user
 */
public interface AnggotaInterface {

    public List<AnggotaDto> getDataAnggota()throws Exception;

    public void DataAnggota(AnggotaDto dto);

    public AnggotaDto getUpdateData(String id);

    public void getSimpanUpdate(AnggotaDto dto);

    public void getDelete(String id);


    
}
