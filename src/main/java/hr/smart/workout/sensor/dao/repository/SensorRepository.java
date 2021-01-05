package hr.smart.workout.sensor.dao.repository;

import hr.smart.workout.sensor.dao.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
    List<Sensor> findAllByMachineId(String machineId);
}
