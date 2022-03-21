package petcc.ufrn.petclinic.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@ApiModel(value = "Vet")
public class Vet extends Pessoa{
    @Column(columnDefinition = "TEXT")
    private String identificador;

    public String getIdentidicador() {
        return identificador;
    }

    public void setIdentidicador(String identificador) {
        this.identificador = identificador;
    }
}
