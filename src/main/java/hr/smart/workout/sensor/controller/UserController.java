package hr.smart.workout.sensor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hr.smart.workout.sensor.model.UserDto;
import hr.smart.workout.sensor.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    UserService userService;

    @PostMapping(path = "/user")
    public ResponseEntity<UserDto> saveSensorValue(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.createNewUser(user));
    }
}
