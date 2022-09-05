package br.com.mauraumdev.bolaoCopa.dto;


import br.com.mauraumdev.bolaoCopa.model.Adress;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.mapstruct.Mapper;

@Mapper
public class AddressDto {
    @JsonProperty("logradouro")
    private String logradouro;
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("bairro")
    private String bairro;
    @JsonProperty("localidade")
    private String localidade;
    @JsonProperty("uf")
    private String uf;

    public AddressDto() {
    }

    public AddressDto(Adress adress){

    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
}
