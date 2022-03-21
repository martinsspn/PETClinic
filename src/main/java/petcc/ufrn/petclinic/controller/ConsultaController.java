package petcc.ufrn.petclinic.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import petcc.ufrn.petclinic.model.Consulta;
import petcc.ufrn.petclinic.service.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaService service;

    @GetMapping(value = "/buscar")
    @ApiOperation(value = "busca de todas as consultas cadastradas ou solicitadas.",
                  notes = "Função que retorna todas as consultas aceitas pelo veterinário ou solicitadas por um dono de pet",
                  response = Consulta.class,
                  httpMethod = "GET")
    public ResponseEntity<?> buscar_consultas(){
        return ResponseEntity.ok(service.buscar_consultas());
    }

    @ApiOperation(value = "busca consulta cadastradas ou solicitadas por id.",
            notes = "Função que busca pelo id de uma consulta e a retorna caso tenha sido aceita pelo veterinário ou solicitada por um dono de pet",
            response = Consulta.class,
            httpMethod = "GET")
    @GetMapping(value = "/buscar/{id}")
    public ResponseEntity<?> buscar_consulta_por_id(@PathVariable @ApiParam(value = "id da consulta a ser pesquisada") Long id){
        return ResponseEntity.ok(service.buscar_consulta_por_id(id));
    }
}
