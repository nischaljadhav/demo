package com.incture.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.demo.dtos.CarDto;
import com.incture.demo.services.CarService;
import com.incture.demo.servicesUtil.ResponseDto;

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	private CarService carService;

	@PostMapping("/add")
	public ResponseDto addCar(@RequestBody CarDto carDto) {
		return carService.addCar(carDto);
	}

	@GetMapping("/get")
	public ResponseDto getAllCar() {
		return carService.getAllCar();
	}
}
