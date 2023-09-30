package com.entity.management.repository;

import com.entity.management.model.Source;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SourceRepository extends MongoRepository<Source, String> {

}
