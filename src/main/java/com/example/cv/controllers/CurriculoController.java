package com.example.cv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.cv.models.*;
import com.example.cv.Services.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cv")
public class CurriculoController {

    @Autowired
    private CurriculoService curriculoService;


    @GetMapping("/getallcv")
    public List<Curriculo> getAllCurriculos() {
        return curriculoService.getAllCurriculos();
    }


    @PostMapping("/postcv")
    public Curriculo saveCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoService.saveCurriculo(curriculo);
    }


    @PutMapping("/putcv/{id}")
    public Curriculo putCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculo) {
        curriculo.setId(id); 
        return curriculoService.putCurriculo(curriculo);
    }


    @DeleteMapping("/delcv/{id}")
    public void delCurriculo(@PathVariable Long id) {
        curriculoService.delCurriculo(id);
    }
}
