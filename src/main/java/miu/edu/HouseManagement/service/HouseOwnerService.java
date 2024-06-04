package miu.edu.HouseManagement.service;

import lombok.RequiredArgsConstructor;
import miu.edu.HouseManagement.model.HouseOwner;
import miu.edu.HouseManagement.repository.HouseOwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseOwnerService {
    private final HouseOwnerRepository houseOwnerRepository;

    public HouseOwner save(HouseOwner houseOwner) {
        return houseOwnerRepository.save(houseOwner);
    }
    public List<HouseOwner> findAll() {
        return houseOwnerRepository.findAll();
    }
    public HouseOwner findById(Integer id) {
        return houseOwnerRepository.findById(id).orElse(null);
    }
    public HouseOwner update(HouseOwner houseOwner) {
        return houseOwnerRepository.save(houseOwner);
    }
    public void delete(HouseOwner houseOwner) {
        houseOwnerRepository.delete(houseOwner);
    }
}
