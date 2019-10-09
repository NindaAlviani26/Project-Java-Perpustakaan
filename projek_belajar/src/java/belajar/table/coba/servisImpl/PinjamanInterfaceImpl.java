/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.servisImpl;

import belajar.table.coba.dao.PinjamanDao;
import belajar.table.coba.dto.PinjamanDto;
import belajar.table.coba.model.ClassPinjaman;
import belajar.table.coba.servis.PinjamanInterface;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author user
 */
public class PinjamanInterfaceImpl implements PinjamanInterface{
    @Autowired
    PinjamanDao daoPinjaman;
    
    @Override
    public List<PinjamanDto> getDataPinjaman() {
        List<PinjamanDto> dataDto = new ArrayList<>();
        List<ClassPinjaman> model = daoPinjaman.getDataAnggota();
        PinjamanDto Dto=null;
        if (model != null) {
            for(ClassPinjaman mdl:model) {
                Dto = new PinjamanDto();
                if (mdl.getId_pinjaman()!= null) {
                    Dto.setId_pinjaman(mdl.getId_pinjaman());
                }if (mdl.getId_anggota()!=null) {
                    Dto.setId_anggota(mdl.getId_anggota());
                }if (mdl.getId_buku()!=null) {
                    Dto.setId_buku(mdl.getId_buku());
                }if (mdl.getTgl_pinjam()!=null) {
                    Dto.setTgl_pinjam(mdl.getTgl_pinjam());
                }if (mdl.getTgl_kembali()!=null) {
                    Dto.setTgl_kembali(mdl.getTgl_kembali());
                }                
                dataDto.add(Dto);
            }
        }
        return dataDto;
     
    }

    @Override
    public void DataPinjaman(PinjamanDto dto) {
        ClassPinjaman mdl=new ClassPinjaman();
        mdl.setId_pinjaman(dto.getId_pinjaman());
        mdl.setId_anggota(dto.getId_anggota());
        mdl.setId_buku(dto.getId_buku());
        mdl.setTgl_pinjam(dto.getTgl_pinjam());
        mdl.setTgl_kembali(dto.getTgl_kembali());
        daoPinjaman.saveData(mdl);
    }

    @Override
    public PinjamanDto getUpdateData(String id_pinjaman) {
        List<ClassPinjaman> model = daoPinjaman.getDataPinjaman(id_pinjaman);
        PinjamanDto Dto=new PinjamanDto();
        if (model != null) {
            for(ClassPinjaman mdl:model) {
                if (mdl.getId_pinjaman()!= null) {
                    Dto.setId_pinjaman(mdl.getId_pinjaman());
                }if (mdl.getId_anggota()!=null) {
                    Dto.setId_anggota(mdl.getId_anggota());
                }if (mdl.getId_buku()!=null) {
                    Dto.setId_buku(mdl.getId_buku());
                }if (mdl.getTgl_pinjam()!=null) {
                    Dto.setTgl_pinjam(mdl.getTgl_pinjam());
                }if (mdl.getTgl_kembali()!=null) {
                    Dto.setTgl_kembali(mdl.getTgl_kembali());
                }                
                
            }
        }
        return Dto;
    }

    @Override
    public void getSimpanUpdate(PinjamanDto dto) {
        ClassPinjaman mdl=new ClassPinjaman();
        mdl.setId_pinjaman(dto.getId_pinjaman());
        mdl.setTgl_pinjam(dto.getTgl_pinjam());
        mdl.setTgl_kembali(dto.getTgl_kembali());
        daoPinjaman.UpdateData(mdl);
    }
}
