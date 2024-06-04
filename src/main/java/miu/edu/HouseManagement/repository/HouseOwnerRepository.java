package miu.edu.HouseManagement.repository;

import miu.edu.HouseManagement.model.HouseOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseOwnerRepository extends JpaRepository<HouseOwner, Integer> {
}
