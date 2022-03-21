package petcc.ufrn.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.ufrn.petclinic.model.Dono;

public interface DonoRepository extends JpaRepository<Dono, Long> {
}
