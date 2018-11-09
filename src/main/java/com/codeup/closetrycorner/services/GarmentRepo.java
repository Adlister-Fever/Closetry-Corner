package com.codeup.closetrycorner.services;

import com.codeup.closetrycorner.models.Garment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GarmentRepo extends CrudRepository<Garment, Integer> {
    @Query("Select * from garments where user_id = ?1")
    List<Garment> findGarmentsByUser(int user_id);
}
