package com.lcwd.Hotel.repositories;

import com.lcwd.Hotel.Entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepositories extends JpaRepository <Hotel, String>{
}
