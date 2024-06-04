package miu.edu.HouseManagement.repository;

import miu.edu.HouseManagement.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Integer> {
}
