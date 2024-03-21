package model;

import java.math.BigDecimal;

public class RegularHouse extends House{

	public RegularHouse(int numberOfRooms, int numberOfLivingRooms, int numberOfBathrooms, BigDecimal price,
			double squaremeter) {
		super(numberOfRooms, numberOfLivingRooms, numberOfBathrooms, price, squaremeter);
	}

	@Override
	public String toString() {
		return "RegularHouse [getNumberOfRooms()=" + getNumberOfRooms() + ", getNumberOfLivingRooms()="
				+ getNumberOfLivingRooms() + ", getNumberOfBathrooms()=" + getNumberOfBathrooms() + ", getPrice()="
				+ getPrice() + ", getSquaremeter()=" + getSquaremeter() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
