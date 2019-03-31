package com.dataPoa.dataPoaRestAPI.repositories;

import com.dataPoa.dataPoaRestAPI.models.Itinerario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItinerarioRepository extends MongoRepository<Itinerario, String> {
}
