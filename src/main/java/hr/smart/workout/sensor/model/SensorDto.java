package hr.smart.workout.sensor.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SensorDto {

    private String value;
    private String type;
    private String machineId;
}

