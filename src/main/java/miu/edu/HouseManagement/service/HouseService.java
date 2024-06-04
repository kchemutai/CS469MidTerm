package miu.edu.HouseManagement.service;

import lombok.RequiredArgsConstructor;
import miu.edu.HouseManagement.model.House;
import miu.edu.HouseManagement.repository.HouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseService {
    private final HouseRepository houseRepository;

    public House save(House house) {
        return houseRepository.save(house);
    }

    public List<House> findAll() {
        return houseRepository.findAll();
    }
    public House findById(Integer id) {
        return houseRepository.findById(id).orElse(null);
    }
    public House update(House house) {
        return houseRepository.save(house);
    }
    public void delete(House house) {
        houseRepository.delete(house);
    }
}
