package com.codeWithProjects.Ecomm.services.jwt.auth;

import com.codeWithProjects.Ecomm.dto.SignupRequest;
import com.codeWithProjects.Ecomm.dto.UserDto;
import com.codeWithProjects.Ecomm.entity.User;
import com.codeWithProjects.Ecomm.enums.UserRole;
import com.codeWithProjects.Ecomm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AuthServiceImpl implements AuthService {
     @Autowired
     private UserRepository userRepository;

     @Autowired
     private BCryptPasswordEncoder bCryptPasswordEncoder;

     public UserDto createUser(SignupRequest signupRequest)
     {
          User user=new User();
          user.setEmail(signupRequest.getEmail());
          user.setName(signupRequest.getName());
          user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
          user.setRole(UserRole.CUSTOMER);
          User createdUser=userRepository.save(user);

          UserDto userDto=new UserDto();
          userDto.setId(createdUser.getId());
          return userDto;
     }
     public Boolean hasUserWithEmail(String email){
          return userRepository.findFirstByEmail(email).isPresent();

     }

}
