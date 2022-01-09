package br.com.mauraumdev.bolaoCopa.dto;

import br.com.mauraumdev.bolaoCopa.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDto {
    private String name;
    private String email;
    private String password;

    public UserDto(User user) {
        this.name = user.getName();
        this.email = user.getEmail();

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

    public static List<UserDto> converter(List<User> user){
        return user.stream().map(UserDto::new).collect(Collectors.toList());
    }
}
