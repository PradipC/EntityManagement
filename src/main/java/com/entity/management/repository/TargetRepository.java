package com.entity.management.repository;

import com.entity.management.model.Target;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TargetRepository extends MongoRepository<Target, String> {

}
