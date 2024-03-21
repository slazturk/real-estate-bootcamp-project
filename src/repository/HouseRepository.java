package repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.House;
import model.RegularHouse;
import model.SummerHouse;
import model.Villa;

public class HouseRepository implements IHouseRepository{
	
	private List<House> allHouseTypesList=new ArrayList<>();

	public HouseRepository() {
		House regularHouse1=new RegularHouse(3,1,2,new BigDecimal(1000000),100);
		House regularHouse2=new RegularHouse(4,1,2,new BigDecimal(2000000),150);
		House regularHouse3=new RegularHouse(4,1,3,new BigDecimal(2500000),165);
		
		House villa1=new Villa(3,1,2,new BigDecimal(1500000),150,2);
		House villa2=new Villa(4,1,2,new BigDecimal(2500000),170,2);
		House villa3=new Villa(4,1,3,new BigDecimal(3000000),190,3);	
		
		House summerHouse1=new SummerHouse(3,1,2,new BigDecimal(1500000),150,500);
		House summerHouse2=new SummerHouse(4,1,2,new BigDecimal(2500000),170,200);
		House summerHouse3=new SummerHouse(4,1,3,new BigDecimal(3000000),190,1000);
		
		allHouseTypesList.add(regularHouse1);
		allHouseTypesList.add(regularHouse2);
		allHouseTypesList.add(regularHouse3);
		
		allHouseTypesList.add(villa1);
		allHouseTypesList.add(villa2);
		allHouseTypesList.add(villa3);
		
		allHouseTypesList.add(summerHouse1);
		allHouseTypesList.add(summerHouse2);
		allHouseTypesList.add(summerHouse3);
	}

	@Override
	public List<House> getAllHouseTypesList() {
		return allHouseTypesList;
	}

		
}
