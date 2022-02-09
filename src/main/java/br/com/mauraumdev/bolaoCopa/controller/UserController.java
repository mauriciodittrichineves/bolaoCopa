package br.com.mauraumdev.bolaoCopa.controller;

import br.com.mauraumdev.bolaoCopa.dto.UserDto;
import br.com.mauraumdev.bolaoCopa.model.User;
import br.com.mauraumdev.bolaoCopa.services.UserService;
import br.com.mauraumdev.bolaoCopa.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/betapi")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public User newUser(@RequestBody @Valid User user){
        Validation.validateEmail(user.getEmail());
        Validation.validateNonNullOrNoBlank(user.getName());
        return userService.saveUser(user);
    }

    @GetMapping("/user")
    public List<UserDto> allUsers(){return userService.loadAllUsers();}

    @GetMapping("/user/{id}")
    public User selectById(@PathVariable(value = "id" ) long idUser){return userService.selectUserById(idUser);}

    @GetMapping("/user/email/{email}")
    public User selectUserByEmail(@PathVariable(value = "email") String email){return userService.selectUserByEmail(email);}

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable(value = "id")long idUser){return userService.deleteUserById(idUser);}





}