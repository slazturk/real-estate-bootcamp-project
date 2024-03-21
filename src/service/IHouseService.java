package service;

import java.math.BigDecimal;

public interface IHouseService {
	BigDecimal calculateTotalPriceofTypedHouses(String className);
	BigDecimal calculateTotalPriceofHouses();
	double calculateAvgSquaremeterofTypedHouses(String className);
	double calculateAvgSquaremeterofAllHouses();
	String filterAccordingToNumberOfRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms);
}
