package com.incture.demo.daos;

import java.util.ArrayList;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.incture.demo.dtos.CarDto;
import com.incture.demo.entities.CarDo;

@Repository("CarDao")
public class CarDao extends BaseDao<CarDo, CarDto> {

	public void addCar(CarDto carDto) {
		getSession().save(importDto(carDto));
	}

	public ArrayList getAllCar() {
		Query q = getSession().createQuery("from CarDo");
		@SuppressWarnings("unchecked")
		ArrayList<CarDo> l = (ArrayList<CarDo>) q.getResultList();
		return l;
	}

	@Override
	protected CarDo importDto(CarDto fromDto) {
		if (fromDto == null)
			return null;
		CarDo entity = new CarDo();
		entity.setCarNo(fromDto.getCarNo());
		entity.setCarName(fromDto.getCarName());
		entity.setCarModel(fromDto.getCarModel());
		return entity;
	}

	@Override
	protected CarDto exportDto(CarDo entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
