package petcc.ufrn.petclinic.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;

@Entity
@ApiModel(value = "Dono")
public class Dono extends Pessoa{
    @Column(columnDefinition = "TEXT")
    private String endereco;

    @Column(columnDefinition = "TEXT")
    private String telefone;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
