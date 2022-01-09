package br.com.mauraumdev.bolaoCopa.resources;

import br.com.mauraumdev.bolaoCopa.dto.UserDto;
import br.com.mauraumdev.bolaoCopa.model.User;
import br.com.mauraumdev.bolaoCopa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/betapi")
public class UserResources {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public User newUser(@RequestBody @Valid User user){ return userRepository.save(user);}
    @GetMapping("/user")
    public List<UserDto> allUsers(){return UserDto.converter(userRepository.findAll());}
    @GetMapping("user/{id}")
    public User selectTeam(@PathVariable(value = "id" ) long idUser){return userRepository.findById(idUser);}
    @GetMapping("user/email={email}")
    public User selectUserByEmail(@PathVariable(value = "email") String email){return  userRepository.findByEmail(email);}

}