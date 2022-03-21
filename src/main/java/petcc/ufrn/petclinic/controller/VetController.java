package petcc.ufrn.petclinic.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.ufrn.petclinic.model.Consulta;
import petcc.ufrn.petclinic.model.Vet;
import petcc.ufrn.petclinic.service.VetService;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/vet")
public class VetController {
    @Autowired
    private VetService service;

    @GetMapping(value = "/buscar")
    @ApiOperation(value = "busca de todas os veterinários cadastrados.",
            notes = "Função que retorna todos os veterinário cadastrados no sistema.",
            response = Vet.class,
            httpMethod = "GET")
    public ResponseEntity<?> buscar_vets(){
        return ResponseEntity.ok(service.buscar_vets());
    }

    @GetMapping(value = "/buscar/{id}")
    @ApiOperation(value = "busca de um veterinário cadastrado no sistema através do seu id.",
            notes = "Função que busca um veterinário através do seu id.",
            response = Vet.class,
            httpMethod = "GET")
    public ResponseEntity<?> buscar_vet_por_id(@PathVariable @ApiParam(value = "id do veterinário.") Long id){
        return ResponseEntity.ok(service.buscar_vet_por_id(id));
    }

    @PostMapping(value = "/cadastrar")
    @ApiOperation(value = "Cadastrar novo veterinário no sistema.",
            notes = "Função que realiza o cadastro de um novo veterinário no sistema.",
            response = Vet.class,
            httpMethod = "POST")
    public ResponseEntity<?> cadastrar_vet(@RequestBody @Valid @ApiParam(value = "Informações do novo veterinário.") Vet vet){
        return ResponseEntity.ok(service.cadastrar_vet(vet));
    }

    @PostMapping(value = "/aceitar_consulta/{id_consulta}")
    @ApiOperation(value = "Aceitar consulta solicitada.",
            notes = "Função utilizada pelo veterinário para aceitar a solicitação de uma nova consulta.",
            response = Consulta.class,
            httpMethod = "POST")
    public ResponseEntity<?> aceitar_consulta(@PathVariable @ApiParam(value = "id da consulta.") Long id_consulta){
        return ResponseEntity.ok(service.aceitar_consulta(id_consulta));
    }

    @PostMapping(value = "/rejeitar_consulta/{id_consulta}")
    @ApiOperation(value = "Rejeitar consulta solicitada.",
            notes = "Função utilizada pelo veterinário para rejeitar a solicitação de uma nova consulta.",
            response = Consulta.class,
            httpMethod = "POST")
    public ResponseEntity<?> rejeitar_consulta(@PathVariable @ApiParam(value = "id da consulta.") Long id_consulta){
        return ResponseEntity.ok(service.rejeitar_consulta(id_consulta));
    }
}
