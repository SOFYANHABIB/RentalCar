package com.qa.rentalcar.domain;

public class Rental {
	
	private int id;
	
	private int clienId;
	
	private int carId;
	
	private String clientName;
	
	private String carType;
	
	private String carBrand;
	
	private int rentalPeriod;
	
	private  boolean carBack;
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
