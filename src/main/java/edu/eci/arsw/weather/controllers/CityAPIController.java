package edu.eci.arsw.weather.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.weather.model.City;
import edu.eci.arsw.weather.services.CityServices;

@RestController
public class CityAPIController {

	@Autowired
	private CityServices cs;
	
	@RequestMapping(value="/cities",method = RequestMethod.GET)
	public ResponseEntity getAllCitiesController(){
		try {
			return new ResponseEntity<>(cs.getAllCities(),HttpStatus.ACCEPTED);
		}catch(Exception e){
			return new ResponseEntity<>("Hubo un error al buscar las ciudades",HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="/cities/{name}",method = RequestMethod.GET)
	public ResponseEntity getCityByName(@PathVariable("name")String cityName) {
		try {
			return new ResponseEntity<>(cs.getCityByName(cityName),HttpStatus.ACCEPTED);
		}catch(Exception e){
			return new ResponseEntity<>("No se encontraron datos de esa ciudad",HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="/cities", method = RequestMethod.POST)
	public ResponseEntity addNewCity(@RequestBody City city) {
		try {
			cs.addNewCity(city);
			return new ResponseEntity(HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>("No se pudo añadir la ciudad",HttpStatus.I_AM_A_TEAPOT);
		}
	}
}
