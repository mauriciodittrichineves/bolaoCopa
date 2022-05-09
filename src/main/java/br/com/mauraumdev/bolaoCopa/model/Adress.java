package br.com.mauraumdev.bolaoCopa.model;

import br.com.mauraumdev.bolaoCopa.services.AddressClient;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Table(name = "TB_ADDRESS")
public class Adress {
    @Id
    public String cep;
    public String logradouro;
    public String bairro;
    public String localidade;
    public String uf;

    @Autowired
    AddressClient addressClient;


    public Adress(String cep) {
        this.cep = cep;
        //var postAddress = addressClient.findByCep(cep);
        //this.localidade = postAddress.getBody().getLocalidade();
        //this.bairro = postAddress.getBody().getBairro();
        //this.logradouro = postAddress.getBody().getLogradouro();
       // this.uf = postAddress.getBody().getUf();

    }

    public Adress() {

    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(cep, adress.cep) && Objects.equals(logradouro, adress.logradouro) && Objects.equals(bairro, adress.bairro) && Objects.equals(localidade, adress.localidade) && Objects.equals(uf, adress.uf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep, logradouro, bairro, localidade, uf);
    }

    @Override
    public String toString() {

        return "Adress{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
