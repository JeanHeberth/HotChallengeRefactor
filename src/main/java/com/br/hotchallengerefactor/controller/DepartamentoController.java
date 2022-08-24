package com.br.hotchallengerefactor.controller;

import com.br.hotchallengerefactor.service.DepartamentoService;
import com.br.hotchallengerefactor.vo.DepartamentoResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@Controller
@RequestMapping("departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;


    @GetMapping
    public ResponseEntity<List<DepartamentoResponseVo>> findAllDepartamentos() {
        return ResponseEntity.ok(departamentoService.findAllDepartamentos());

    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseEntity<DepartamentoResponseVo>> findByIdDepartaments(@PathVariable Long id) {
        return ResponseEntity.ok(departamentoService.findByIdDepartamentos(id));
    }
}
