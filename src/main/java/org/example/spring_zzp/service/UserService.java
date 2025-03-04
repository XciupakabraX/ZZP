package org.example.spring_zzp.service;

import org.example.spring_zzp.model.UserDTO;
import org.example.spring_zzp.model.UserEntity;
import org.example.spring_zzp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserService {
    private final UserRepository userRepository;


    public List<UserEntity> getUsers (){
        return userRepository.findAll();
    }

    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public UserEntity getUserByName(String name) {
        return userRepository.findByUsername(name).orElseThrow();
    }

    public void addNewUser(UserDTO userDTO) {
        UserEntity newUser = new UserEntity();
        newUser.setUsername(userDTO.getUsername());
        newUser.setPassword(userDTO.getPassword());
        newUser.setRole("user");
        userRepository.save(newUser);
    }
}
