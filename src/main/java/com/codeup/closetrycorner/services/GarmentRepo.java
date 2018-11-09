package com.codeup.closetrycorner.services;

import com.codeup.closetrycorner.models.Garment;
import org.springframework.data.repository.CrudRepository;

public interface GarmentRepo extends CrudRepository<Garment, Integer> {
}
