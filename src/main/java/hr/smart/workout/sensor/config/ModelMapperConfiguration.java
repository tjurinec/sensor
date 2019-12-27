package hr.smart.workout.sensor.config;

import hr.smart.workout.sensor.converter.SensorInputToSensor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addConverter(new SensorInputToSensor());
        return modelMapper;
    }
}

