package model;

import java.math.BigDecimal;


public class House{

	private int numberOfRooms;
	private int numberOfLivingRooms;
	private int numberOfBathrooms;
	private BigDecimal price;
	private double squaremeter;

	public House(int numberOfRooms, int numberOfLivingRooms, int numberOfBathrooms, BigDecimal price, double squaremeter) {
		this.numberOfRooms = numberOfRooms;
		this.numberOfLivingRooms = numberOfLivingRooms;
		this.numberOfBathrooms = numberOfBathrooms;
		this.price = price;
		this.squaremeter = squaremeter;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	 
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	public int getNumberOfLivingRooms() {
		return numberOfLivingRooms;
	}
	
	public void setNumberOfLivingRooms(int numberOfLivingRooms) {
		this.numberOfLivingRooms = numberOfLivingRooms;
	}
	 
	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}
	
	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public double getSquaremeter() {
		return squaremeter;
	}
	
	public void setSquaremeter(double squaremeter) {
		this.squaremeter = squaremeter;
	}

	@Override
	public String toString() {
		return "House [numberOfRooms=" + numberOfRooms + ", numberOfLivingRooms=" + numberOfLivingRooms
				+ ", numberOfBathrooms=" + numberOfBathrooms + ", price=" + price + ", squaremeter=" + squaremeter
				+ "]";
	}
	
	
}
