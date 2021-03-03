package com.incture.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class CarDo extends BaseDo{
	@Id
	private int carNo;
	private String carName;
	private String carModel;
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	@Override
	public String toString() {
		return "CarDo [carNo=" + carNo + ", carName=" + carName + ", carModel=" + carModel + "]";
	}
	public CarDo() {
		super();
	}
	public CarDo(int carNo, String carName, String carModel) {
		super();
		this.carNo = carNo;
		this.carName = carName;
		this.carModel = carModel;
	}
	
}
