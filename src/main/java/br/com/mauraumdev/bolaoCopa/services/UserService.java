package br.com.mauraumdev.bolaoCopa.services;

import br.com.mauraumdev.bolaoCopa.dto.UserDto;
import br.com.mauraumdev.bolaoCopa.model.User;
import br.com.mauraumdev.bolaoCopa.repository.UserRepository;
import br.com.mauraumdev.bolaoCopa.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
        Validation.validateEmail(user.getEmail());
        Validation.validateNonNullOrNoBlank(user.getName());
        return userRepository.save(user);
    }

    public List<UserDto> loadAllUsers(){return UserDto.converter(userRepository.findAll());}
    public User selectUserById(long idUser){return userRepository.findById(idUser);}

    public User selectUserByEmail(String email){return userRepository.findByEmail(email);}


    public String deleteUserById(long idUser) {
        User usuarioDeletado = selectUserById(idUser);
        if(usuarioDeletado.getIdUser() != null || usuarioDeletado.getName().isEmpty()){
            userRepository.delete(usuarioDeletado);
            return "Usuário " + usuarioDeletado.getName() + " deletado com sucesso !";
        } else{
            return "Usuário não encontrado";
        }
    }
}
