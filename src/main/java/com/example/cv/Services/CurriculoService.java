package com.example.cv.Services;

import com.example.cv.models.Curriculo;
import com.example.cv.Repositories.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;


    public List<Curriculo> getAllCurriculos() {
        return curriculoRepository.findAll();
    }

    public Curriculo saveCurriculo(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }


    public Curriculo putCurriculo(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public void delCurriculo(Long id) {
        curriculoRepository.deleteById(id);
    }
}
