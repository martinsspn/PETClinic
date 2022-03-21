package petcc.ufrn.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.ufrn.petclinic.model.Consulta;
import petcc.ufrn.petclinic.model.Pet;
import petcc.ufrn.petclinic.model.Vet;
import petcc.ufrn.petclinic.repository.ConsultaRepository;

import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository repository;

    public Consulta cadastrar_consulta(Consulta consulta, Pet pet, Vet vet) {
        consulta.setPet(pet);
        consulta.setVet(vet);
        return repository.save(consulta);
    }

    public Consulta buscar_consulta(Long id){
        return repository.findById(id).isPresent() ? repository.findById(id).get() : null;
    }

    public void deletar_consulta(Consulta consulta){
        repository.delete(consulta);
    }

    public List<Consulta> buscar_consultas(){
        return repository.findAll();
    }

    public Consulta buscar_consulta_por_id(Long id){
        return repository.findById(id).isPresent() ? repository.findById(id).get() : null;
    }
}
