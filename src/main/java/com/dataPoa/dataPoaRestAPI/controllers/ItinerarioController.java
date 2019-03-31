package com.dataPoa.dataPoaRestAPI.controllers;

import com.dataPoa.dataPoaRestAPI.models.Itinerario;
import com.dataPoa.dataPoaRestAPI.services.servicesImpl.ItinerarioServiceImpl;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ItinerarioController {

    @Autowired
    private ItinerarioServiceImpl service;

    public ItinerarioController(ItinerarioServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/itinerarios/{idLinha}")
    public List<Itinerario> getItinerarioByLinha(@PathVariable("idLinha") String idLinha) throws IOException,
            JSONException {
        return service.getAllItinerariosByLinha(idLinha);
    }

    @PostMapping("/itinerarios/post-from-service/{idLinha}")
    public void saveItinerariosFromService(@PathVariable String idLinha) throws IOException, JSONException {
        service.saveItinerariosFromService(idLinha);
    }
}
