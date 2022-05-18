package com.shorten.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.shorten.model.URLObject;

@Component
public interface URLRepository extends MongoRepository<URLObject, String>{

}
