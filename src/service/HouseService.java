package service;

import java.math.BigDecimal;
import java.util.List;

import model.House;

import repository.IHouseRepository;

public class HouseService implements IHouseService{

	private IHouseRepository houseRepository;
	
	public HouseService(IHouseRepository houseRepository) {
		super();
		this.houseRepository = houseRepository;
	}

	@Override
	public BigDecimal calculateTotalPriceofTypedHouses(String className) {
		List<House> housesList=this.houseRepository.getAllHouseTypesList();
		BigDecimal totalPrice=BigDecimal.ZERO;
		for(House house:housesList) {
			if(className.equals(house.getClass().getSimpleName())){
				totalPrice=totalPrice.add(house.getPrice());
			}
		}
		return totalPrice;
	}

	@Override
	public BigDecimal calculateTotalPriceofHouses() {
		List<House> housesList=this.houseRepository.getAllHouseTypesList();
		BigDecimal totalPrice=BigDecimal.ZERO;
		for(House house:housesList) {
			totalPrice=totalPrice.add(house.getPrice());
		}
		return totalPrice;
	}

	@Override
	public double calculateAvgSquaremeterofTypedHouses(String className) {
		List<House> housesList=this.houseRepository.getAllHouseTypesList();
		int counter=0;
		double totalSqrmtr=0.0, avg;
		for(House house:housesList) {
			if(className.equals(house.getClass().getSimpleName())){
				totalSqrmtr+=house.getSquaremeter();
				counter++;
			}
		}
		avg=totalSqrmtr/counter;
		return avg;
	}
	
	@Override
	public double calculateAvgSquaremeterofAllHouses() {
		List<House> housesList=this.houseRepository.getAllHouseTypesList();
		int counter=0;
		double totalSqrmtr=0.0, avg;
		for(House house:housesList) {
			totalSqrmtr+=house.getSquaremeter();
			counter++;
		}
		avg=totalSqrmtr/counter;
		return avg;
	}
	
	@Override
	public String filterAccordingToNumberOfRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms) {
		List<House> housesList=this.houseRepository.getAllHouseTypesList();
		for(House house:housesList) {
			if(house.getNumberOfRooms()==numberOfRooms && house.getNumberOfLivingRooms()==numberOfLivingRooms) {
				return house.toString();
			}
		}
		return "No match found";
	}
}
