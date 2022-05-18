package com.shorten.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shorten.model.URLObject;

@Component
public class MongoDBClient{
	
	@Autowired
	private URLRepository urlRepository;

	
	public void insertIntoDatabase(URLObject urlObject) {
		urlRepository.save(urlObject);
	}
	public boolean findIfExists(String shortUrlAlias) {
		return urlRepository.existsById(shortUrlAlias);
	}
	
	public URLObject fetchURLObject(String shortUrl) {
		// TODO throw exception if object not found from here
		Optional<URLObject> urlObject = urlRepository.findById(shortUrl);
		return urlObject.get();
	}
}
