package br.com.mauraumdev.bolaoCopa.model;

import br.com.mauraumdev.bolaoCopa.controller.AdressController;
import br.com.mauraumdev.bolaoCopa.services.AddressClient;
import br.com.mauraumdev.bolaoCopa.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name ="TB_USER", uniqueConstraints={@UniqueConstraint(columnNames = "email")})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String name;
    private String email;
    private String password;
    private String cep;
    //private Adress adress;





    public User(Long idUser, String name, String email, String password, String cep) {
        this.idUser = idUser;
        Validation.validateNonNullOrNoBlank(name);
        this.name = name;
        Validation.validateEmail(email);
        this.email = email;
        Validation.validateNonNullOrNoBlank(password);
        this.password = password;
        this.cep = cep;
        //this.adress = new Adress(cep);

    }

     public User() {

     }


     public Long getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

//    public Adress getAdress() {
//        return adress;
//    }
//
//    public void setAdress(Adress adress) {
//        this.adress = adress;
//    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

}
