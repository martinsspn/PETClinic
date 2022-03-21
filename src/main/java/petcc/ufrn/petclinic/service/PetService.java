package petcc.ufrn.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.ufrn.petclinic.model.Consulta;
import petcc.ufrn.petclinic.model.Dono;
import petcc.ufrn.petclinic.model.Pet;
import petcc.ufrn.petclinic.model.Vet;
import petcc.ufrn.petclinic.repository.PetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {
    @Autowired
    private PetRepository repository;

    @Autowired
    private ConsultaService consultaService;

    @Autowired
    private VetService vetService;

    public Pet cadastrar_alterar(Pet pet){
        return repository.save(pet);
    }

    public Consulta associarConsulta(Consulta consulta, Long id_pet, Long id_vet){
        Optional<Vet> vet = vetService.findById(id_vet);
        if(vet.isEmpty()){
            return null;
        }
        Pet pet = repository.getById(id_pet);
        return consultaService.cadastrar_consulta(consulta, pet, vet.get());
    }

    public List<Pet> buscar_pets() {
        return repository.findAll();
    }

    public Pet buscar_pet_por_id(Long id){
        return repository.findById(id).isPresent() ? repository.findById(id).get() : null;
    }
}
