package petcc.ufrn.petclinic.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.ufrn.petclinic.model.Consulta;
import petcc.ufrn.petclinic.model.Dono;
import petcc.ufrn.petclinic.model.Pet;
import petcc.ufrn.petclinic.service.DonoService;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/dono")
public class DonoController {
    @Autowired
    private DonoService service;

    @GetMapping(value = "/buscar")
    @ApiOperation(value = "busca de todas os donos de pets cadastrados.",
            notes = "Função que retorna todos os donos de pets cadastrados no sistema.",
            response = Dono.class,
            httpMethod = "GET")
    public ResponseEntity<?> buscar_donos(){
        return ResponseEntity.ok(service.buscar_todos());
    }

    @GetMapping(value = "/buscar/{id}")
    @ApiOperation(value = "busca de um dono de pet cadastrado no sistema através do seu id.",
            notes = "Função que busca um dono de pet através do id do dono.",
            response = Dono.class,
            httpMethod = "GET")
    public ResponseEntity<?> buscar_dono_por_id(@PathVariable @ApiParam(value = "id do dono.") Long id){
        return ResponseEntity.ok(service.findById(id));
    }


    @PostMapping(value = "/cadastrar_dono")
    @ApiOperation(value = "Cadastrar novo dono de pet no sistema.",
            notes = "Função que realiza o cadastro de um novo dono de pet no sistema.",
            response = Dono.class,
            httpMethod = "POST")
    public ResponseEntity<?> cadastrar_dono(@RequestBody @Valid @ApiParam(value = "Informações do dono a ser cadastrado") Dono dono){
        return ResponseEntity.ok(service.cadastrar_dono(dono));
    }

    @PostMapping(value = "/cadastrar_pet/{id_dono}")
    @ApiOperation(value = "Cadastrar novo de pet no sistema dado um dono cadastrado no sistema.",
            notes = "Função que realiza o cadastro de um novo pet no sistema associando a ele um dono que está cadastrado no sistema.",
            response = Pet.class,
            httpMethod = "POST")
    public ResponseEntity<?> cadastrar_pet(@RequestBody @Valid @ApiParam(value = "Informações do novo pet") Pet pet, @PathVariable @ApiParam(value = "id do dono do pet") Long id_dono){
        return ResponseEntity.ok(service.cadastrar_alterar_Pet(pet, id_dono));
    }

    @PostMapping(value = "/cadastrar_consulta/{id_pet}/{id_vet}")
    @ApiOperation(value = "Solicitar consulta.",
            notes = "Função utilizada para solicitar a um veterinário uma consulta para algum de seus pets cadastrados.",
            response = Consulta.class,
            httpMethod = "POST")
    public ResponseEntity<?> cadastrar_consulta(@RequestBody @Valid @ApiParam(value = "Informações sobre a consulta") Consulta consulta, @PathVariable @ApiParam(value = "id do pet.") Long id_pet, @PathVariable @ApiParam(value = "id do veterinário.") Long id_vet){
        return ResponseEntity.ok(service.cadastrar_consulta(consulta, id_pet, id_vet));
    }
}
