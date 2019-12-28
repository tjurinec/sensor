package hr.smart.workout.sensor.controller;

import hr.smart.workout.sensor.model.SensorInput;
import hr.smart.workout.sensor.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SensorController {

    @Autowired
    SensorService sensorService;

    @PostMapping(path = "/sensor")
    public ResponseEntity saveSensorValue(@RequestBody SensorInput sensor) {
        sensorService.saveSensorInput(sensor);
        return ResponseEntity.accepted().build();
    }

    @GetMapping(path = "/sensor/{machineId}")
    public ResponseEntity getSensor(@PathVariable String machineId) {
        return ResponseEntity.ok(sensorService.getSensorData(machineId));
    }

    @PostMapping(path = "/sensors")
    public ResponseEntity saveSensorList(@RequestBody List<SensorInput> sensorInputList) {
        sensorService.saveAllSensorInputs(sensorInputList);
        return ResponseEntity.accepted().build();
    }
}
