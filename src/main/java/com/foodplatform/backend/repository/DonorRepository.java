package com.foodplatform.backend.repository;

import com.foodplatform.backend.Model.Donor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends MongoRepository<Donor,String> {
}
