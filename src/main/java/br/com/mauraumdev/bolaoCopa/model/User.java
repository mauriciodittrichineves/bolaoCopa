package br.com.mauraumdev.bolaoCopa.model;

import br.com.mauraumdev.bolaoCopa.validation.Validation;
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
