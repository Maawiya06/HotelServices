package com.lcwd.Hotel.Controller;

import com.lcwd.Hotel.Entities.Hotel;
import com.lcwd.Hotel.Services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelServices hotelServices;
    // create
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelServices.create(hotel));
    }

    //get single api
    @GetMapping("/{hotel_id}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable  String hotel_id){
        return ResponseEntity.status(HttpStatus.OK).body(hotelServices.get(hotel_id));
    }

    // get all api
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        return ResponseEntity.ok(hotelServices.getAll());
    }
}
