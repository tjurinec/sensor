package hr.smart.workout.sensor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hr.smart.workout.sensor.dao.entity.Sensor;
import hr.smart.workout.sensor.model.SensorDto;
import hr.smart.workout.sensor.service.SensorService;

import java.util.List;

@RestController
public class SensorController {

    @Autowired
    SensorService sensorService;

    @PostMapping(path = "/sensor")
    public ResponseEntity<Void> saveSensorValue(@RequestBody SensorDto sensor) {
        sensorService.saveSensorInput(sensor);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/sensor/{machineId}")
    public ResponseEntity<List<Sensor>> getSensor(@PathVariable String machineId) {
        return ResponseEntity.ok(sensorService.getSensorData(machineId));
    }

    @PostMapping(path = "/sensors")
    public ResponseEntity saveSensorList(@RequestBody List<SensorInput> sensorInputList) {
        sensorService.saveAllSensorInputs(sensorInputList);
        return ResponseEntity.accepted().build();
    }
}
