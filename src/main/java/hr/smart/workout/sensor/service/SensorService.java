package hr.smart.workout.sensor.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.smart.workout.sensor.dao.entity.Sensor;
import hr.smart.workout.sensor.dao.repository.SensorRepository;
import hr.smart.workout.sensor.model.SensorDto;
import lombok.extern.java.Log;

@Log
@Service
public class SensorService {

    @Autowired
    SensorRepository sensorRepository;

    @Autowired
    ModelMapper modelMapper;

    public void saveSensorInput(SensorDto sensor) {
        Sensor sensorIn = modelMapper.map(sensor, Sensor.class);
        sensorRepository.save(sensorIn);
        log.info("------------------->" + sensorIn.toString());
    }

    public List<Sensor> getSensorData(String machineId) {
        List<Sensor> sensors = sensorRepository.findAllByMachineId(machineId);
        return sensors;
    }
}
