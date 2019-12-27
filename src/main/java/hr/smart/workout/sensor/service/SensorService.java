package hr.smart.workout.sensor.service;

import hr.smart.workout.sensor.dao.SensorRepository;
import hr.smart.workout.sensor.dao.entity.Sensor;
import hr.smart.workout.sensor.model.SensorInput;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
public class SensorService {

    @Autowired
    SensorRepository sensorRepository;

    @Autowired
    ModelMapper modelMapper;

    public void saveSensorInput(SensorInput sensor) {
        Sensor sensorIn = modelMapper.map(sensor, Sensor.class);
        sensorRepository.save(sensorIn);
        log.info("------------------->" + sensorIn.toString());
    }

    public List<Sensor> getSensorData(String machineId) {
        List<Sensor> sensors = sensorRepository.findAllByMachineId(machineId);
        return sensors;
    }
}
