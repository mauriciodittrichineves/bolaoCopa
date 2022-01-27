package br.com.mauraumdev.bolaoCopa.controller;

import br.com.mauraumdev.bolaoCopa.dto.UserDto;
import br.com.mauraumdev.bolaoCopa.model.User;
import br.com.mauraumdev.bolaoCopa.services.UserService;
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
    public User newUser(@RequestBody @Valid User user){ return userService.saveUser(user);}

    @GetMapping("/user")
    public List<UserDto> allUsers(){return userService.loadAllUsers();}

    @GetMapping("/user/{id}")
    public User selectTeam(@PathVariable(value = "id" ) long idUser){return userService.selectUserById(idUser);}

    @GetMapping("/user/email/{email}")
    public User selectUserByEmail(@PathVariable(value = "email") String email){return userService.selectUserByEmail(email);}



}