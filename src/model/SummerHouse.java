package model;

import java.math.BigDecimal;

public class SummerHouse extends House{
	
	private int distanceFromTheSeasideinMeters;
	
	public SummerHouse(int numberOfRooms, int numberOfLivingRooms, int numberOfBathrooms, BigDecimal price,
			double squaremeter, int distanceFromTheSeasideinMeters) {
		super(numberOfRooms, numberOfLivingRooms, numberOfBathrooms, price, squaremeter);
		this.setDistanceFromTheSeaside(distanceFromTheSeasideinMeters);
	}
	
	public int getDistanceFromTheSeasideinMeters() {
		return distanceFromTheSeasideinMeters;
	}

	public void setDistanceFromTheSeaside(int distanceFromTheSeasideinMeters) {
		this.distanceFromTheSeasideinMeters = distanceFromTheSeasideinMeters;
	}

	@Override
	public String toString() {
		return "SummerHouse [distanceFromTheSeasideinMeters=" + distanceFromTheSeasideinMeters
				+ ", getDistanceFromTheSeasideinMeters()=" + getDistanceFromTheSeasideinMeters()
				+ ", getNumberOfRooms()=" + getNumberOfRooms() + ", getNumberOfLivingRooms()="
				+ getNumberOfLivingRooms() + ", getNumberOfBathrooms()=" + getNumberOfBathrooms() + ", getPrice()="
				+ getPrice() + ", getSquaremeter()=" + getSquaremeter() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
