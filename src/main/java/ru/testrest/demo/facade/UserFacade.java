package ru.testrest.demo.facade;

import org.springframework.stereotype.Component;
import ru.testrest.demo.dto.UserDTO;

@Component
public class UserFacade {
//    public UserDTO userToUserDTO(User user) {
      public UserDTO userToUserDTO() {
          UserDTO userDTO = new UserDTO();
          userDTO.setId(123L);
          userDTO.setFirstname("thisFirstName");
          userDTO.setLastname("thisLastName");
          userDTO.setUsername("thisUserName");
          userDTO.setBio("thisBio");
          return userDTO;

    }
}
