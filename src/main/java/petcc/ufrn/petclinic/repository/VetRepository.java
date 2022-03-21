package petcc.ufrn.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.ufrn.petclinic.model.Vet;

public interface VetRepository extends JpaRepository<Vet, Long> {
}
