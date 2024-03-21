package model;

import java.math.BigDecimal;


public class Villa extends House{
	
	private int numberOfFloors;

	public Villa(int numberOfRooms, int numberOfLivingRooms, int numberOfBathrooms, BigDecimal price, double squaremeter, int numberOfFloors) {
		super(numberOfRooms, numberOfLivingRooms, numberOfBathrooms, price, squaremeter);
		this.setNumberOfFloors(numberOfFloors);
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	@Override
	public String toString() {
		return "Villa [numberOfFloors=" + numberOfFloors + ", getNumberOfFloors()=" + getNumberOfFloors()
				+ ", getNumberOfRooms()=" + getNumberOfRooms() + ", getNumberOfLivingRooms()="
				+ getNumberOfLivingRooms() + ", getNumberOfBathrooms()=" + getNumberOfBathrooms() + ", getPrice()="
				+ getPrice() + ", getSquaremeter()=" + getSquaremeter() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	


}
