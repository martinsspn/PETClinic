package petcc.ufrn.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.ufrn.petclinic.model.Consulta;
import petcc.ufrn.petclinic.model.Vet;
import petcc.ufrn.petclinic.repository.VetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VetService {
    @Autowired
    private VetRepository repository;

    @Autowired
    private ConsultaService consultaService;

    public Optional<Vet> findById(Long id_vet) {
        return repository.findById(id_vet);
    }

    public Vet cadastrar_vet(Vet vet){
        return repository.save(vet);
    }

    public Consulta aceitar_consulta(Long id_consulta){
        Consulta consulta = consultaService.buscar_consulta(id_consulta);
        consulta.setValidade(true);
        return consulta;
    }

    public Consulta rejeitar_consulta(Long id_consulta){
        Consulta consulta = consultaService.buscar_consulta(id_consulta);
        consulta.setValidade(false);
        consultaService.deletar_consulta(consulta);
        return consulta;
    }

    public List<Vet> buscar_vets() {
        return repository.findAll();
    }

    public Vet buscar_vet_por_id(Long id) {
        return repository.findById(id).isPresent() ? repository.findById(id).get() : null;
    }
}
