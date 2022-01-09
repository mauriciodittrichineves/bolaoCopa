package br.com.mauraumdev.bolaoCopa.model;

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
    @NotBlank @Length(max = 55, min = 8)
    private String name;
    @Column(unique = true)
    @NotBlank @Length(max = 63, min = 14)
    private String email;
    @NotBlank
    private String password;

    public User(){};

    public User(Long idUser, String name, String email, String password) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = password;
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
