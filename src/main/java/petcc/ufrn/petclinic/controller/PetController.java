package petcc.ufrn.petclinic.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.ufrn.petclinic.model.Pet;
import petcc.ufrn.petclinic.service.PetService;

import javax.validation.Valid;

@RestController
@RequestMapping("/Pet")
public class PetController {
    @Autowired
    private PetService service;

    @GetMapping(value = "/buscar")
    @ApiOperation(value = "busca de todos pets cadastrados.",
            notes = "Função que retorna todas as consultas aceitas pelo veterinário ou solicitadas por um dono de pet",
            response = Pet.class,
            httpMethod = "GET")
    public ResponseEntity<?> buscar_pets(){
        return ResponseEntity.ok(service.buscar_pets());
    }

    @GetMapping(value = "/buscar/{id}")
    @ApiOperation(value = "busca um pet através do seu id",
            notes = "Função que busca um pet identificado por um id e o retorna caso seja encontrado!",
            response = Pet.class,
            httpMethod = "GET")
    public ResponseEntity<?> buscar_pet_por_id(@PathVariable @ApiParam(value = "id do pet.") Long id){
        return ResponseEntity.ok(service.buscar_pet_por_id(id));
    }

    @PostMapping(value = "/cadastrar_pet")
    @ApiOperation(value = "Cadastrar um novo Pet",
            notes = "Função que faz o cadastro de um novo Pet no sistema.",
            response = Pet.class,
            httpMethod = "POST")
    public ResponseEntity<?> cadastrar_pet(@RequestBody @Valid @ApiParam(value = "Informações do novo pet.") Pet pet){
        return ResponseEntity.ok(service.cadastrar_alterar(pet));
    }
}
