package petcc.ufrn.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.ufrn.petclinic.model.Consulta;
import petcc.ufrn.petclinic.model.Dono;
import petcc.ufrn.petclinic.model.Pet;
import petcc.ufrn.petclinic.repository.DonoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DonoService {
    @Autowired
    private DonoRepository repository;

    @Autowired
    private PetService petService;

    public Dono findById(Long id){
        return repository.findById(id).isPresent() ? repository.findById(id).get() : null;
    }

    public Pet cadastrar_alterar_Pet(Pet pet, Long id_dono){
        Optional<Dono> dono = repository.findById(id_dono);
        if(!dono.isPresent()){
            return null;
        }
        pet.setDono(dono.get());
        return petService.cadastrar_alterar(pet);
    }

    public Consulta cadastrar_consulta(Consulta consulta, Long id_pet, Long id_vet){
        return petService.associarConsulta(consulta, id_pet, id_vet);
    }

    public Dono cadastrar_dono(Dono dono){
        return repository.save(dono);
    }

    public List<Dono> buscar_todos(){
        return repository.findAll();
    }
}
