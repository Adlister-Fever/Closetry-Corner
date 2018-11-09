package com.codeup.closetrycorner.services;

import com.codeup.closetrycorner.models.Garment;
import org.springframework.stereotype.Service;

@Service
public class GarmentSvc {
    private GarmentRepo garmentRepo;

    public Iterable<Garment> findAll() {
        return garmentRepo.findAll();
    }

    public Garment findOne(int id) {
        return garmentRepo.findOne(id);
    }

    public Garment saveGarment(Garment garment) {
        return garmentRepo.save(garment);
    }

//    public void saveGarment(Garment garment){
//        garmentRepo.save(garment);
//    }

    public Garment editGarment(Garment garment) {
        return garmentRepo.save(garment);
    }

    public void deleteGarment(Garment garment) {
        garmentRepo.delete(garment);
    }
}
