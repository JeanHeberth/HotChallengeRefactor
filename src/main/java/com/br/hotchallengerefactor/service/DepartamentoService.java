package com.br.hotchallengerefactor.service;

import com.br.hotchallengerefactor.entities.Departamento;
import com.br.hotchallengerefactor.repository.DepartamentoRepository;
import com.br.hotchallengerefactor.vo.DepartamentoResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;


    public List<DepartamentoResponseVo> findAllDepartamentos() {
        List<Departamento> departamentos = departamentoRepository.findAll();
        List<DepartamentoResponseVo> departamentoResponseVos = new ArrayList<>();
        for (Departamento departamento : departamentos) {
            DepartamentoResponseVo departamentoResponseVo = new DepartamentoResponseVo(departamento);
            departamentoResponseVos.add(departamentoResponseVo);

        }
        return departamentoResponseVos;
    }


    public ResponseEntity<DepartamentoResponseVo> findByIdDepartamentos(Long id) {
        Optional<Departamento> departamento = departamentoRepository.findById(id);
        DepartamentoResponseVo departamentoResponseVo = new DepartamentoResponseVo(departamento.get());
        if (departamento.isPresent()) {
            return ResponseEntity.ok().body(departamentoResponseVo);
        }
        return ResponseEntity.notFound().build();
    }

}
