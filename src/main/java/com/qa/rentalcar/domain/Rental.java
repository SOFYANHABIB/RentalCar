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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
