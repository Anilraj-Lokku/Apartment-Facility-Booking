package com.appartment.facilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appartment.facilities.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
