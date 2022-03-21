package petcc.ufrn.petclinic.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@ApiModel(value = "Pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPet;

    @ManyToOne
    private Dono dono;

    @Column(columnDefinition = "DATE")
    private LocalDate aniversário;


    @Column(columnDefinition = "TEXT")
    private String nome;

    public long getIdPet() {
        return idPet;
    }

    public void setIdPet(long idPet) {
        this.idPet = idPet;
    }

    public LocalDate getAniversário() {
        return aniversário;
    }

    public void setAniversário(LocalDate aniversário) {
        this.aniversário = aniversário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
}
