package ru.testrest.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.testrest.demo.dto.UserDTO;
import ru.testrest.demo.facade.UserFacade;

@RestController
@RequestMapping("api/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserFacade userFacade;

    @GetMapping("/")
    public ResponseEntity<UserDTO> getCurrentUser() {
        UserDTO userDTO = userFacade.userToUserDTO();
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @GetMapping("/{userid}")
    public ResponseEntity<UserDTO> getUserProfile(@PathVariable("userid") String userId) {
        UserDTO userDTO = userFacade.userToUserDTO();
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }
}
