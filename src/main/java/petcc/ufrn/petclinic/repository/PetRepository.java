package petcc.ufrn.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.ufrn.petclinic.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
