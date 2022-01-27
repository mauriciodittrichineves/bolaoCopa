package br.com.mauraumdev.bolaoCopa.model;

import br.com.mauraumdev.bolaoCopa.validation.Validation;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

 // Acredito que seguindo o SOLID, validacoes deveriam
//estar fora dessa classe, pois essas regras podem ser encaradas
//como algo que pode vir a ter mais regras e tornar esse codigo
//não coeso e extremamente grande
@Entity
@Table(name ="TB_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String name;
    //@Column(unique = true)
    private String email;
    private String password;

    //Para utilizar o SPRING, preciso do construtor em branco, porém para validar, se tiver o construtor em branco ele deixa passar

    public User(Long idUser, String name, String email, String password) {
        this.idUser = idUser;
        Validation.validateNonNullOrNoBlank(name);
        this.name = name;
        Validation.validateEmail(email);
        this.email = email;
        Validation.validateNonNullOrNoBlank(password);
        this.password = password;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

}
