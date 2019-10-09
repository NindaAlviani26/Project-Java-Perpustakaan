/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.servis;

import belajar.table.coba.dto.PinjamanDto;
import java.util.List;

/**
 *
 * @author user
 */
public interface PinjamanInterface {

    public List<PinjamanDto> getDataPinjaman();

    public void DataPinjaman(PinjamanDto dto);

    public PinjamanDto getUpdateData(String id_pinjaman);

    public void getSimpanUpdate(PinjamanDto dto);
    
}
