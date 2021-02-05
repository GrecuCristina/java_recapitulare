package com.example.pregatire_examen.mapper;

import com.example.pregatire_examen.dto.DriverDto;
import com.example.pregatire_examen.model.Driver;
import org.springframework.stereotype.Component;

@Component
public class DriverMapper {
    public Driver driverDtoToDriver(DriverDto driverDto) {
        return new Driver(driverDto.getName(), driverDto.getEmail(), driverDto.getCity());
    }
}
