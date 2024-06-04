package miu.edu.HouseManagement;

import lombok.RequiredArgsConstructor;
import miu.edu.HouseManagement.model.House;
import miu.edu.HouseManagement.model.HouseOwner;
import miu.edu.HouseManagement.service.HouseOwnerService;
import miu.edu.HouseManagement.service.HouseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class HouseManagementApplication implements CommandLineRunner {

	private final HouseOwnerService houseOwnerService;
	private final HouseService houseService;

	public static void main(String[] args) {
		SpringApplication.run(HouseManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HouseOwner houseOwner1 = new HouseOwner("John", "Haiti", "6412228839");
		HouseOwner houseOwner2 = new HouseOwner("Jane", "ham", "6412883978");
		HouseOwner houseOwner3 = new HouseOwner("Simon", "Dowell", "6412883979");

		//add houses to house owners
		houseOwner1.getHouses().add(new House(3, "Fairfield, IA", houseOwner1));
		houseOwner2.getHouses().add(new House(6, "Ottumwa, IA", houseOwner2));
		houseOwner1.getHouses().add(new House(7, "Okalaswa, IA", houseOwner1));
		houseOwner2.getHouses().add(new House(1, "Cedar Rapids, IA", houseOwner2));
		houseOwner2.getHouses().add(new House(4, "Fairfield, IA", houseOwner2));
		houseOwner3.getHouses().add(new House(5, "Davenport, IA", houseOwner3));


		//save house owners
		houseOwner1 = houseOwnerService.save(houseOwner1);
		houseOwner2=houseOwnerService.save(houseOwner2);
		houseOwner3=houseOwnerService.save(houseOwner3);

		//update house owner1
		houseOwner1.setFirstName("Eric");
		houseOwner1.setPhoneNumber("622337891");

		houseOwnerService.update(houseOwner1);

		//sort house owners based on phone numbers
		houseOwnerService.findAll().stream().sorted(Comparator.comparing(HouseOwner::getPhoneNumber)).forEach(System.out::println);

	}
}
