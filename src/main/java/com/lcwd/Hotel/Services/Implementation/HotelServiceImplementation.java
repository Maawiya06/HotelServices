package com.lcwd.Hotel.Services.Implementation;

import com.lcwd.Hotel.Entities.Hotel;
import com.lcwd.Hotel.HotelServiceApplication;
import com.lcwd.Hotel.Services.HotelServices;
import com.lcwd.Hotel.repositories.HotelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import java.util.List;

public class HotelServiceImplementation implements HotelServices {

    @Autowired
    private HotelRepositories hotelRepositories;

    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepositories.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepositories.findAll();
    }

    @Override
    public Hotel get(String hotelId) {
        return hotelRepositories.findById(hotelId).orElseThrow(() ->
                new ResourceNotFoundException("Hotel with given Id not found !!"));
    }
}
