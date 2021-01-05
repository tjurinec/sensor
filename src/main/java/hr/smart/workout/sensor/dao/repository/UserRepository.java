package hr.smart.workout.sensor.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr.smart.workout.sensor.dao.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}