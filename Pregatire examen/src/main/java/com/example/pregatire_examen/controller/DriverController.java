package com.example.pregatire_examen.controller;

import com.example.pregatire_examen.dto.DriverDto;
import com.example.pregatire_examen.mapper.DriverMapper;
import com.example.pregatire_examen.model.Driver;
import com.example.pregatire_examen.service.DriverService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;


@RestController
@Validated
@RequestMapping("/drivers")
public class DriverController {

    private DriverService driverService;
    private DriverMapper driverMapper;

    public DriverController(DriverService driverService, DriverMapper driverMapper) {
        this.driverService = driverService;
        this.driverMapper = driverMapper;
    }

    @PostMapping
    public ResponseEntity<Driver> createDriver(@Valid @RequestBody DriverDto driverDto) {
        Driver driver = driverMapper.driverDtoToDriver(driverDto);
        Driver savedDriver = driverService.createDriver(driver);
        return ResponseEntity
                .created(URI.create("/driver/" + savedDriver.getId()))
                .body(savedDriver);


    }

}
