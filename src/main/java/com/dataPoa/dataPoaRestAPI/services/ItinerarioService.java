package com.dataPoa.dataPoaRestAPI.services;

import com.dataPoa.dataPoaRestAPI.models.Itinerario;

import java.util.List;

public interface ItinerarioService {

    List<Itinerario> findByIdLinha(String idLinha);
}
