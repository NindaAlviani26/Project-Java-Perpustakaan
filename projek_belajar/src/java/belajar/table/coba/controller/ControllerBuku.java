/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.table.coba.controller;

import belajar.table.coba.dto.AnggotaDto;
import belajar.table.coba.dto.BukuDto;
import belajar.table.coba.dto.LogInDto;
import belajar.table.coba.dto.PinjamanDto;
import belajar.table.coba.servis.AnggotaInterface;
import belajar.table.coba.servis.BukuInterface;
import belajar.table.coba.servis.LogInInterface;
import belajar.table.coba.servis.PinjamanInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author user
 */
@Controller
@RequestMapping
public class ControllerBuku {
    @Autowired
    BukuInterface bukuServis;
  
    @Autowired
    AnggotaInterface agtInter;
    
    @Autowired
    PinjamanInterface pinjamanServis;
    
    @Autowired
    LogInInterface logInServis;
    
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String lihatIndex(ModelMap model){
        LogInDto dto = new LogInDto();
        model.addAttribute("log",dto);
        return "logIn";
    }
    @RequestMapping(value = "/menuUtama", method = RequestMethod.GET)
    public String lihat(){
        return "index";
    } 
    @RequestMapping(value = "/masuk", method = RequestMethod.POST)
    public String logData(LogInDto dto) throws Exception{
        LogInDto dtoData = logInServis.getUsername(dto.getUsername(), dto.getPassword());
        if (dtoData.getPassword()!=null && dtoData.getUsername()!=null) {
            return "redirect:menuUtama.htm";
        }
        else{
            return "redirect:index.htm";
        }
    }
   
     @RequestMapping(value = "/frame", method = RequestMethod.GET)
    public String menu(){
        return "frame";
    }
    @RequestMapping(value = "/galeryBuku", method = RequestMethod.GET)
    public String file(){
        return "galery";
    }
    @RequestMapping(value = "/buku", method = RequestMethod.GET)
    public String bukuData(ModelMap model)throws Exception{
        List<BukuDto> dataDto = bukuServis.get();
        model.addAttribute("dto", dataDto);
        return "dataBuku";     
    }
    
    @RequestMapping(value = "/tambahData", method = RequestMethod.GET)
    public String tambahData(ModelMap model){
        BukuDto dtoBuku = new BukuDto();
        model.addAttribute("dto", dtoBuku);
        return "inputDataBuku";
    }
    @RequestMapping(value = "/simpanData", method = RequestMethod.POST)
    public String simpanData(ModelMap model, BukuDto dto){
        ModelAndView mdl= new ModelAndView();
        bukuServis.simpanDataBuku(dto);
        return "redirect:buku.htm";
    }
    @RequestMapping(value = "/updateBuku",method = RequestMethod.GET)
    public String ambilData(String id, ModelMap model){
        BukuDto dto = bukuServis.getUpdate(id);
        model.addAttribute("dto", dto);
        return "updateBuku";
    }
    @RequestMapping(value = "/updateData", method = RequestMethod.POST)
    public String updateData(BukuDto dto){
        bukuServis.getUpdateData(dto);
        return "redirect:buku.htm";
    }
    @RequestMapping(value = "/deletData",method = RequestMethod.GET)
    public String deleteData(String id)throws Exception{
       bukuServis.getDelete(id);
        return "redirect:buku.htm";
    }

///////////////////////////////////////////////////////////////////////////////////////////    
    
    @RequestMapping(value = "/anggota", method = RequestMethod.GET)
    public String anggotaData(ModelMap model)throws Exception{
        List<AnggotaDto> dataDto = agtInter.getDataAnggota();
        model.addAttribute("dto", dataDto);
        return "anggota";     
    }
    
    @RequestMapping(value = "/tambahAnggota", method = RequestMethod.GET)
    public String tambahAnggota(ModelMap model){
        AnggotaDto dtoAnggota = new AnggotaDto();
        model.addAttribute("dto", dtoAnggota);
        return "inputDataAnnggota";
    }
    
    @RequestMapping(value = "/simpanDataAnggota", method = RequestMethod.POST)
    public String simpanDataAnggota(ModelMap model, AnggotaDto dto){
        ModelAndView mdl= new ModelAndView();
        agtInter.DataAnggota(dto);
        return "redirect:anggota.htm";
    }
    
    @RequestMapping(value = "/updateAnggota",method = RequestMethod.GET)
    public String ambilDataAnggota(AnggotaDto dt, ModelMap model){
        AnggotaDto dto = agtInter.getUpdateData(dt.getNo());
        model.addAttribute("dto", dto);
        return "updateAnggota";
    }
    
    @RequestMapping(value = "/SimpanUpdate", method = RequestMethod.POST)
    public String SimpanUpdateAnggota(AnggotaDto dto){
        agtInter.getSimpanUpdate(dto);
        return "redirect:anggota.htm";
    }
    @RequestMapping(value = "/deletAnggota",method = RequestMethod.GET)
    public String deleteAnggota(AnggotaDto dto)throws Exception{
       agtInter.getDelete(dto.getNo());
        return "redirect:anggota.htm";
    }


//////////////////////////////////////////////////////////////////////////////////////////////

    
    @RequestMapping(value = "/pinjaman", method = RequestMethod.GET)
    public String PinjamanData(ModelMap model)throws Exception{
        List<PinjamanDto> dataDto = pinjamanServis.getDataPinjaman();
        model.addAttribute("dto", dataDto);
        
        return "dataPinjaman";     
    }
    
    @RequestMapping(value = "/tambahDataPinjaman", method = RequestMethod.GET)
    public String tambahPinjaman(ModelMap model) throws Exception{
        PinjamanDto dtoPinjaman = new PinjamanDto();
        model.addAttribute("dto", dtoPinjaman);
        List<AnggotaDto> dataDto = agtInter.getDataAnggota();
        model.addAttribute("pinjaman", dataDto);
        List<BukuDto> data = bukuServis.get();
        model.addAttribute("buku", data);
        return "inputPinjaman";
    }
    
    @RequestMapping(value = "/simpanInputData", method = RequestMethod.POST)
    public String simpanDataPinjaman(ModelMap model, PinjamanDto dto){
        ModelAndView mdl= new ModelAndView();
        pinjamanServis.DataPinjaman(dto);
        return "redirect:pinjaman.htm";
    }
    
    @RequestMapping(value = "/updatePinjaman",method = RequestMethod.GET)
    public String ambilDataPinjaman(PinjamanDto dt, ModelMap model) throws Exception{
        PinjamanDto dto = pinjamanServis.getUpdateData(dt.getId_pinjaman());
        model.addAttribute("dto", dto);
        BukuDto dtO = bukuServis.getUpdate(dt.getId_buku());
        model.addAttribute("dtO", dtO);
        return "updatePinjaman";
    }
    
    @RequestMapping(value = "/simpanPinjaman", method = RequestMethod.POST)
    public String SimpanUpdate(PinjamanDto dto){
        pinjamanServis.getSimpanUpdate(dto);
        return "redirect:pinjaman.htm";
    }
}