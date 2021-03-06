package com.qa.rentalcar.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "rental")
public class Rental {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	
	@Column
	private int clienId;
	
	@Column
	private int carId;
	

	@Column
	private String clientName;
	
	@Column
	private String carType;
	
	@Column
	private String carBrand;
	
	@Column
	private int rentalPeriod;
	
	@Column
	private  boolean carBack;
	
	@Column
	private float rentalCost;

	
	// Default constructor
	public Rental() {
		super();
	}


	
	//Constructor without id for customer view
	public Rental(int clienId, int carId, String clientName, String carType, String carBrand, int rentalPeriod,
			boolean carBack, float rentalCost) {
		super();
		this.clienId = clienId;
		this.carId = carId;
		this.clientName = clientName;
		this.carType = carType;
		this.carBrand = carBrand;
		this.rentalPeriod = rentalPeriod;
		this.carBack = carBack;
		this.rentalCost = rentalCost;
	}


    //Constructor with id for admin view
	public Rental(int id, int clienId, int carId, String clientName, String carType, String carBrand, int rentalPeriod,
			boolean carBack, float rentalCost) {
		super();
		this.id = id;
		this.clienId = clienId;
		this.carId = carId;
		this.clientName = clientName;
		this.carType = carType;
		this.carBrand = carBrand;
		this.rentalPeriod = rentalPeriod;
		this.carBack = carBack;
		this.rentalCost = rentalCost;
	}


    
	
	
	//Getters & Setters
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getClienId() {
		return clienId;
	}



	public void setClienId(int clienId) {
		this.clienId = clienId;
	}



	public int getCarId() {
		return carId;
	}



	public void setCarId(int carId) {
		this.carId = carId;
	}



	public String getClientName() {
		return clientName;
	}



	public void setClientName(String clientName) {
		this.clientName = clientName;
	}



	public String getCarType() {
		return carType;
	}



	public void setCarType(String carType) {
		this.carType = carType;
	}



	public String getCarBrand() {
		return carBrand;
	}



	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}



	public int getRentalPeriod() {
		return rentalPeriod;
	}



	public void setRentalPeriod(int rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}



	public boolean isCarBack() {
		return carBack;
	}



	public void setCarBack(boolean carBack) {
		this.carBack = carBack;
	}



	public float getRentalCost() {
		return rentalCost;
	}



	public void setRentalCost(float rentalCost) {
		this.rentalCost = rentalCost;
	}


    
	//Hash code and equals
	@Override
	public int hashCode() {
		return Objects.hash(carBack, carBrand, carId, carType, clienId, clientName, rentalCost, rentalPeriod);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rental other = (Rental) obj;
		return carBack == other.carBack && Objects.equals(carBrand, other.carBrand) && carId == other.carId
				&& Objects.equals(carType, other.carType) && clienId == other.clienId
				&& Objects.equals(clientName, other.clientName)
				&& Float.floatToIntBits(rentalCost) == Float.floatToIntBits(other.rentalCost)
				&& rentalPeriod == other.rentalPeriod;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
