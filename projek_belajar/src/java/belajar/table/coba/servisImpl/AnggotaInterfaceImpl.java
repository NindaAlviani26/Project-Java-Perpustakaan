/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.servisImpl;

import belajar.table.coba.dao.AnggotaDao;
import belajar.table.coba.dto.AnggotaDto;
import belajar.table.coba.dto.BukuDto;
import belajar.table.coba.model.ClassAnggota;
import belajar.table.coba.servis.AnggotaInterface;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Service
@Transactional
public class AnggotaInterfaceImpl implements AnggotaInterface{
    @Autowired
    AnggotaDao daoAnggota;
    
    @Override
    public List<AnggotaDto> getDataAnggota() throws Exception{
        List<AnggotaDto> dataDto = new ArrayList<>();
        List<ClassAnggota> model = daoAnggota.getDataAnggota();
        AnggotaDto Dto=null;
        if (model != null) {
            for(ClassAnggota mdl:model) {
                Dto = new AnggotaDto();
                if (mdl.getNo()!= null) {
                    Dto.setNo(mdl.getNo());
                }if (mdl.getNama()!=null) {
                    Dto.setNama(mdl.getNama());
                }if (mdl.getJurusan()!=null) {
                    Dto.setJurusan(mdl.getJurusan());
                }if (mdl.getAlamat()!=null) {
                    Dto.setAlamat(mdl.getAlamat());
                }
                dataDto.add(Dto);
            }
        }
        return dataDto;
   
    }

    @Override
    public void DataAnggota(AnggotaDto dto) {
        ClassAnggota mdl=new ClassAnggota();
        mdl.setNo(dto.getNo());
        mdl.setNama(dto.getNama());
        mdl.setJurusan(dto.getJurusan());
        mdl.setAlamat(dto.getAlamat());
        daoAnggota.saveData(mdl);
    }

    @Override
    public AnggotaDto getUpdateData(String id) {
        List<ClassAnggota> model = daoAnggota.getDataById(id);
        AnggotaDto Dto= new AnggotaDto();
        if (model != null) {
            for(ClassAnggota mdl:model) {
                if (mdl.getNo()!= null) {
                    Dto.setNo(mdl.getNo());
                }if (mdl.getNama()!=null) {
                    Dto.setNama(mdl.getNama());
                }if (mdl.getJurusan()!=null) {
                    Dto.setJurusan(mdl.getJurusan());
                }if (mdl.getAlamat()!=null) {
                    Dto.setAlamat(mdl.getAlamat());
                }
            }
        }
        return Dto;
    }

    @Override
    public void getSimpanUpdate(AnggotaDto dto) {
        ClassAnggota mdl = new ClassAnggota();
        mdl.setNo(dto.getNo());
        mdl.setNama(dto.getNama());
        mdl.setJurusan(dto.getJurusan());
        mdl.setAlamat(dto.getAlamat());
        daoAnggota.updateData(mdl);
    }

    @Override
    public void getDelete(String id) {
        daoAnggota.deleteAnggota(id);
    }


    
}
