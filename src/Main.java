import java.util.Scanner;

import repository.HouseRepository;
import service.HouseService;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int room, livingRoom;
		
		HouseService houseService=new HouseService(new HouseRepository());
		System.out.println("Evlerin toplam fiyati:"+houseService.calculateTotalPriceofTypedHouses("RegularHouse"));
		System.out.println("Villalarin toplam fiyati:"+houseService.calculateTotalPriceofTypedHouses("Villa"));
		System.out.println("Yazliklarin toplam fiyati:"+houseService.calculateTotalPriceofTypedHouses("SummerHouse"));
		System.out.println("Tum tipteki evlerin toplam fiyati:"+houseService.calculateTotalPriceofHouses());
		System.out.println();
		
		System.out.println("Evlerin ortalama metrekaresi:"+houseService.calculateAvgSquaremeterofTypedHouses("RegularHouse"));
		System.out.println("Villalarin ortalama metrekaresi:"+houseService.calculateAvgSquaremeterofTypedHouses("Villa"));
		System.out.println("Yazliklarin ortalama metrekaresi:"+houseService.calculateAvgSquaremeterofTypedHouses("SummerHouse"));
		System.out.println("Tum tipteki evlerin ortalama metrekaresi:"+houseService.calculateAvgSquaremeterofAllHouses());
		System.out.println();
		
		System.out.println("Oda sayisi girin:");
		room=scanner.nextInt();
		System.out.println("Salon sayisi girin:");
		livingRoom=scanner.nextInt();
		System.out.println("Oda sayisi "+room+", salon sayisi "+livingRoom+" olan tum evleri listele:"
		+houseService.filterAccordingToNumberOfRoomsAndLivingRooms(room, livingRoom));
	}

}
