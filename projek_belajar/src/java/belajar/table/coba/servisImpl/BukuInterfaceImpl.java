/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.servisImpl;

import belajar.table.coba.dao.BukuDao;
import belajar.table.coba.dto.BukuDto;
import belajar.table.coba.model.ClassBuku;
import belajar.table.coba.servis.BukuInterface;
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
public class BukuInterfaceImpl implements BukuInterface{
    @Autowired
    BukuDao bukuDaointerface;
    
    @Override
    public List<BukuDto> get() throws Exception {
        List<BukuDto> dataDto = new ArrayList<>();
        List<ClassBuku> model = bukuDaointerface.getBuku();
        BukuDto Dto=null;
        if (model != null) {
            for(ClassBuku mdl:model) {
                Dto = new BukuDto();
                if (mdl.getId()!= null) {
                    Dto.setId(mdl.getId());
                }if (mdl.getNama_buku()!=null) {
                    Dto.setNama_buku(mdl.getNama_buku());
                }if (mdl.getKategori()!=null) {
                    Dto.setKategori(mdl.getKategori());
                }
                dataDto.add(Dto);
            }
        }
        return dataDto;
   
    }

    @Override
    public void simpanDataBuku(BukuDto dto) {
        ClassBuku mdl=new ClassBuku();
        mdl.setId(dto.getId());
        mdl.setNama_buku(dto.getNama_buku());
        mdl.setKategori(dto.getKategori());
        bukuDaointerface.saveData(mdl);
    }

    @Override
    public BukuDto getUpdate(String Id) {
        List<ClassBuku> model = bukuDaointerface.getDataUpdate(Id);
        BukuDto Dto=new  BukuDto();
        if (model != null) {
            for(ClassBuku mdl:model) {
                Dto = new BukuDto();
                if (mdl.getId()!= null) {
                    Dto.setId(mdl.getId());
                }if (mdl.getNama_buku()!=null) {
                    Dto.setNama_buku(mdl.getNama_buku());
                }if (mdl.getKategori()!=null) {
                    Dto.setKategori(mdl.getKategori());
                }
            }
        }
        return Dto;
    }

    @Override
    public void getUpdateData(BukuDto dto) {
        ClassBuku mdl=new ClassBuku();
        mdl.setId(dto.getId());
        mdl.setNama_buku(dto.getNama_buku());
        mdl.setKategori(dto.getKategori());
        bukuDaointerface.updateData(mdl);
    }

    @Override
    public void getDelete(String id) {
        bukuDaointerface.getDeleteBuku(id);
                
    }

    
}
