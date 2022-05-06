package br.com.mauraumdev.bolaoCopa.model;

import java.util.Objects;

public class Adress {
    public String cep;
    public String logradouro;
    public String bairro;
    public String localidade;
    public String uf;
    public String ibge;
    public String gia;
    public int ddd;
    public int siafi;

    public Adress(String cep, String logradouro, String bairro, String localidade, String uf, String ibge, String gia, int ddd, int siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
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

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getSiafi() {
        return siafi;
    }

    public void setSiafi(int siafi) {
        this.siafi = siafi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return ddd == adress.ddd && siafi == adress.siafi && Objects.equals(cep, adress.cep) && Objects.equals(logradouro, adress.logradouro) && Objects.equals(bairro, adress.bairro) && Objects.equals(localidade, adress.localidade) && Objects.equals(uf, adress.uf) && Objects.equals(ibge, adress.ibge) && Objects.equals(gia, adress.gia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep, logradouro, bairro, localidade, uf, ibge, gia, ddd, siafi);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd=" + ddd +
                ", siafi=" + siafi +
                '}';
    }
}
