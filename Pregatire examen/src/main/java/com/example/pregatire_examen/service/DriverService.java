package com.example.pregatire_examen.service;

import com.example.pregatire_examen.model.Driver;
import com.example.pregatire_examen.repository.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    private DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public Driver createDriver(Driver driver){
        return driverRepository.createDriver(driver);

    }
}
