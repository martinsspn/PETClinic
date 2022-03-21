package petcc.ufrn.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.ufrn.petclinic.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
