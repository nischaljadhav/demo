package com.incture.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.demo.daos.CarDao;
import com.incture.demo.dtos.CarDto;
import com.incture.demo.servicesUtil.ResponseDto;

@Service
@Transactional
public class CarService {

	@Autowired
	private CarDao carDao;

	public ResponseDto addCar(CarDto carDto) {
		ResponseDto rDto = new ResponseDto();
		rDto.setStatus(true);
		rDto.setStatusCode(200);
		try {
			carDao.addCar(carDto);
			rDto.setMessage("car data succesfully saved");
		} catch (Exception e) {
			rDto.setStatus(false);
			rDto.setStatusCode(405);
			rDto.setMessage("something wrong");
		}
		return rDto;
	}

	public ResponseDto getAllCar() {
		ResponseDto rDto = new ResponseDto();
		rDto.setStatus(true);
		rDto.setStatusCode(200);
		try {
			rDto.setData(carDao.getAllCar());
			rDto.setMessage("car data displayed succesfully");
		} catch (Exception e) {
			rDto.setStatus(false);
			rDto.setStatusCode(405);
			e.printStackTrace();
			rDto.setMessage(e.getMessage());
		}
		return rDto;
	}

}
