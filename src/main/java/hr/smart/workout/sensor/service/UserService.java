package hr.smart.workout.sensor.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.smart.workout.sensor.dao.entity.User;
import hr.smart.workout.sensor.dao.repository.UserRepository;
import hr.smart.workout.sensor.model.UserDto;
import lombok.extern.java.Log;

@Log
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

	public UserDto createNewUser(UserDto user) {        
        log.info("START createNewUser");

        User userDao = modelMapper.map(user, User.class);
        user.setId(userRepository.save(userDao).getId());

        log.info("END createNewUser");
        return user;
	}


    
}
