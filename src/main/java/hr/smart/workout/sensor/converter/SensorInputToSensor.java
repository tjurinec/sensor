package hr.smart.workout.sensor.converter;

import hr.smart.workout.sensor.dao.entity.Sensor;
import hr.smart.workout.sensor.model.SensorInput;
import org.modelmapper.AbstractConverter;

public class SensorInputToSensor extends AbstractConverter<SensorInput, Sensor> {
    @Override
    protected Sensor convert(SensorInput sensorInput) {
        Sensor sensor = new Sensor();
        sensor.setValue(sensorInput.getValue());
        sensor.setType(sensorInput.getType());
        sensor.setMachineId(sensorInput.getMachineId());
        return sensor;
    }
}
